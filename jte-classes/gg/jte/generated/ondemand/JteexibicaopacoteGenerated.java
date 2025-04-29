package gg.jte.generated.ondemand;
import com.example.agencia_viagens.dto.Page;
import com.example.agencia_viagens.dto.PacoteDTO;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteexibicaopacoteGenerated {
	public static final String JTE_NAME = "exibicao-pacote.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,6,6,8,8,18,18,19,19,25,25,25,26,26,26,29,29,29,30,30,30,33,33,33,33,40,40,40,40,47,57,57,58,58,60,60,60,60,60,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<PacoteDTO> pacotes) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<section class=\"secao-pesquisa\">\r\n    <a href=\"/pacotes/novo\" class=\"btn-cadastro\">\r\n                <i class='bx bx-plus'></i>\r\n                <span class=\"texto\">Cadastrar Novo</span>\r\n            </a>\r\n</section>\r\n\r\n<section class=\"cards-section\">\r\n    ");
				if (pacotes != null) {
					jteOutput.writeContent("\r\n        ");
					for (PacoteDTO dto : pacotes) {
						jteOutput.writeContent("\r\n            <article class=\"card\">\r\n                <div class=\"img-viagem\">\r\n                    <i class='bx bxs-plane' ></i>\r\n                </div>\r\n                <div class=\"descricao\">\r\n                    <h2>");
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(dto.getTitulo());
						jteOutput.writeContent("</h2>\r\n                    <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getDescricao());
						jteOutput.writeContent("</p>\r\n                </div>\r\n                <div class=\"dados-viagem\">\r\n                    <h3>Data de ida: ");
						jteOutput.setContext("h3", null);
						jteOutput.writeUserContent(dto.getDataPartida());
						jteOutput.writeContent("</h3>\r\n                    <h3>Data de volta: ");
						jteOutput.setContext("h3", null);
						jteOutput.writeUserContent(dto.getDataChegada());
						jteOutput.writeContent("</h3>\r\n                </div>\r\n                <div class=\"botoes\">\r\n                    <a href=\"/pacotes/edit/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getIdPacote());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">\r\n                        <button class=\"botao-editar\">\r\n                            \r\n                            <i class='bx bxs-edit-alt' style=\"color: var(--light);\"></i>\r\n                            Editar\r\n                        </button>\r\n                    </a>\r\n                    <a href=\"/pacotes/remover/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getIdPacote());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">\r\n                        <button class=\"botao-deletar\">\r\n                           \r\n                            <i class='bx bx-x' style=\"color: var(--light);\"></i>\r\n                            Deletar\r\n                        </button>\r\n                    </a>\r\n                    ");
						jteOutput.writeContent("\r\n                </div>\r\n            </article>\r\n        ");
					}
					jteOutput.writeContent("\r\n    ");
				}
				jteOutput.writeContent("\r\n</section>\r\n");
			}
		}, new Page("Gerenciamento de Pacote"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<PacoteDTO> pacotes = (List<PacoteDTO>)params.get("pacotes");
		render(jteOutput, jteHtmlInterceptor, pacotes);
	}
}
