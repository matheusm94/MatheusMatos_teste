package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroPassageiro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro de passageiros</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" ></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("   <div class=\"container\">     \n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("          <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("          <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Cadastros<span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a href=\"CadastroPassageiro.jsp\">Passageiros</a></li>\n");
      out.write("              <li><a href=\"CadastroMotorista.jsp\">Motoristas</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"\">Listas<span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a href=\"Passageiro.jsp\">Passageiros</a></li>\n");
      out.write("              <li><a href=\"Motorista.jsp\">Motoristas</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li><a href=\"listagem.jsp\">Listas</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("         ");

            String status = request.getParameter("status");

            if (status != null && status.equals("1a")) {
                out.println("<h3>Registro inserido</h3>");
            } else if (status != null && status.equals("1b")) {
                out.println("<h3>Falha no Cadastro</h3>");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form name=\"form\" method=\"post\" action=\"CadastroCliente\" class=\"form-signin\">\n");
      out.write("            <div class=\"row\">  \n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <label for =\"nome\">Nome:</label>\n");
      out.write("                <input type=\"text\" name =\"nome\" class=\"form-control\" required/>\n");
      out.write("            </div>\n");
      out.write("          </div>  \n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("          <div class=\"row\">  \n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <label for=\"cpf\">CPF:</label>\n");
      out.write("                <input type=\"text\" name =\"cpf\" class=\"form-control\" required/>\n");
      out.write("             </div>   \n");
      out.write("          </div>  \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <div class=\"input-group mb-3\">\n");
      out.write("              <div class=\"input-group-prepend\">\n");
      out.write("                <label class=\"input-group-text\" for=\"inputGroupSelect01\">Sexo</label>\n");
      out.write("              </div>\n");
      out.write("              <select class=\"custom-select\" id=\"inputGroupSelect01\" name=\"sexo\">\n");
      out.write("                <option value=\"\"></option>\n");
      out.write("                <option value =\"Masculino\">Masculino</option>\n");
      out.write("                <option value=\"Feminino\">Feminino</option>\n");
      out.write("                <option value=\"Outro\">Outro</option>\n");
      out.write("                \n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("           <div class=\"row\">  \n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <label for=\"idade\">Idade:</label>\n");
      out.write("                <input type=\"text\" name =\"idade\" class=\"form-control\" required/>\n");
      out.write("             </div>   \n");
      out.write("           </div>   \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" class = \"btn btn-primary\" value =\"Cadastrar\"/>\n");
      out.write("            \n");
      out.write("        </form>    \n");
      out.write("       </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
