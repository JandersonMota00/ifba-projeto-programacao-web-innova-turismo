package gg.jte.generated.ondemand;
import com.example.agencia_viagens.dto.Page;
import com.example.agencia_viagens.dto.PacoteDTO;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteformspacoteGenerated {
	public static final String JTE_NAME = "forms-pacote.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,7,7,7,10,10,11,11,11,12,12,15,15,17,19,19,23,23,24,24,24,24,24,24,24,24,24,29,29,29,29,29,29,29,29,29,32,32,32,32,32,32,32,32,32,35,35,35,35,35,35,35,35,35,38,38,38,38,38,38,38,38,38,41,41,41,41,41,41,41,41,41,50,50,50,50,50,50,50,50,50,53,53,53,53,53,53,53,53,53,56,56,56,56,56,56,56,56,56,59,59,59,59,59,59,59,59,59,62,62,62,62,62,62,62,62,62,75,75,75,75,75,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, PacoteDTO pacotes, List<String> errors) {
		jteOutput.writeContent("\r\n");
		if (errors != null && !errors.isEmpty()) {
			jteOutput.writeContent("\r\n<div style=\"background-color: red\">\r\n    <ul>\r\n        ");
			for (var error : errors) {
				jteOutput.writeContent("\r\n        <li>");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(error);
				jteOutput.writeContent("</li>\r\n        ");
			}
			jteOutput.writeContent("\r\n    </ul>\r\n</div>\r\n");
		}
		jteOutput.writeContent("\r\n\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    \r\n\r\n    <section class=\"formulario-container\">\r\n        ");
				var formAction = pacotes.getIdPacote() != null ? "/pacotes/edit/" + pacotes.getIdPacote() : "/pacotes/save";
				jteOutput.writeContent("\r\n        <form");
				var __jte_html_attribute_0 = formAction;
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n            <div class=\"campos-formulario\">\r\n                <fieldset>\r\n                    <legend>Informações do Pacote</legend>\r\n\r\n                    <input type=\"hidden\" name=\"idPacote\"");
				var __jte_html_attribute_1 = pacotes.getIdPacote();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                    <div class=\"caixa lado-a-lado\">\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Título *\" name=\"titulo\"");
				var __jte_html_attribute_2 = pacotes.getTitulo();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Descrição *\" name=\"descricao\"");
				var __jte_html_attribute_3 = pacotes.getDescricao();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" data-type=\"date\" placeholder=\"Data de Partida *\" name=\"dataPartida\"");
				var __jte_html_attribute_4 = pacotes.getDataPartida();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" data-type=\"date\" placeholder=\"Data de Chegada *\" name=\"dataChegada\"");
				var __jte_html_attribute_5 = pacotes.getDataChegada();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_5);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n                        </div>\r\n                    </div>\r\n                </fieldset>\r\n\r\n                <fieldset>\r\n                    <legend>Detalhes do Pacote</legend>\r\n                    <div class=\"caixa lado-a-lado\">\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Estado\" name=\"estado\"");
				var __jte_html_attribute_6 = pacotes.getEstado();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_6);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Hospedagem\" name=\"hospedagem\"");
				var __jte_html_attribute_7 = pacotes.getHospedagem();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_7);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Passeios\" name=\"passeios\"");
				var __jte_html_attribute_8 = pacotes.getPasseios();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_8)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_8);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Translado\" name=\"translado\"");
				var __jte_html_attribute_9 = pacotes.getTranslado();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_9)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_9);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                        </div>\r\n                        <div class=\"caixa-input\">\r\n                            <input type=\"text\" placeholder=\"Valor\" name=\"valor\"");
				var __jte_html_attribute_10 = pacotes.getValor();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_10)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_10);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n                        </div>\r\n                    </div>\r\n                </fieldset>\r\n            </div>\r\n\r\n            <button class=\"btn-salvar\">\r\n                <i class='bx bxs-save'></i> Salvar\r\n            </button>\r\n        </form>\r\n    </section>\r\n\r\n    \r\n");
			}
		}, new Page("Cadastro de Pacote"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		PacoteDTO pacotes = (PacoteDTO)params.getOrDefault("pacotes", new PacoteDTO());
		List<String> errors = (List<String>)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, pacotes, errors);
	}
}
