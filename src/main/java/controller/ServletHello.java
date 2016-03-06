package controller;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xzhb on 16-3-4.
 */
public class ServletHello extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       // PropertyConfigurator.configure("log4j.properties");
        System.out.println("xx");
        /**
         *
         */
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee=(Employee) ctx.getBean("employee");
        System.out.println( employee.toString());
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String uri = request.getRequestURI();

        out.println(
                "<BODY>/n" +
                        "<H2>URI: " + uri + "</H2>/n" +
                        "</BODY></HTML>");

    }
}
