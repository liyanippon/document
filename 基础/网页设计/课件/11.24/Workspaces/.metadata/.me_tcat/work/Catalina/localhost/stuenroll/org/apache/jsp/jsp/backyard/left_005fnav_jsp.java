package org.apache.jsp.jsp.backyard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_005fnav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<script src=\"../../js/nav.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"left_div\">\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">报名信息</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">归档数据</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">申报专业</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">参与状态</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">学校管理</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">班级管理</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">用户管理</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">年届管理</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">培训地点</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">系统管理</div>\r\n");
      out.write("\t\t<div class=\"left-tag\" onclick=\"\">数据导入</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
