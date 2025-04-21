@import com.agenciaviagens.model.Hospedagem
@import java.util.List
@param List<Hospedagem> hospedagens
@param String search

@template.layout.main(content = @`
    <section class="secao-pesquisa">
        <form action="/hospedagens" method="get" class="formulario-pesquisa">
            <div class="entrada-pesquisa">
                <img src="/assets/icons/botao-de-pesquisar.svg" alt="Ícone de Pesquisa" class="icone-pesquisa">
                <input type="text" placeholder="Pesquise" name="search" value="${search}"
                       onkeydown="if(event.key === 'Enter'){ this.form.submit(); }">
            </div>
        </form>
        <a href="/hospedagens/form" class="add-butao">+</a>
    </section>

    @for(hospedagem in hospedagens)
        <div class="bloco-exibicao">
            <!-- Foto -->
            <div class="upload-foto">
                @if(hospedagem.foto != null && hospedagem.foto.length > 0)
                    <img src="data:image/jpeg;base64,${java.util.Base64.getEncoder().encodeToString(hospedagem.foto)}"
                         alt="Foto da Hospedagem">
                @else
                    <p>Sem foto</p>
                @endif
            </div>

            <!-- Informações -->
            <div class="info-hospedagem">
                <h2 class="nome-hospedagem">${hospedagem.nome}</h2>

                <!-- Exibe todos os telefones -->
                <div class="descricao-hospedagem">
                    @for(telefone in hospedagem.telefones)
                        <p>${telefone.numero} (${telefone.tipo})</p>
                    @endfor
                </div>
            </div>

            <!-- Endereço -->
            <div class="endereco-hospedagem">
                <p>
                    Endereço: ${hospedagem.endereco.logradouro},
                    ${hospedagem.endereco.numero} -
                    ${hospedagem.endereco.bairro},
                    ${hospedagem.endereco.cidade}/${hospedagem.endereco.estado}
                </p>
            </div>

            <!-- Ações -->
            <div class="acoes-hospedagem">
                <a href="/hospedagens/editar/${hospedagem.idHospedagem}" class="btn-editar">Editar</a>
                <form action="/hospedagens/excluir/${hospedagem.idHospedagem}" method="post" style="display: inline;">
                    <button type="submit" class="btn-deletar">Deletar</button>
                </form>
                <button class="btn-habilitar">Habilitar</button>
            </div>
        </div>
    @endfor
`)