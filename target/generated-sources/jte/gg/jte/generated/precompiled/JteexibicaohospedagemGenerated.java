package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.HospedagemDTO;
import com.example.agencia_viagens.dto.Page;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteexibicaohospedagemGenerated {
	public static final String JTE_NAME = "exibicao-hospedagem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,6,6,8,8,19,19,20,20,27,27,27,28,28,28,29,29,29,30,30,30,30,30,30,30,30,30,33,33,33,33,36,36,36,36,42,42,43,43,46,46,46,46,46,4,4,4,4};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteexibicaohospedagemGenerated.class, "JteexibicaohospedagemGenerated.bin", 2,288,14,299,50,49,48,2,3,141,187,228,10,20);
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
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<HospedagemDTO> hospedagens) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				if (hospedagens != null) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
					for (HospedagemDTO dto : hospedagens) {
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(dto.getNome());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getTelefone1());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getTelefone2());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getLogradouro());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getNumero());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getCidade());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
					}
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_13);
			}
		}, new Page("Gerenciamento de Hospedagem"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<HospedagemDTO> hospedagens = (List<HospedagemDTO>)params.get("hospedagens");
		render(jteOutput, jteHtmlInterceptor, hospedagens);
	}
}
