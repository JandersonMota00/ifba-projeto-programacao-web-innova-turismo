package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.ClienteDTO;
import com.example.agencia_viagens.dto.Page;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteexibicaousuarioclienteGenerated {
	public static final String JTE_NAME = "exibicao-usuario-cliente.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,6,6,8,8,12,20,22,22,23,23,30,30,30,31,31,31,32,32,32,32,32,32,33,33,33,33,33,33,36,36,36,36,40,40,40,40,40,47,47,48,48,51,51,51,51,51,4,4,4,4};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteexibicaousuarioclienteGenerated.class, "JteexibicaousuarioclienteGenerated.bin", 2,57,255,57,18,335,49,53,2,54,2,149,235,25,262,14,34);
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
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<ClienteDTO> clientes) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
				if (clientes != null) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
					for (ClienteDTO dto : clientes) {
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(dto.getNome());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getEmail());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getTelefone1());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getTipoTelefone1());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getTelefone2());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getTipoTelefone2());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_14);
					}
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_15);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_16);
			}
		}, new Page("Gerenciamento de Cliente"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<ClienteDTO> clientes = (List<ClienteDTO>)params.get("clientes");
		render(jteOutput, jteHtmlInterceptor, clientes);
	}
}
