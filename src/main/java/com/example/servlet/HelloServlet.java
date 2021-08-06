package com.example.servlet;

import org.hibernate.Session;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       // String str = request.getParameter("name");
      //  PrintWriter printWriter = response.getWriter();
       // response.sendRedirect("https://www.google.com/");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
        requestDispatcher.include(request,response);

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        session.setAttribute("count",count);
        if (count==null){
            session.setAttribute("count",1);
            count=1;
        }else {
            count++;
            session.setAttribute("count",count);
        }
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>"+count+"</html>");
    }

    public void destroy() {
    }
}