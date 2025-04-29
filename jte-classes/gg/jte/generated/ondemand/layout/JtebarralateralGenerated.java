package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JtebarralateralGenerated {
	public static final String JTE_NAME = "layout/barra-lateral.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,3,7,15,23,31,39,51,61,61,61,61,61,61};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n    \r\n        <a href=\"/home\" class=\"marca\"></a>\r\n        ");
		jteOutput.writeContent("\r\n\r\n        <ul class=\"barra-menu top\">\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <li class=\"li\">\r\n                <a href=\"/home\" class=\"a\">\r\n                    <i class='bx bxs-home'></i>\r\n                    <span class=\"texto\">Home Page</span>\r\n                </a>\r\n            </li>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <li class=\"li\">\r\n                <a href=\"/pacotes\" class=\"a\">\r\n                    <i class='bx bxs-plane'></i>\r\n                    <span class=\"texto\">Pacotes</span>\r\n                </a>\r\n            </li>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <li class=\"li\">\r\n                <a href=\"/hospedagens\" class=\"a\">\r\n                    <i class='bx bxs-buildings'></i>\r\n                    <span class=\"texto\">Hospedagens</span>\r\n                </a>\r\n            </li>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <li class=\"li\">\r\n                <a href=\"/user\" class=\"a\">\r\n                    <i class='bx bxs-user-account bx-flip-horizontal'></i>\r\n                    <span class=\"texto\">Funcionarios</span>\r\n                </a>\r\n            </li>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <li class=\"li\">\r\n                <a href=\"/clientes\" class=\"a\">\r\n                    <i class='bx bxs-user-circle bx-flip-horizontal'></i>\r\n                    <span class=\"texto\">Clientes</span>\r\n                </a>\r\n            </li>\r\n\r\n        </ul>\r\n\r\n        <ul class=\"barra-menu\">\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <li class=\"li\">\r\n                <a href=\"/logout\" class=\"a logout\">\r\n                    <i class='bx bxs-log-out-circle'></i>\r\n                    <span class=\"texto\">Sair</span>\r\n                </a>\r\n            </li>\r\n\r\n        </ul>\r\n\r\n    ");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
