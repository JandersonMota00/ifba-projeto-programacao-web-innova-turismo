package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JtehomeGenerated {
	public static final String JTE_NAME = "home.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,0,0,0,28,28,28,28,28,28,28,28};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n<section class=\"home-dashboard\">\r\n    <div class=\"grid-container\">\r\n        <div class=\"card-home\">\r\n            <i class='bx bxs-plane-alt'></i>\r\n            <h3>Pacotes</h3>\r\n            <p>Gerencie os pacotes de viagens disponíveis.</p>\r\n        </div>\r\n        <div class=\"card-home\">\r\n            <i class='bx bxs-buildings'></i>\r\n            <h3>Hospedagens</h3>\r\n            <p>Controle as hospedagens oferecidas.</p>\r\n        </div>\r\n        <div class=\"card-home\">\r\n            <i class='bx bxs-user-circle'></i>\r\n            <h3>Clientes</h3>\r\n            <p>Visualize e gerencie os clientes cadastrados.</p>\r\n        </div>\r\n        <div class=\"card-home\">\r\n            <i class='bx bxs-user-account'></i>\r\n            <h3>Funcionários</h3>\r\n            <p>Gerencie os funcionários da agência.</p>\r\n        </div>\r\n    </div>\r\n    <div class=\"logo-container\">\r\n        <img src=\"/assets/svg/logo-innova.svg\" alt=\"Logo Innova\">\r\n    </div>\r\n</section>\r\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
