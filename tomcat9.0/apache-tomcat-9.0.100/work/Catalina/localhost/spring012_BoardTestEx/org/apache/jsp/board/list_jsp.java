/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-04-04 07:39:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.company.dto.BoardDto;
import java.util.List;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/inc/footer.jsp", Long.valueOf(1743668525057L));
    _jspx_dependants.put("jar:file:/D:/java_2025/tomcat9.0/apache-tomcat-9.0.100/wtpwebapps/spring012_ex_board/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/inc/header.jsp", Long.valueOf(1743670096217L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1743579430930L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.company.dto.BoardDto");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <!-- Theme Made By www.w3schools.com -->\r\n");
      out.write("  <title>Bootstrap Theme Company Page</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  body {\r\n");
      out.write("    font: 400 15px Lato, sans-serif;\r\n");
      out.write("    line-height: 1.8;\r\n");
      out.write("    color: #818181;\r\n");
      out.write("  }\r\n");
      out.write("  h2 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    color: #303030;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("  }\r\n");
      out.write("  h4 {\r\n");
      out.write("    font-size: 19px;\r\n");
      out.write("    line-height: 1.375em;\r\n");
      out.write("    color: #303030;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("  }  \r\n");
      out.write("  .jumbotron {\r\n");
      out.write("    background-color: #f4511e;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 100px 25px;\r\n");
      out.write("    font-family: Montserrat, sans-serif;\r\n");
      out.write("  }\r\n");
      out.write("  .container-fluid {\r\n");
      out.write("    padding: 60px 50px;\r\n");
      out.write("  }\r\n");
      out.write("  .bg-grey {\r\n");
      out.write("    background-color: #f6f6f6;\r\n");
      out.write("  }\r\n");
      out.write("  .logo-small {\r\n");
      out.write("    color: #f4511e;\r\n");
      out.write("    font-size: 50px;\r\n");
      out.write("  }\r\n");
      out.write("  .logo {\r\n");
      out.write("    color: #f4511e;\r\n");
      out.write("    font-size: 200px;\r\n");
      out.write("  }\r\n");
      out.write("  .thumbnail {\r\n");
      out.write("    padding: 0 0 15px 0;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("  }\r\n");
      out.write("  .thumbnail img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("  }\r\n");
      out.write("  .carousel-control.right, .carousel-control.left {\r\n");
      out.write("    background-image: none;\r\n");
      out.write("    color: #f4511e;\r\n");
      out.write("  }\r\n");
      out.write("  .carousel-indicators li {\r\n");
      out.write("    border-color: #f4511e;\r\n");
      out.write("  }\r\n");
      out.write("  .carousel-indicators li.active {\r\n");
      out.write("    background-color: #f4511e;\r\n");
      out.write("  }\r\n");
      out.write("  .item h4 {\r\n");
      out.write("    font-size: 19px;\r\n");
      out.write("    line-height: 1.375em;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    font-style: italic;\r\n");
      out.write("    margin: 70px 0;\r\n");
      out.write("  }\r\n");
      out.write("  .item span {\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("  }\r\n");
      out.write("  .panel {\r\n");
      out.write("    border: 1px solid #f4511e; \r\n");
      out.write("    border-radius:0 !important;\r\n");
      out.write("    transition: box-shadow 0.5s;\r\n");
      out.write("  }\r\n");
      out.write("  .panel:hover {\r\n");
      out.write("    box-shadow: 5px 0px 40px rgba(0,0,0, .2);\r\n");
      out.write("  }\r\n");
      out.write("  .panel-footer .btn:hover {\r\n");
      out.write("    border: 1px solid #f4511e;\r\n");
      out.write("    background-color: #fff !important;\r\n");
      out.write("    color: #f4511e;\r\n");
      out.write("  }\r\n");
      out.write("  .panel-heading {\r\n");
      out.write("    color: #fff !important;\r\n");
      out.write("    background-color: #f4511e !important;\r\n");
      out.write("    padding: 25px;\r\n");
      out.write("    border-bottom: 1px solid transparent;\r\n");
      out.write("    border-top-left-radius: 0px;\r\n");
      out.write("    border-top-right-radius: 0px;\r\n");
      out.write("    border-bottom-left-radius: 0px;\r\n");
      out.write("    border-bottom-right-radius: 0px;\r\n");
      out.write("  }\r\n");
      out.write("  .panel-footer {\r\n");
      out.write("    background-color: white !important;\r\n");
      out.write("  }\r\n");
      out.write("  .panel-footer h3 {\r\n");
      out.write("    font-size: 32px;\r\n");
      out.write("  }\r\n");
      out.write("  .panel-footer h4 {\r\n");
      out.write("    color: #aaa;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("  }\r\n");
      out.write("  .panel-footer .btn {\r\n");
      out.write("    margin: 15px 0;\r\n");
      out.write("    background-color: #f4511e;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar {\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("    background-color: #f4511e;\r\n");
      out.write("    z-index: 9999;\r\n");
      out.write("    border: 0;\r\n");
      out.write("    font-size: 12px !important;\r\n");
      out.write("    line-height: 1.42857143 !important;\r\n");
      out.write("    letter-spacing: 4px;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("    font-family: Montserrat, sans-serif;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar li a, .navbar .navbar-brand {\r\n");
      out.write("    color: #fff !important;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar-nav li a:hover, .navbar-nav li.active a {\r\n");
      out.write("    color: #f4511e !important;\r\n");
      out.write("    background-color: #fff !important;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar-default .navbar-toggle {\r\n");
      out.write("    border-color: transparent;\r\n");
      out.write("    color: #fff !important;\r\n");
      out.write("  }\r\n");
      out.write("  footer .glyphicon {\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    color: #f4511e;\r\n");
      out.write("  }\r\n");
      out.write("  .slideanim {visibility:hidden;}\r\n");
      out.write("  .slide {\r\n");
      out.write("    animation-name: slide;\r\n");
      out.write("    -webkit-animation-name: slide;\r\n");
      out.write("    animation-duration: 1s;\r\n");
      out.write("    -webkit-animation-duration: 1s;\r\n");
      out.write("    visibility: visible;\r\n");
      out.write("  }\r\n");
      out.write("  @keyframes slide {\r\n");
      out.write("    0% {\r\n");
      out.write("      opacity: 0;\r\n");
      out.write("      transform: translateY(70%);\r\n");
      out.write("    } \r\n");
      out.write("    100% {\r\n");
      out.write("      opacity: 1;\r\n");
      out.write("      transform: translateY(0%);\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  @-webkit-keyframes slide {\r\n");
      out.write("    0% {\r\n");
      out.write("      opacity: 0;\r\n");
      out.write("      -webkit-transform: translateY(70%);\r\n");
      out.write("    } \r\n");
      out.write("    100% {\r\n");
      out.write("      opacity: 1;\r\n");
      out.write("      -webkit-transform: translateY(0%);\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  @media screen and (max-width: 768px) {\r\n");
      out.write("    .col-sm-4 {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      margin: 25px 0;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-lg {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      margin-bottom: 35px;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  @media screen and (max-width: 480px) {\r\n");
      out.write("    .logo {\r\n");
      out.write("      font-size: 150px;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#myPage\">Logo</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"#about\">ABOUT</a></li>\r\n");
      out.write("        <li><a href=\"#services\">SERVICES</a></li>\r\n");
      out.write("        <li><a href=\"#portfolio\">PORTFOLIO</a></li>\r\n");
      out.write("        <li><a href=\"#pricing\">PRICING</a></li>\r\n");
      out.write("        <li><a href=\"#contact\">CONTACT</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  END HEADER -->\r\n");
      out.write("<!--  END HEADER -->\r\n");
      out.write("<!--  END HEADER -->\r\n");
      out.write("<script>\r\n");
      out.write("//window.onload = function(){};  브라우저로딩 작업   맨마지막 1번만\r\n");
      out.write("//window.addEventListener(\"load\" , function(){});\r\n");
      out.write("//jQuery(document).ready(function(){});\r\n");
      out.write("//$(document).ready(function(){});\r\n");
      out.write("$(function(){      \r\n");
      out.write("	let result = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'; console.log(result);\r\n");
      out.write("	if(result == 'fail'){alert('비밀번호를 확인해주세요'); history.go(-1);}\r\n");
      out.write("	else if(result.length !=0){ alert('글쓰기성공'); }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\"   style=\"margin-top:5%; min-height:500px\">\r\n");
      out.write("	<h3>MULTIBOARD</h3>\r\n");
      out.write("	<table  class=\"table table-striped\">\r\n");
      out.write("		<caption>MULTIBOARD - MVC1</caption>\r\n");
      out.write("		<thead>\r\n");
      out.write("			<tr><th scope=\"col\">NO</th><th scope=\"col\">TITLE</th>\r\n");
      out.write("			     <th scope=\"col\">WRITER</th><th scope=\"col\">DATE</th><th scope=\"col\">HIT</th><th scope=\"col\">IP</th></tr>\r\n");
      out.write("		</thead>\r\n");
      out.write("		<tbody> \r\n");
      out.write("		 ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("	<p  class=\"text-right\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/create\"   class=\"btn btn-danger\">글쓰기</a></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- END FOOTER -->\r\n");
      out.write("<!-- END FOOTER -->\r\n");
      out.write("<!-- END FOOTER -->\r\n");
      out.write("<!-- END FOOTER -->\r\n");
      out.write("\r\n");
      out.write("<footer class=\"container-fluid text-center\">\r\n");
      out.write("  <a href=\"#myPage\" title=\"To Top\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <p>copyrights &copy; CompanyName  2020 all rights reserved. </p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  // Add smooth scrolling to all links in navbar + footer link\r\n");
      out.write("  $(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\r\n");
      out.write("    // Make sure this.hash has a value before overriding default behavior\r\n");
      out.write("    if (this.hash !== \"\") {\r\n");
      out.write("      // Prevent default anchor click behavior\r\n");
      out.write("      event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("      // Store hash\r\n");
      out.write("      var hash = this.hash;\r\n");
      out.write("\r\n");
      out.write("      // Using jQuery's animate() method to add smooth page scroll\r\n");
      out.write("      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\r\n");
      out.write("      $('html, body').animate({\r\n");
      out.write("        scrollTop: $(hash).offset().top\r\n");
      out.write("      }, 900, function(){\r\n");
      out.write("   \r\n");
      out.write("        // Add hash (#) to URL when done scrolling (default click behavior)\r\n");
      out.write("        window.location.hash = hash;\r\n");
      out.write("      });\r\n");
      out.write("    } // End if\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  $(window).scroll(function() {\r\n");
      out.write("    $(\".slideanim\").each(function(){\r\n");
      out.write("      var pos = $(this).offset().top;\r\n");
      out.write("\r\n");
      out.write("      var winTop = $(window).scrollTop();\r\n");
      out.write("        if (pos < winTop + 600) {\r\n");
      out.write("          $(this).addClass(\"slide\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /board/list.jsp(32,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("dto");
    // /board/list.jsp(32,3) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    // /board/list.jsp(32,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<tr>\r\n");
          out.write("				<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.size()-status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td> <!-- 0,1,2 -->\r\n");
          out.write("				<td>  <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/board/detail?bno=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.btitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </a></td>\r\n");
          out.write("				<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.bname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("				<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.bdate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("				<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.bhit }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("				<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.bip }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("			</tr>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
    }
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    return false;
  }
}
