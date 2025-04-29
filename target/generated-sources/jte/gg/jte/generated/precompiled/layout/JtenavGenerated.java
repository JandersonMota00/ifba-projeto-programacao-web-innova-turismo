package gg.jte.generated.precompiled.layout;
@SuppressWarnings("unchecked")
public final class JtenavGenerated {
	public static final String JTE_NAME = "layout/nav.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,0,0,0,2,2,5,8,8,8,10,30,30,30,0,0,0,0};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtenavGenerated.class, "JtenavGenerated.bin", 2,18,124,20,149);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	private static final byte[] TEXT_PART_BINARY_3 = BINARY_CONTENT.get(3);
	private static final byte[] TEXT_PART_BINARY_4 = BINARY_CONTENT.get(4);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.example.agencia_viagens.dto.Page page) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
		jteOutput.setContext("a", null);
		jteOutput.writeUserContent(page == null ? "" : page.title());
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.example.agencia_viagens.dto.Page page = (com.example.agencia_viagens.dto.Page)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
