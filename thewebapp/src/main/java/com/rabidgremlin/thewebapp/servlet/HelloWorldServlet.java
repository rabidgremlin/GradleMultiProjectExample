package com.rabidgremlin.thewebapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rabidgremlin.utillib.*;

public class HelloWorldServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    // Beware of threading issues :) But this is just a demo
    private TokenUtil tokenUtil = new TokenUtil();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.getWriter().append("Hello World ! Your random token is: " + tokenUtil.getRandomToken())
        .append("<br>Test property is: ").append(System.getProperty("testProp"));
    }
}
