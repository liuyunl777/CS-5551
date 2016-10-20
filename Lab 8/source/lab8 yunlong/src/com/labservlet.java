package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class labservlet
 */
@WebServlet("/labservlet")
public class labservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public labservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name = request.getParameter("input_name");
		String luck = request.getParameter("input_luck");
		String food = ("pizza and noodle");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<p> hello  <br>" + name + ", you came from " + luck + " <br> <br>1.china is a populous nation in East Asia whose vast landscape encompasses grassland, desert, mountains, lakes, rivers and more than 14,000km of coastline. Capital Beijing mixes modern architecture with historic sites such as the Forbidden City palace complex and Tiananmen Square. Shanghai is a skyscraper-studded global financial center. The iconic Great Wall of China runs east-west across the country's north.</p>");
		out.println("<p>2.the food you chose were "+ food +"!</p></body></html>");
		//out.println("<p> Morning  <br>" + name + ", you alwasy in  " + luck + " <br> </p>");
		//out.println("<p> no matter "+ food +" you like, i will cook everything you like for you!</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
