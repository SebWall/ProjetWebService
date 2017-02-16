package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div id=\"header\" class=\"header-login-signup\">  \n");
      out.write("       <!-- <img id=\"logoMiage\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ressources/logo.jpg\"/>  \n");
      out.write("    </a>  \n");
      out.write("     <img id=\"logoJava\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ressources/java.png\"/>  -->\n");
      out.write("    <div class=\"header-limiter\">\n");
      out.write("\t\t<h1><a href=\"#\">Miage<span>blog</span></a></h1>\n");
      out.write("\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<a href=\"#\">Home</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"selected\">Articles</a>\n");
      out.write("\t\t\t<a href=\"#\">Membres</a>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"#\">Login</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Sign up</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("                \n");
      out.write("                <h:body>\n");
      out.write("\n");
      out.write("        <br />\n");
      out.write("        <h:link outcome=\"welcomePrimefaces\" value=\"Primefaces welcome page\" />\n");
      out.write("        <br />\n");
      out.write("        <h:link outcome=\"/jsf/auteur/List\" value=\"Show All Auteur Items\"/>\n");
      out.write("        <br />\n");
      out.write("        <h:link outcome=\"/jsf/categorie/List\" value=\"Show All Categorie Items\"/>\n");
      out.write("        <br />\n");
      out.write("        <h:link outcome=\"/jsf/livre/List\" value=\"Show All Livre Items\"/>\n");
      out.write("        <br />\n");
      out.write("        <h:link outcome=\"/jsf/pret/List\" value=\"Show All Pret Items\"/>\n");
      out.write("        <br />\n");
      out.write("        <h:link outcome=\"/jsf/users/List\" value=\"Show All Users Items\"/>\n");
      out.write("    </h:body>\n");
      out.write("     </div>\n");
      out.write("</div> ");
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
