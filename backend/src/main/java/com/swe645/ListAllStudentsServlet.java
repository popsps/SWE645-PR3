package com.swe645;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ListAllStudents")
public class ListAllStudentsServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();
    try {
      List<StudentBean> students = StudentDAO.getStudents();
      Gson gson = new Gson();
//      String data = StudentDAO.getAllStudentsJson(students);
      String data = gson.toJson(students);
      out.println(data);
    } finally {
      out.close();
    }
  }
}
