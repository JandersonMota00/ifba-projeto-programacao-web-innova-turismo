package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.Page;
import com.example.agencia_viagens.dto.PacoteDTO;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteformspacoteGenerated {
	public static final String JTE_NAME = "forms-pacote.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,7,7,7,10,10,11,11,11,12,12,15,15,17,19,19,23,23,24,24,24,24,24,24,24,24,24,29,29,29,29,29,29,29,29,29,32,32,32,32,32,32,32,32,32,35,35,35,35,35,35,35,35,35,38,38,38,38,38,38,38,38,38,41,41,41,41,41,41,41,41,41,50,50,50,50,50,50,50,50,50,53,53,53,53,53,53,53,53,53,56,56,56,56,56,56,56,56,56,59,59,59,59,59,59,59,59,59,62,62,62,62,62,62,62,62,62,75,75,75,75,75,4,5,5,5,5};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteformspacoteGenerated.class, "JteformspacoteGenerated.bin", 2,57,14,15,21,4,62,15,9,1,210,8,1,191,8,1,186,8,1,209,8,1,209,8,1,373,8,1,175,8,1,171,8,1,173,8,1,165,8,1,271);
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
	private static final byte[] TEXT_PART_BINARY_23 = BINARY_CONTENT.get(23);
	private static final byte[] TEXT_PART_BINARY_24 = BINARY_CONTENT.get(24);
	private static final byte[] TEXT_PART_BINARY_25 = BINARY_CONTENT.get(25);
	private static final byte[] TEXT_PART_BINARY_26 = BINARY_CONTENT.get(26);
	private static final byte[] TEXT_PART_BINARY_27 = BINARY_CONTENT.get(27);
	private static final byte[] TEXT_PART_BINARY_28 = BINARY_CONTENT.get(28);
	private static final byte[] TEXT_PART_BINARY_29 = BINARY_CONTENT.get(29);
	private static final byte[] TEXT_PART_BINARY_30 = BINARY_CONTENT.get(30);
	private static final byte[] TEXT_PART_BINARY_31 = BINARY_CONTENT.get(31);
	private static final byte[] TEXT_PART_BINARY_32 = BINARY_CONTENT.get(32);
	private static final byte[] TEXT_PART_BINARY_33 = BINARY_CONTENT.get(33);
	private static final byte[] TEXT_PART_BINARY_34 = BINARY_CONTENT.get(34);
	private static final byte[] TEXT_PART_BINARY_35 = BINARY_CONTENT.get(35);
	private static final byte[] TEXT_PART_BINARY_36 = BINARY_CONTENT.get(36);
	private static final byte[] TEXT_PART_BINARY_37 = BINARY_CONTENT.get(37);
	private static final byte[] TEXT_PART_BINARY_38 = BINARY_CONTENT.get(38);
	private static final byte[] TEXT_PART_BINARY_39 = BINARY_CONTENT.get(39);
	private static final byte[] TEXT_PART_BINARY_40 = BINARY_CONTENT.get(40);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, PacoteDTO pacotes, List<String> errors) {
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
				var formAction = pacotes.getIdPacote() != null ? "/pacotes/edit/" + pacotes.getIdPacote() : "/pacotes/save";
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
				var __jte_html_attribute_1 = pacotes.getIdPacote();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
				var __jte_html_attribute_2 = pacotes.getTitulo();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_14);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_15);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_16);
				var __jte_html_attribute_3 = pacotes.getDescricao();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_17);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_18);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_19);
				var __jte_html_attribute_4 = pacotes.getDataPartida();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_20);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_21);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_22);
				var __jte_html_attribute_5 = pacotes.getDataChegada();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_23);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_5);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_24);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_25);
				var __jte_html_attribute_6 = pacotes.getEstado();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_26);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_6);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_27);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_28);
				var __jte_html_attribute_7 = pacotes.getHospedagem();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_29);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_7);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_30);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_31);
				var __jte_html_attribute_8 = pacotes.getPasseios();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_8)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_32);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_8);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_33);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_34);
				var __jte_html_attribute_9 = pacotes.getTranslado();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_9)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_35);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_9);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_36);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_37);
				var __jte_html_attribute_10 = pacotes.getValor();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_10)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_38);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_10);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_39);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_40);
			}
		}, new Page("Cadastro de Pacote"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		PacoteDTO pacotes = (PacoteDTO)params.getOrDefault("pacotes", new PacoteDTO());
		List<String> errors = (List<String>)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, pacotes, errors);
	}
}
