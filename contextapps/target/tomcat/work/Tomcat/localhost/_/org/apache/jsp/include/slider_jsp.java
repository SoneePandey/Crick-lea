/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-19 12:07:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!-- Slideshow container -->\r\n");
      out.write("<div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Full-width images with number and caption text -->\r\n");
      out.write("  <div class=\"mySlides fade\">\r\n");
      out.write("    <div class=\"numbertext\">1 / 3</div>\r\n");
      out.write("    <img src=\"/images/1.jpg\" style=\"width:100%\">\r\n");
      out.write("    <div class=\"text\">Curated Exams</div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mySlides fade\">\r\n");
      out.write("    <div class=\"numbertext\">2 / 3</div>\r\n");
      out.write("    <img src=\"/images/2.jpg\" style=\"width:100%\">\r\n");
      out.write("    <div class=\"text\">Collaborated Studies</div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"mySlides fade\">\r\n");
      out.write("    <div class=\"numbertext\">3 / 3</div>\r\n");
      out.write("    <img src=\"/images/3.jpg\" style=\"width:100%\">\r\n");
      out.write("    <div class=\"text\">Caption Three</div>\r\n");
      out.write(" </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <!-- Next and previous buttons -->\r\n");
      out.write("  <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n");
      out.write("  <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!-- The dots/circles -->\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(1)\"></span>\r\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(2)\"></span>\r\n");
      out.write("  <span class=\"dot\" onclick=\"currentSlide(3)\"></span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 1;\r\n");
      out.write("showSlides(slideIndex);\r\n");
      out.write("\r\n");
      out.write("function plusSlides(n) {\r\n");
      out.write("  showSlides(slideIndex += n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function currentSlide(n) {\r\n");
      out.write("  showSlides(slideIndex = n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showSlides(n) {\r\n");
      out.write("  var i;\r\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("  if (n > slides.length) {slideIndex = 1}    \r\n");
      out.write("  if (n < 1) {slideIndex = slides.length}\r\n");
      out.write("  for (i = 0; i < slides.length; i++) {\r\n");
      out.write("      slides[i].style.display = \"none\";  \r\n");
      out.write("  }\r\n");
      out.write("  for (i = 0; i < dots.length; i++) {\r\n");
      out.write("      dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("  dots[slideIndex-1].className += \" active\";\r\n");
      out.write("}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}