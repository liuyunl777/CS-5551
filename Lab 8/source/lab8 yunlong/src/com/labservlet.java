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
		String c11 = request.getParameter("c1");
		String c12 = request.getParameter("c2");
		String c13 = request.getParameter("c3");
		
		c11 = c11 == null ? "false" : "true";
		c12 = c12 == null ? "false" : "true";
		c13 = c13 == null ? "false" : "true";
		
		//String food = ("pizza and noodle");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<p>HELLO "+ name +" !");
		/*if(luck.equals("china")) {
			
			out.println("<br>China is a populous nation in East Asia whose vast landscape encompasses grassland, desert, mountains, lakes, rivers and more than 14,000km of coastline. Capital Beijing mixes modern architecture with historic sites such as the Forbidden City palace complex and Tiananmen Square. Shanghai is a skyscraper-studded global financial center. The iconic Great Wall of China runs east-west across the country's north.</p>");
			
		}

	    if( luck.equals("india")){
			
			out.println("<br>India is a vast South Asian country with diverse terrain ¨C from Himalayan peaks to Indian Ocean coastline ¨C and history reaching back 5 millennia. In the north, Mughal Empire landmarks include Delhi¡¯s Red Fort complex and massive Jama Masjid mosque, plus Agra¡¯s iconic Taj Mahal mausoleum. Pilgrims bathe in the Ganges in Varanasi, and Rishikesh is a yoga centre and base for Himalayan trekking.</p>");
		}
				
		if ( luck.equals("america"))
		{
			
			out.println("<br>The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation¡¯s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC. Midwestern metropolis Chicago is known for influential architecture and on the west coast, Los Angeles' Hollywood is famed for filmmaking.</p>");
			
		}*/
		
		CountryIntro c = new CountryIntro(luck);
		
		out.println("<br>" + c.GenerateIntro() + "</p>");
		
		FoodIntro f = new FoodIntro(c11);
		out.println("<br>" + f.generatefood()  + "</p>");
	/*	if( c11 == "true" )
		{
			out.println("<p><br>Pizza is a flatbread generally topped with tomato sauce and cheese and baked in an oven. It is commonly topped with a selection of meats, vegetables and condiments.</p>");
			
		}
		*/
		if( c12 == "true" )
		{
			out.println("<p><br>A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. Hamburgers may be cooked in a variety of ways, including pan-frying, barbecuing, and flame-broiling</p>");
		}
		if( c13 == "true" )
		{
			out.println("<p><br>Noodles are a staple food in many cultures made from unleavened dough which is stretched, extruded, or rolled flat and cut into one of a variety of shapes</p>");
		}
		
		out.println("</body></html>");
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
