package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.Page;
import com.example.agencia_viagens.dto.ClienteDTO;
@SuppressWarnings("unchecked")
public final class JtecadastrousuariosclienteGenerated {
	public static final String JTE_NAME = "cadastro-usuarios-cliente.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,5,5,7,7,10,12,12,13,13,13,13,13,13,13,13,13,16,16,16,16,16,16,16,16,16,20,20,20,20,20,20,20,20,20,24,24,24,24,24,24,24,24,24,30,30,30,30,30,30,30,30,30,45,45,45,45,45,45,45,45,45,64,64,64,64,64,64,64,64,64,68,68,68,68,68,68,68,68,68,74,74,74,74,74,74,74,74,74,78,78,78,78,78,78,78,78,78,84,84,84,84,84,84,84,84,84,88,88,88,88,88,88,88,88,88,96,96,96,96,96,3,3,3,3};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtecadastrousuariosclienteGenerated.class, "JtecadastrousuariosclienteGenerated.bin", 2,14,54,15,9,1,155,8,1,221,8,1,230,8,1,314,8,1,884,8,1,924,8,1,221,8,1,281,8,1,221,8,1,301,8,1,223,8,1,213);
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
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ClienteDTO cli) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
				var formAction = cli.getId() != null ? "/clientes/edit/" + cli.getId() : "/clientes/novo";
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
				var __jte_html_attribute_0 = formAction;
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
				var __jte_html_attribute_1 = cli.getId();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
				var __jte_html_attribute_2 = cli.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
				var __jte_html_attribute_3 = cli.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_14);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_15);
				var __jte_html_attribute_4 = cli.getTelefone1();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_16);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_17);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_18);
				var __jte_html_attribute_5 = cli.getTelefone2();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_19);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_5);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_20);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_21);
				var __jte_html_attribute_6 = cli.getCep();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_22);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_6);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_23);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_24);
				var __jte_html_attribute_7 = cli.getEstado();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_25);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_7);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_26);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_27);
				var __jte_html_attribute_8 = cli.getCidade();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_8)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_28);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_8);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_29);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_30);
				var __jte_html_attribute_9 = cli.getBairro();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_9)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_31);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_9);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_32);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_33);
				var __jte_html_attribute_10 = cli.getLogradouro();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_10)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_34);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_10);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_35);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_36);
				var __jte_html_attribute_11 = cli.getNumero();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_11)) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_37);
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_11);
					jteOutput.setContext("input", null);
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_38);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_39);
			}
		}, new Page("Cadastro de Cliente"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ClienteDTO cli = (ClienteDTO)params.getOrDefault("cli", new ClienteDTO());
		render(jteOutput, jteHtmlInterceptor, cli);
	}
}
