package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/getdate")
public class DateServelet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	super.doGet(req, resp);
		System.out.println(getServletContext());
		
		HttpSession session=request.getSession();
		
		System.out.println();
		
		PrintWriter pw=response.getWriter();
		
		pw.println("Hello, Crush!");
		
		Date currentdate=new Date();
		pw.println(currentdate);
		
		pw.println(Thread.currentThread().getName());
	}
	
}
