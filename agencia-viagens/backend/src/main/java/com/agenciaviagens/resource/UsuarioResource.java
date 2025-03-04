package com.agenciaviagens.resource;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.agenciaviagens.event.RecursoCriadoEvent;
import com.agenciaviagens.model.Telefone;
import com.agenciaviagens.model.Usuario;
import com.agenciaviagens.repository.UsuarioRepository;
import com.agenciaviagens.repository.filter.UsuarioFilter;
import com.agenciaviagens.service.UsuarioService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
// @CrossOrigin(origins = "*")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	/*
	@GetMapping
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }
	
	@GetMapping("/pesquisar")
	public List<Usuario> pesquisar(UsuarioFilter usuarioFilter) {
		return usuarioRepository.filtrar(usuarioFilter);
	}
	*/
	
	@GetMapping
    public List<Usuario> listarOuPesquisar(UsuarioFilter usuarioFilter) {
        return (usuarioFilter != null && possuiFiltro(usuarioFilter))
                ? usuarioRepository.filtrar(usuarioFilter)
                : usuarioRepository.findAll();
    }

    private boolean possuiFiltro(UsuarioFilter filter) {
        return StringUtils.isNotBlank(filter.getNome()) || 
            StringUtils.isNotBlank(filter.getEmail()) || 
            StringUtils.isNotBlank(filter.getTelefone());
    }
	
	@PostMapping
	public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario, HttpServletResponse response) {
		// Associa cada telefone ao usuário antes de salvar
		if (usuario.getTelefones() != null) {
			usuario.getTelefones().forEach(telefone -> telefone.setUsuario(usuario));
		}
		
		Usuario usuarioSalva = usuarioRepository.save(usuario);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, usuarioSalva.getIdUsuario()));

		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalva);
	}
	
	@GetMapping("/{idUsuario}")
	public ResponseEntity<Usuario> buscarPeloId(@PathVariable Long idUsuario) {
	    Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);

		if (usuario != null) {
			// Garante que a lista de telefones seja carregada antes de retornar o objeto
			usuario.getTelefones().size();
			return ResponseEntity.ok(usuario);
		}

		return usuario != null ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
	    //return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{idUsuario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long idUsuario) {
	    usuarioRepository.deleteById(idUsuario);
	}

	@PutMapping("/{idUsuario}")
	public ResponseEntity<Usuario> atualizar(@PathVariable Long idUsuario, @Valid @RequestBody Usuario usuario) {
	    /*Usuario usuarioSalva = usuarioService.atualizar(idUsuario, usuario);
	    return ResponseEntity.ok(usuarioSalva);*/

		return usuarioRepository.findById(idUsuario).map(usuarioExistente -> {
			// Atualiza os dados básicos do usuário
			usuarioExistente.setNome(usuario.getNome());
			usuarioExistente.setEmail(usuario.getEmail());
			usuarioExistente.setAtivo(usuario.getAtivo());
	
			// Atualiza os telefones
			if (usuario.getTelefones() != null) {
				usuario.getTelefones().forEach(telefone -> telefone.setUsuario(usuarioExistente));
				usuarioExistente.getTelefones().clear();
				usuarioExistente.getTelefones().addAll(usuario.getTelefones());
			}
	
			Usuario usuarioAtualizado = usuarioRepository.save(usuarioExistente);
			return ResponseEntity.ok(usuarioAtualizado);
		}).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{idUsuario}/email")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarPropriedadeEmail(@PathVariable Long idUsuario, @RequestBody String email) {
	    usuarioService.atualizarPropriedadeEmail(idUsuario, email);
	}
	
	@PutMapping("/{idUsuario}/telefones")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarPropriedadeTelefone(@PathVariable Long idUsuario, @RequestBody List<Telefone> telefones) {
	    //usuarioService.atualizarTelefones(idUsuario, telefones);

		usuarioRepository.findById(idUsuario).ifPresent(usuario -> {
			// Remove telefones antigos
			usuario.getTelefones().clear();
			
			// Associa os novos telefones ao usuário
			telefones.forEach(telefone -> telefone.setUsuario(usuario));
			usuario.getTelefones().addAll(telefones);
			
			usuarioRepository.save(usuario);
		});
	}

	@PutMapping("/{idUsuario}/ativo")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarPropriedadeAtivo(@PathVariable Long idUsuario, @RequestBody Boolean ativo) {
	    usuarioService.atualizarPropriedadeAtivo(idUsuario, ativo);
	}
	
}
