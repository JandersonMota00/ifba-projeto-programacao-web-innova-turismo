package gg.jte.generated.precompiled;
@SuppressWarnings("unchecked")
public final class JteerrorGenerated {
	public static final String JTE_NAME = "error.jte";
	public static final int[] JTE_LINE_INFO = {17,17,17,17,17,17,17,17,17,17,17,17,17,17};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteerrorGenerated.class, "JteerrorGenerated.bin", 559);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
