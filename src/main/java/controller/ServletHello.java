package controller;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xzhb on 16-3-4.
 */
public class ServletHello extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("xx");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String uri = request.getRequestURI();

        out.println(
                "<BODY>/n" +
                        "<H2>URI: " + uri + "</H2>/n" +
                        "</BODY></HTML>");

    }
}
