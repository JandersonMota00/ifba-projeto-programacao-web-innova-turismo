package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.Page;
import com.example.agencia_viagens.dto.PacoteDTO;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JteexibicaopacoteGenerated {
	public static final String JTE_NAME = "exibicao-pacote.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,6,6,8,8,18,18,19,19,25,25,25,26,26,26,29,29,29,30,30,30,33,33,33,33,40,40,40,40,47,57,57,58,58,60,60,60,60,60,4,4,4,4};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteexibicaopacoteGenerated.class, "JteexibicaopacoteGenerated.bin", 2,261,10,220,30,111,46,112,322,289,58,6,14);
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
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<PacoteDTO> pacotes) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				if (pacotes != null) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
					for (PacoteDTO dto : pacotes) {
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(dto.getTitulo());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getDescricao());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
						jteOutput.setContext("h3", null);
						jteOutput.writeUserContent(dto.getDataPartida());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
						jteOutput.setContext("h3", null);
						jteOutput.writeUserContent(dto.getDataChegada());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getIdPacote());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getIdPacote());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
					}
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_12);
			}
		}, new Page("Gerenciamento de Pacote"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<PacoteDTO> pacotes = (List<PacoteDTO>)params.get("pacotes");
		render(jteOutput, jteHtmlInterceptor, pacotes);
	}
}
