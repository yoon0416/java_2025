/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-03-18 07:56:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsp_005fscore_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"alert alert-warning\" style=font-size:1.5em>\r\n");
      out.write("		<h3 class=\"card-header\">form - score</h3>\r\n");
      out.write("		");

			String kor = request.getParameter("kor");
			int kori = 0;
			
			String eng = request.getParameter("eng");
			int engi = 0;
			
			String math = request.getParameter("math"); 
			int mathi = 0;
			

			
			if (kor != null && !kor.isEmpty()) {
				try {kori = Integer.parseInt(kor);} 
				catch (NumberFormatException e) {kori = 0;}
			}
			
			if (eng != null && !eng.isEmpty()) {
				try { engi = Integer.parseInt(eng);} 
				catch (NumberFormatException e) { engi = 0;}
			}
			if (math != null && !math.isEmpty()) {
				try {mathi = Integer.parseInt(math);} 
				catch (NumberFormatException e) {mathi = 0;}
			}
			
			int total = kori+engi+mathi;
			
			double avg = 0;
			if (kori > 0 || engi > 0 || mathi > 0) { //0나누면 그때 그 인피니티?
				avg = total / 3.0;
			}
		
      out.write("\r\n");
      out.write("			<p>국어 : ");
      out.print( kori );
      out.write("</p>\r\n");
      out.write("			<p>영어 : ");
      out.print( engi );
      out.write("</p>\r\n");
      out.write("			<p>수학 : ");
      out.print( mathi );
      out.write("</p>\r\n");
      out.write("			<p>총점 : ");
      out.print( total );
      out.write("</p>\r\n");
      out.write("			<p>평균 : ");
      out.print( String.format("%.2f",avg) );
      out.write("</p>\r\n");
      out.write("			<table class=\"table table-bordered table-striped table-hover my-5\">\r\n");
      out.write("			<caption>성적처리</caption>\r\n");
      out.write("			    <thead>\r\n");
      out.write("			      <tr>\r\n");
      out.write("			        <th scope=\"col\">KOR</th>\r\n");
      out.write("			        <th scope=\"col\">ENG</th>\r\n");
      out.write("			        <th scope=\"col\">MATH</th>\r\n");
      out.write("			        <th scope=\"col\">TOTAL</th>\r\n");
      out.write("			        <th scope=\"col\">AVG</th>\r\n");
      out.write("			      </tr>\r\n");
      out.write("			    </thead>\r\n");
      out.write("			    <tbody>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>");
      out.print(kori );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(engi );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(mathi );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(total );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(String.format("%.2f",avg) );
      out.write("</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("			    </tbody>\r\n");
      out.write("			  </table>\r\n");
      out.write("		<p><a href=\"jsp_score.jsp\" class=\"btn btn-danger\">BACK</a></p>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
