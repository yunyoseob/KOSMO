/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.77
 * Generated at: 2022-05-05 10:11:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.kos_005fajax_005fp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax_005fweathergokr_005frss_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- jQuery CDN ????????????  -------------------------------------------->\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">	\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		alert(\"jQuery ready ?????? ?????? >>> : \");\r\n");
      out.write("		\r\n");
      out.write("		$(function(){\r\n");
      out.write("			let urlV=\"ajax_weathergokr_rss.xml\";\r\n");
      out.write("			let dtV=\"xml\";\r\n");
      out.write("			console.log(\"urlV >>> : \"+urlV);\r\n");
      out.write("			console.log(\"dtV >>> : \"+dtV);\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url:urlV,\r\n");
      out.write("				dataType:dtV,\r\n");
      out.write("				success:function(data){\r\n");
      out.write("					alert(\"data >>> : \"+data);\r\n");
      out.write("					var items_ = $(data).find(\"data\");\r\n");
      out.write("					alert(\"items_ >>> : \"+items_);\r\n");
      out.write("					\r\n");
      out.write("					if(items_.length>0){\r\n");
      out.write("						items_=items_.slice(0,13);\r\n");
      out.write("						var dataTable=$(\"<table border='1' />\");\r\n");
      out.write("						var f_row=$(\"<tr />\").append(\r\n");
      out.write("							$('<td>??????</td>'),\r\n");
      out.write("							$('<td>?????? ??????</td>'),\r\n");
      out.write("							$('<td>?????? ??????</td>')\r\n");
      out.write("						);\r\n");
      out.write("						dataTable.append(f_row);\r\n");
      out.write("						$(\".wrap\").append(dataTable);\r\n");
      out.write("						\r\n");
      out.write("						$.each(items_, function(idx, val){\r\n");
      out.write("							// ??????\r\n");
      out.write("							var td=$(val).find(\"tmEf\").text();\r\n");
      out.write("							// ?????? ??????\r\n");
      out.write("							var tmn=$(val).find(\"tmn\").text();\r\n");
      out.write("							// ?????? ??????\r\n");
      out.write("							var tmx=$(val).find(\"tmx\").text();\r\n");
      out.write("							\r\n");
      out.write("							var row=$(\"<tr />\").append(\r\n");
      out.write("											$('<td />').text(td),\r\n");
      out.write("				    				        $('<td />').text(tmn),\r\n");
      out.write("				    				        $('<td />').text(tmx)\r\n");
      out.write("				    				        );\r\n");
      out.write("							dataTable.append(row);\r\n");
      out.write("						}); // $.each(items_, function(idx, val){}) \r\n");
      out.write("						$(\".wrap\").append(dataTable);\r\n");
      out.write("					} // end of if(items_.length>0)\r\n");
      out.write("					\r\n");
      out.write("				}, // end of function(data)\r\n");
      out.write("				error:function(e){\r\n");
      out.write("					alert(e.responseTest);\r\n");
      out.write("				} // end of error\r\n");
      out.write("			}); // end of $.ajax({})\r\n");
      out.write("			\r\n");
      out.write("		}); // end of $(function(){});\r\n");
      out.write("	}); // document ready function\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	body{\r\n");
      out.write("		left:50%;\r\n");
      out.write("		right:50%;\r\n");
      out.write("		margin: 25px auto;\r\n");
      out.write("		padding: 25px;\r\n");
      out.write("		background-image:url(\"https://www.10wallpaper.com/wallpaper/1366x768/1411/a_sunny_days_end-Photos_HD_Wallpaper_1366x768.jpg\");\r\n");
      out.write("		background-repeat:no-repeat;\r\n");
      out.write("		background-size:cover;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	table{\r\n");
      out.write("		background-color:#ffc299; \r\n");
      out.write("		width:450px;\r\n");
      out.write("		text-align:center;\r\n");
      out.write("		box-sizing:border-box;\r\n");
      out.write("		box-shadow:10px 10px 10px grey;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3 style=\"color:#ffc299;\">????????? ?????? ???????????? :: ??????</h3>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"wrap\"></div>\r\n");
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
