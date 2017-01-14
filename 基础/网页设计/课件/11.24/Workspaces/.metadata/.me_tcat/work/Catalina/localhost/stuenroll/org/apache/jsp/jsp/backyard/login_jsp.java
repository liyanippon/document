package org.apache.jsp.jsp.backyard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>系统登录</title>\r\n");
      out.write("<style>\r\n");
      out.write(".body {\r\n");
      out.write("\tbackground-color: #bfbfbf;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_div {\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\theight: 370px;\r\n");
      out.write("\tbackground-color: #fcfcfc;\r\n");
      out.write("\tborder: #777 solid 1px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("\tbottom:0;\r\n");
      out.write("\tleft:0;\r\n");
      out.write("\tright:0;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_in {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\twidth: 220px;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: #cdcdcd solid 1px;\r\n");
      out.write("\t-webkit-border-radius: 3px;;\r\n");
      out.write("\t-moz-border-radius: 3px;;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_table {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-family: '新宋体', '宋体';\r\n");
      out.write("\tletter-spacing: 3px;\r\n");
      out.write("\tcolor: #444;\r\n");
      out.write("\tborder-left: #CCC solid 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_btn {\r\n");
      out.write("\tbackground-image: url(../../pic/Login.png);\r\n");
      out.write("\twidth: 170px;\r\n");
      out.write("\theight: 42px;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tbackground-color: #fcfcfc;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_btn:active {\r\n");
      out.write("\tbackground-image: url(../../pic/Login.png);\r\n");
      out.write("\twidth: 170px;\r\n");
      out.write("\theight: 42px;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tbackground-color: #fcfcfc;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tleft: 1px;\r\n");
      out.write("\ttop: 1px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction loginForm() {\r\n");
      out.write("\t\tvar username = document.getElementById(\"username\").value;\r\n");
      out.write("\t\tvar password = document.getElementById(\"password\").value;\r\n");
      out.write("\t\tif (username != null && username != \"\" && password != null\r\n");
      out.write("\t\t\t\t&& password != \"\") {\r\n");
      out.write("\t\t\tdocument.getElementsByName(\"form_1\")[0].submit();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"请正确填写用户名和密码！\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"body\">\r\n");
      out.write("\t<form method=\"post\" name=\"form_1\"\r\n");
      out.write("\t\taction=\"/stuenroll/user/login\">\r\n");
      out.write("\t\t<div class=\"login_div\">\r\n");
      out.write("\t\t\t<img src=\"../../pic/logo.jpg\" width=\"600\" height=\"86\" />\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"32%\" height=\"54\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"61%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"7%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\"><img src=\"../../pic/hiro.png\" width=\"154\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><table width=\"100%\" height=\"171\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tcellpadding=\"0\" cellspacing=\"0\" class=\"login_table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"24%\" height=\"67\" align=\"right\">用户名：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"76%\"><input name=\"username\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"login_in\" id=\"username\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td height=\"52\" align=\"right\">密码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"password\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"login_in\" id=\"password\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td height=\"52\" colspan=\"2\" align=\"left\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"login_btn\" value=\" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"margin-left: 80px;\" onclick=\"loginForm()\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
