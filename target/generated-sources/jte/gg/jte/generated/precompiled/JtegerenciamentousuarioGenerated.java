package gg.jte.generated.precompiled;
import com.example.agencia_viagens.dto.UsuarioDTO;
import com.example.agencia_viagens.dto.Page;
import java.util.List;
@SuppressWarnings("unchecked")
public final class JtegerenciamentousuarioGenerated {
	public static final String JTE_NAME = "gerenciamento-usuario.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,6,6,8,8,12,20,22,22,23,23,30,30,30,31,31,31,34,34,34,34,37,37,37,37,43,43,44,44,47,47,47,47,47,4,4,4,4};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtegerenciamentousuarioGenerated.class, "JtegerenciamentousuarioGenerated.bin", 2,58,255,57,18,328,42,144,192,252,14,34);
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
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<UsuarioDTO> usuarios) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
				if (usuarios != null) {
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
					for (UsuarioDTO dto : usuarios) {
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(dto.getNome());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(dto.getEmail());
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_7);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_8);
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(dto.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeBinaryContent(TEXT_PART_BINARY_9);
					}
					jteOutput.writeBinaryContent(TEXT_PART_BINARY_10);
				}
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_11);
			}
		}, new Page("Gerenciamento de Funcionário"));
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<UsuarioDTO> usuarios = (List<UsuarioDTO>)params.get("usuarios");
		render(jteOutput, jteHtmlInterceptor, usuarios);
	}
}
