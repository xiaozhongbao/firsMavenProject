package com.xzhb.trainTicket.Controller;

import java.io.IOException;

/**
 * Created by xiao on 2016/6/15.
 */
public class ServletWelcome extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("doPost worked");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //****work
        System.out.println("doGet worked");
    }
}
