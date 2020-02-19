package com.trainingbasket.javaee.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLeague
 */
@WebServlet(urlPatterns = "/addleague")
public class AddLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/listleague.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/listleague.jsp");
		dispatcher.forward(request, response);
		List<String> errMsg=new ArrayList<String>();
		String title=request.getParameter("title");
		String season=request.getParameter("season");
		int year=0;
		try{
			
		year=Integer.parseInt(request.getParameter("year")); 
		
		}catch(Exception e) {
			errMsg.add("Please enter the valid Year"+e.getMessage());
		}
       if(year<2020) {
    	   errMsg("Year can not be less than current year");
       }
       if(season.equals("") || season==null) {
    	   errMsg("Season can not be Blank");
       }
       if(title.equals("") || title==null) {
    	   errMsg("Title can not be Blank");
       }
       if (errMsg.isEmpty()) {
    	   request.setAttribute("Msg", "League Has been added");

	}
       else {
    	   request.setAttribute("errMsg", "errMsg");
       }
		RequestDispatcher dispacher = request.getRequestDispatcher("/views/listleague.jsp");
		dispatcher.forward(request, response);

		}

	private void errMsg(String string) {
		// TODO Auto-generated method stub
		
	}
		
}
