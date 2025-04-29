package gg.jte.generated.precompiled.layout;
@SuppressWarnings("unchecked")
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,0,0,0,0,0,28,28,28,28,33,33,36,39,39,45,45,45,49,52,52,52,0,1,1,1,1};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtemainGenerated.class, "JtemainGenerated.bin", 1349,87,28,65,77,45,20);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	private static final byte[] TEXT_PART_BINARY_3 = BINARY_CONTENT.get(3);
	private static final byte[] TEXT_PART_BINARY_4 = BINARY_CONTENT.get(4);
	private static final byte[] TEXT_PART_BINARY_5 = BINARY_CONTENT.get(5);
	private static final byte[] TEXT_PART_BINARY_6 = BINARY_CONTENT.get(6);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content, com.example.agencia_viagens.dto.Page page) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(page == null ? "INNOVA TURISMO" : page.title());
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
		gg.jte.generated.precompiled.layout.JtebarralateralGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_3);
		gg.jte.generated.precompiled.layout.JtenavGenerated.render(jteOutput, jteHtmlInterceptor, page);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_4);
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_5);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_6);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		com.example.agencia_viagens.dto.Page page = (com.example.agencia_viagens.dto.Page)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, content, page);
	}
}
