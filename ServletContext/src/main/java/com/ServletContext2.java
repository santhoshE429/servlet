package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletContext2 extends GenericServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	ServletContext context=getServletContext();
	String appName=context.getInitParameter("appName");
	PrintWriter out=res.getWriter();
	out.print("<h1>AppName: "+appName+"</h1>");
	
}
}
