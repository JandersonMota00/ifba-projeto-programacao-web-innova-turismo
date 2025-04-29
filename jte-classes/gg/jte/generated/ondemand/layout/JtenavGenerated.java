package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JtenavGenerated {
	public static final String JTE_NAME = "layout/nav.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,2,2,5,8,8,8,10,30,30,30,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.example.agencia_viagens.dto.Page page) {
		jteOutput.writeContent("\r\n");
		jteOutput.writeContent("\r\n    \r\n\r\n        ");
		jteOutput.writeContent("\r\n        \r\n            <i class='bx bx-menu'></i>\r\n            <a href=\"#\" class=\"a nav-link\" aria-label=\"Página inicial\">");
		jteOutput.setContext("a", null);
		jteOutput.writeUserContent(page == null ? "" : page.title());
		jteOutput.writeContent("</a>\r\n\r\n            ");
		jteOutput.writeContent("\r\n\r\n            <a href=\"#\" class=\"a profile\">\r\n                <i class='bx bxs-user-circle placeholder'></i>\r\n            </a>\r\n\r\n       \r\n        ");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.example.agencia_viagens.dto.Page page = (com.example.agencia_viagens.dto.Page)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
