package com.sidhardh.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sidhardh.servlet.model.AverageCalculater;

/**
 * Servlet implementation class AverageController
 */
@WebServlet("/averageController")
public class AverageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1=Integer.parseInt(request.getParameter("number1"));
		   int num2=Integer.parseInt(request.getParameter("number2"));
		   AverageCalculater avgCalc=new AverageCalculater();
		   int result=avgCalc.calculate(num1, num2);
		   System.out.println(result); 
		   request.setAttribute( "result",result);
		   RequestDispatcher disp= request.getRequestDispatcher("result.jsp");
		   disp.forward(request, response);
	}

}
