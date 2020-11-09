package com.swe645;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

@WebServlet("/confirmation")
public class ControllerServ extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String url = request.getHeader("origin");
    url = CanAccess(url);
    if (url != null)
      response.setHeader("Access-Control-Allow-Origin", url);
    response.setHeader("Access-Control-Allow-Methods", "POST");
    response.setContentType("text/html");
    String name = request.getParameter("name");
    PrintWriter out = response.getWriter();
    try {
      out.println("<h1>Form submitted successfully</h1>");
      out.println("<p>" + name + "</p>");
      out.println("<p>" + url + "</p>");
    } finally {
      out.close();
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String url = request.getHeader("origin");
    System.out.println("Remote: " + request.getHeader("origin")
        + " " + request.getHeader("x-forwarded-for") + " " + request.getRemoteAddr() +
        " " + request.getRemoteHost() + " " + request.getRemotePort());
    System.out.println(url);
    url = CanAccess(url);
    System.out.println("url: " + url);
    if (url != null)
      response.setHeader("Access-Control-Allow-Origin", url);
    response.setHeader("Access-Control-Allow-Methods", "GET");
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    try {
      out.println("<h1>Testing Servlets</h1>");
      out.println("<p>" + url + "</p>");
    } finally {
      out.close();
    }
  }

  protected String CanAccess(String url) {
    String allowed[] = new String[]{"http://localhost:4200", "http://localhost",
        "http://localhost:80", "http://swe645-frontend", "http://swe645-frontend:4200", "http://swe645-frontend:80"};
    for (String allowedUrl : allowed) {
      if (allowedUrl.equals(url)) {
        return allowedUrl;
      }
    }
    return null;
  }
}
