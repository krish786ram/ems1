package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headers/*")
public class HeaderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		Enumeration<String>headerNames=req.getHeaderNames();
		PrintWriter pw=resp.getWriter();
		
		pw.println("<html><body>");
		
		pw.println("<table>");
		
		while(headerNames.hasMoreElements()){
			String name=headerNames.nextElement();
			String value=req.getHeader(name);
			
			pw.println("<tr>");
			
			pw.println("</td>"+name+"/</td>");
			
			pw.println("</td>"+value+"/</td>");
			
			pw.println("</tr>");
		}
		
		pw.println("</table>");
		
		pw.println("</html></body>");
	}
	
}
