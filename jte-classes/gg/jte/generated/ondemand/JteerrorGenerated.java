package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteerrorGenerated {
	public static final String JTE_NAME = "error.jte";
	public static final int[] JTE_LINE_INFO = {17,17,17,17,17,17,17,17,17,17,17,17};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-br\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <link rel=\"stylesheet\" href=\"/css/error.css\">\r\n    <title>Error 404 - Lost Trip</title>\r\n</head>\r\n<body>\r\n    <div class=\"container\">\r\n        <div class=\"img-container\"></div>\r\n        <h1 class=\"error-code\">404</h1>\r\n        <p class=\"message\"><span class=\"mayday\">MAYDAY!</span> VOCÊ PERDEU O CONTROLE DA PAGINA</p>\r\n        <a href=\"/home\" class=\"home-button\">HOME</a>\r\n    </div>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
