package gg.jte.generated.precompiled;
@SuppressWarnings("unchecked")
public final class JteformshospedagemGenerated {
	public static final String JTE_NAME = "forms-hospedagem.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,0,0,0,0,5,7,94,94,94,94,94,94,94,94};
	private static final gg.jte.runtime.BinaryContent BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteformshospedagemGenerated.class, "JteformshospedagemGenerated.bin", 52,8,4203);
	private static final byte[] TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0);
	private static final byte[] TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1);
	private static final byte[] TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2);
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.precompiled.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_0);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_1);
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_2);
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
