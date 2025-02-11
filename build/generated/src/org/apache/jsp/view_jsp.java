package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.BookDTO;
import dto.CartObj;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            CartObj shoppingCart=(CartObj)session.getAttribute("cart");       
        
      out.write("\n");
      out.write("        <h1>");
      out.print( shoppingCart.getCustomerName() );
      out.write("'s cart</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>No</th>\n");
      out.write("                    <th>BookName</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    int count=0;
                    for(BookDTO dto : shoppingCart.getCart().values())
                    {
                        count ++;           
                
      out.write("\n");
      out.write("            <form action=\"MainController\" method=\"POST\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( count );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( dto.getName() );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtQuantity\" value=\"");
      out.print( dto.getQuantity() );
      out.write("\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>");
      out.print( dto.getPrice() );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"hidden\" name=\"txtID\" value=\"");
      out.print( dto.getId() );
      out.write("\"/>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Update\"/>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Remove\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </form>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"index.jsp\">Continue Shopping </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>");
      out.print( shoppingCart.getTotal() );
      out.write("</td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
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
