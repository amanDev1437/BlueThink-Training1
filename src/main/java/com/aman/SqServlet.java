package com.aman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int sum = (int) req.getAttribute("sum");
//				
		
//		int sum = Integer.parseInt(req.getParameter("sum"));
		
		HttpSession session = req.getSession();
		
		int sum = (int) session.getAttribute("sum");
		
		
		int square = sum*sum;
		PrintWriter out = res.getWriter();
		out.println("Square of sum is:"+square);
		
	}

}
