package com.cg.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.classentity.Entity;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	PrintWriter out=response.getWriter();
	HttpSession session=request.getSession();
	Entity bean=new Entity();
	bean=(Entity) session.getAttribute("data");
		
		
	
		out.println("firstname: "+bean.getFirstName()+"<br>");
		out.println("lastname: "+bean.getLastName()+"<br>");
		out.println("Dob: "+bean.getDob()+"<br>");
		out.println("Gender: "+bean.getGender()+"<br>");
		out.println("language: "+bean.getLangauge()+"<br>");
		out.println("address: "+bean.getAddress()+"<br>");
		out.println("City: "+bean.getCity()+"<br>");
		out.println("Ph.Number: "+bean.getPhoneNumber()+"<br>");
		out.println("Acc.Number: "+bean.getAccountNumber()+"<br>");
		out.println("Pan Number: "+bean.getPan()+"<br>");
		out.println("Credit card: "+bean.getCreditCard()+"<br>");
		out.println("Duration: "+bean.getDurationYears()+"<br>");
		out.println("ROI: "+bean.getRateOfInterest()+"<br>");
		out.println("Loan amount: "+bean.getLoanAmount()+"<br>");
		out.println("Loan Type: "+bean.getLoanType()+"<br>");
		out.println("Email Id: "+bean.getEmailId()+"<br>");
		
		
		
	
	}

}
