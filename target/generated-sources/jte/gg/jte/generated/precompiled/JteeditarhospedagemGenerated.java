package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.Page;
import com.example.agencia_viagens.model.Hospedagem;
@SuppressWarnings("unchecked")
public final class JteeditarhospedagemGenerated {
	public static final String JTE_NAME = "editar-hospedagem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,6,6,11,11,11,11,17,17,17,17,17,17,17,17,17,21,21,21,21,21,21,21,21,21,27,27,27,27,27,27,27,27,27,37,37,37,37,37,37,37,37,37,41,41,41,41,41,41,41,41,41,47,47,47,47,47,47,47,47,47,55,55,55,55,55,2,2,2,2};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteeditarhospedagemGenerated.class, "JteeditarhospedagemGenerated.bin", 2,94,314,8,1,224,8,1,293,8,1,387,8,1,212,8,1,271,8,1,235);
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
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Hospedagem hospedagem) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				jteOutput.setContext("form", "action");
				jteOutput.writeUserContent(hospedagem.getId());
				jteOutput.setContext("form", null);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
				var __jte_html_attribute_0 = hospedagem.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
				var __jte_html_attribute_1 = hospedagem.getTelefone1();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
				var __jte_html_attribute_2 = hospedagem.getTelefone2();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
				var __jte_html_attribute_3 = hospedagem.getLogradouro();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_14);
				var __jte_html_attribute_4 = hospedagem.getNumero();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_15);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_16);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_17);
				var __jte_html_attribute_5 = hospedagem.getCidade();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_18);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_5);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_19);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_20);
			}
		}, new Page("Editar Hospedagem"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Hospedagem hospedagem = (Hospedagem)params.get("hospedagem");
		render(jteOutput, jteHtmlInterceptor, hospedagem);
	}
}
