package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.UsuarioDTO;
import com.example.agencia_viagens.dto.Page;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JtecadastrousuarioGenerated {
	public static final String JTE_NAME = "cadastro-usuario.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,7,7,10,10,11,11,11,12,12,15,15,17,19,19,21,21,22,22,22,22,22,22,22,22,22,28,28,28,28,28,28,28,28,28,31,31,31,31,31,31,31,31,31,35,35,35,35,35,35,35,35,35,39,39,39,39,39,39,39,39,39,50,50,50,50,50,4,5,5,5,5};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtecadastrousuarioGenerated.class, "JtecadastrousuarioGenerated.bin", 2,57,14,15,21,4,54,15,9,1,221,8,1,220,8,1,191,8,1,217,8,1,310);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	private static final byte[] TEXT_PART_BINARY_3 = BINARY_CONTENT.get(3);
	private static final byte[] TEXT_PART_BINARY_4 = BINARY_CONTENT.get(4);
	private static final byte[] TEXT_PART_BINARY_5 = BINARY_CONTENT.get(5);
	private static final byte[] TEXT_PART_BINARY_6 = BINARY_CONTENT.get(6);
	private static final byte[] TEXT_PART_BINARY_7 = BINARY_CONTENT.get(7);
	private static final byte[] TEXT_PART_BINARY_8 = BINARY_CONTENT.get(8);
	private static final byte[] TEXT_PART_BINARY_9 = BINARY_CONTENT.get(9);
	private static final byte[] TEXT_PART_BINARY_10 = BINARY_CONTENT.get(10);
	private static final byte[] TEXT_PART_BINARY_11 = BINARY_CONTENT.get(11);
	private static final byte[] TEXT_PART_BINARY_12 = BINARY_CONTENT.get(12);
	private static final byte[] TEXT_PART_BINARY_13 = BINARY_CONTENT.get(13);
	private static final byte[] TEXT_PART_BINARY_14 = BINARY_CONTENT.get(14);
	private static final byte[] TEXT_PART_BINARY_15 = BINARY_CONTENT.get(15);
	private static final byte[] TEXT_PART_BINARY_16 = BINARY_CONTENT.get(16);
	private static final byte[] TEXT_PART_BINARY_17 = BINARY_CONTENT.get(17);
	private static final byte[] TEXT_PART_BINARY_18 = BINARY_CONTENT.get(18);
	private static final byte[] TEXT_PART_BINARY_19 = BINARY_CONTENT.get(19);
	private static final byte[] TEXT_PART_BINARY_20 = BINARY_CONTENT.get(20);
	private static final byte[] TEXT_PART_BINARY_21 = BINARY_CONTENT.get(21);
	private static final byte[] TEXT_PART_BINARY_22 = BINARY_CONTENT.get(22);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsuarioDTO user, List<String> errors) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		if (errors != null && !errors.isEmpty()) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
			for (var error : errors) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(error);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
			}
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
		}
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
				var formAction = user.getId() != null ? "/user/edit/" + user.getId() : "/user/save";
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
				var __jte_html_attribute_0 = formAction;
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
				var __jte_html_attribute_1 = user.getId();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
				var __jte_html_attribute_2 = user.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_14);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_15);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_16);
				var __jte_html_attribute_3 = user.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_17);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_18);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_19);
				var __jte_html_attribute_4 = user.getSenha();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_20);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_21);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_22);
			}
		}, new Page("Cadastro de Funcionário"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsuarioDTO user = (UsuarioDTO)params.getOrDefault("user", new UsuarioDTO());
		List<String> errors = (List<String>)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, user, errors);
	}
}
