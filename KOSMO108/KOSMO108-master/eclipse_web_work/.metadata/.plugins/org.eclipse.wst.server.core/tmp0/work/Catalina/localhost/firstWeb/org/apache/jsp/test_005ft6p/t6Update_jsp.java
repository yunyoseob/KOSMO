/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.77
 * Generated at: 2022-03-29 06:39:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test_005ft6p;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import a.b.c.t6.servie.T6Service;
import a.b.c.t6.servie.T6ServiceImpl;
import a.b.c.t6.vo.T6VO;
import java.util.ArrayList;

public final class t6Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("a.b.c.t6.servie.T6Service");
    _jspx_imports_classes.add("a.b.c.t6.servie.T6ServiceImpl");
    _jspx_imports_classes.add("a.b.c.t6.vo.T6VO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>TEST_T6 SELECT NUM</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		// $(#t6update_btn_ok).click(funtion(){});\r\n");
      out.write("		\r\n");
      out.write("		// <input type=\"button\" value=\"수정\" id=\"t6update_btn_ok\">\r\n");
      out.write("		// <input type=\"button\" value=\"삭제\" id=\"t6delete_btn_ok\">\r\n");
      out.write("		$(\"#t6update_btn_ok\").click(function(){\r\n");
      out.write("			alert(\"t6update_btn_ok 버튼 클릭 성공 >>> : \");\r\n");
      out.write("			\r\n");
      out.write("			// $().attr({}).submit();\r\n");
      out.write("			// $(\"#form_t6_update_ok\").attr({}).submit();\r\n");
      out.write("			$(\"#form_t6_update_ok\").attr(\r\n");
      out.write("					{\r\n");
      out.write("						\"action\":\"/firstWeb/test_t6p/t6UpdateOk.jsp\",\r\n");
      out.write("						\"method\":\"GET\"\r\n");
      out.write("					}\r\n");
      out.write("			).submit();\r\n");
      out.write("		}); // end of $(\"#t6update_btn_ok\").click(funtion()\r\n");
      out.write("				\r\n");
      out.write("		$(\"#t6delete_btn_ok\").click(function(){\r\n");
      out.write("			alert(\"t6delete_btn_ok 버튼 클릭 성공 >>> : \");\r\n");
      out.write("			\r\n");
      out.write("			// $().attr({}).submit();\r\n");
      out.write("			// $(\"#form_t6_update_ok\").attr({}).submit();\r\n");
      out.write("			$(\"#form_t6_update_ok\").attr(\r\n");
      out.write("					{\r\n");
      out.write("						\"action\":\"/firstWeb/test_t6p/t6DeleteOk.jsp\",\r\n");
      out.write("						\"method\":\"GET\"\r\n");
      out.write("					}\r\n");
      out.write("			).submit();\r\n");
      out.write("		}); // end of $(\"#t6update_btn_ok\").click(funtion()\r\n");
      out.write("	}) // $(document).ready(function(){\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3 align=\"center\">TEST_T6 SELECT NUM</h3>\r\n");
      out.write("<hr>\r\n");
      out.write("<form name=\"form_t6_update_ok\" id=\"form_t6_update_ok\">\r\n");
      out.write("<table border=\"1\" align=\"center\">\r\n");

	String t1=request.getParameter("t1");
	// 회원번호 <input type="text" name="t1" id="t1">
	System.out.println("t1 >>> : "+t1);
	T6VO tvo= null;
	tvo = new T6VO();
	tvo.setT1(t1);
	
	T6Service ts=new T6ServiceImpl();
	ArrayList<T6VO> aList=ts.t6SelectNum(tvo);
	
	if (aList!=null && aList.size()==1){
		T6VO _tvo=aList.get(0);
		// 이름만 받아오면 그만임.
		T6VO.printT6VO(_tvo);

      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"2\" align=\"center\">회원 글 수정하기</td>\r\n");
      out.write("	<!--  열 병합 -->\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">T1</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"t1\" id=\"t1\" size=\"20\" readonly value=\"");
      out.print( _tvo.getT1() );
      out.write("\"></td>\r\n");
      out.write("	<!--  disabled value : 데이터를 웹 서버로 못 던진다.\r\n");
      out.write("		  readonly value : 데이터를 웹 서버로 던질 수 있다. \r\n");
      out.write("		  readonly value하고 \"\" 안에 내용을 써야 한다.-->\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">T2</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"t2\" id=\"t2\" size=\"20\" value=\"");
      out.print( _tvo.getT2() );
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">T3</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"t3\" id=\"t3\" size=\"20\" value=\"");
      out.print( _tvo.getT3() );
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">T4</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"t4\" id=\"t4\" size=\"20\" disabled value=\"");
      out.print( _tvo.getT4() );
      out.write(">\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">T5</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"t5\" id=\"t5\" size=\"20\" disabled value=\"");
      out.print( _tvo.getT5() );
      out.write("\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">T6</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"t6\" id=\"t6\" size=\"20\" disabled value=\"");
      out.print( _tvo.getT6() );
      out.write(">\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"2\" align=\"center\">\r\n");
      out.write("		<input type=\"button\" value=\"수정\" id=\"t6update_btn_ok\">\r\n");
      out.write("		<input type=\"button\" value=\"삭제\" id=\"t6delete_btn_ok\">\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
 
	} // end of if (aList!=null && aList.size()==1)

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
