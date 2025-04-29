package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,28,28,28,28,33,33,36,39,39,45,45,45,49,52,52,52,0,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content, com.example.agencia_viagens.dto.Page page) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-BR\">\r\n\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <link rel=\"stylesheet\" href=\"/css/dashboard.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/cadastro-usuarios-cliente.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/exibicao-cadastro-cliente.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/cadastro-hospedagem.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/editar-hospedagem.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/exibicao-cadastro-cliente.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/cadastro-usuario.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/cadastro-pacote.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/exibicao-hospedagem.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/home.css\">\r\n    <link rel=\"stylesheet\" href=\"/css/gerenciamento-usuario.css\">\r\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n    <script src=\"/js/dashboard.js\" defer></script>\r\n    <script src=\"/js/telefone-formatacao.js\" defer></script>\r\n    <script src=\"/js/deletar-cliente.js\" defer></script>\r\n    <script src=\"/js/deletar-hospedagem.js\" defer></script>\r\n    <script src=\"/js/validar-post.js\" defer></script>\r\n    <script src=\"/js/placeholder.js\" defer></script>\r\n    <script src=\"/js/pesquisa.js\" defer></script>\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(page == null ? "INNOVA TURISMO" : page.title());
		jteOutput.writeContent("</title>\r\n</head>\r\n\r\n<body>\r\n    <section class=\"section\" id=\"barra-lateral\">\r\n        ");
		gg.jte.generated.ondemand.layout.JtebarralateralGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n    </section>\r\n    \r\n    ");
		jteOutput.writeContent("\r\n    <section id=\"content\">\r\n    <nav class=\"nav\">\r\n            ");
		gg.jte.generated.ondemand.layout.JtenavGenerated.render(jteOutput, jteHtmlInterceptor, page);
		jteOutput.writeContent("\r\n        </nav>\r\n    <main class=\"main\">\r\n        \r\n        \r\n\r\n            ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        \r\n    </main>\r\n    </section>\r\n    ");
		jteOutput.writeContent("\r\n\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		com.example.agencia_viagens.dto.Page page = (com.example.agencia_viagens.dto.Page)params.getOrDefault("page", null);
		render(jteOutput, jteHtmlInterceptor, content, page);
	}
}
