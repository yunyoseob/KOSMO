/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.77
 * Generated at: 2022-04-07 02:38:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.kos_005fcss_005fp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kokoaChattingRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>카카오채팅방</title>\r\n");
      out.write("<meta name=\"viweport\" content=\"width=device-width, iitail-scale=1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	body{\r\n");
      out.write("		display:table;\r\n");
      out.write("		position:relative;\r\n");
      out.write("		width:600px;\r\n");
      out.write("  		margin:10px auto;\r\n");
      out.write("		background:rgb(255, 255, 77);\r\n");
      out.write("		heigth:100%;\r\n");
      out.write("		width:400px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	div{\r\n");
      out.write("		position:relative;\r\n");
      out.write("		width:600px;\r\n");
      out.write("  		margin:10px auto;\r\n");
      out.write("		box-sizing:border-box;\r\n");
      out.write("		width:400px;\r\n");
      out.write("		padding:20px;\r\n");
      out.write("		text-align:center;\r\n");
      out.write("		font-size:90%;\r\n");
      out.write("		margin:12px;\r\n");
      out.write("		align-context:space-between;\r\n");
      out.write("		margin:10px auto;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	div.chat{\r\n");
      out.write("		position:relative;\r\n");
      out.write("		width:600px;\r\n");
      out.write("  		margin:10px auto;\r\n");
      out.write("		background:hsl(192, 100%, 90%);\r\n");
      out.write("		width:200px;\r\n");
      out.write("		heigth:500px;\r\n");
      out.write("		padding:20px;\r\n");
      out.write("		border:3px solid;\r\n");
      out.write("		border-color:#ccccb3;\r\n");
      out.write("		border-style: solid;\r\n");
      out.write("		text-align:center;\r\n");
      out.write("	}\r\n");
      out.write("		\r\n");
      out.write("	#i3{\r\n");
      out.write("		position:relative;\r\n");
      out.write("  		margin:10px auto;\r\n");
      out.write("		float:right;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	img{\r\n");
      out.write("  		margin:10px auto;\r\n");
      out.write("		float:right;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String tname=request.getParameter("tname");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"ch\">\r\n");
      out.write("	<div class=\"chat\">\r\n");
      out.write("		<header>\r\n");
      out.write("			<img src=\"/kosMember_YYS/img/img_kakao/2윙크.png\" width=\"50\" height=\"50\">\r\n");
      out.write("			<p style=\"text-align:left;\"> ");
      out.print( tname );
      out.write("</p>\r\n");
      out.write("		</header>\r\n");
      out.write("		<section>\r\n");
      out.write("			hi~\r\n");
      out.write("		</section>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div id=i3>\r\n");
      out.write("		<img src=\"/kosMember_YYS/img/img_kakaofriends/3 (2).png\" width=\"80\" height=\"92\">\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}