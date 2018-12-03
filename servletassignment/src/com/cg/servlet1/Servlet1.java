package com.cg.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.classentity.Entity;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
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
		
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String langauge=request.getParameter("lang");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String phoneNumber=request.getParameter("phno");
		String accountNumber=request.getParameter("accno");
		String pan=request.getParameter("PAN");
		String creditCard=request.getParameter("credit");
		String durationYears=request.getParameter("noofyr");
		String rateOfInterest=request.getParameter("roi");
		String loanAmount=request.getParameter("amt");
		String loanType=request.getParameter("loanType");
		String emailId=request.getParameter("emailid");
		
		Entity entity=new Entity();
		entity.setFirstName(firstName);
		entity.setLastName(lastName);
		entity.setDob(dob);
		entity.setGender(gender);
		entity.setLangauge(langauge);
		entity.setAddress(address);
		entity.setCity(city);
		entity.setPhoneNumber(phoneNumber);
		entity.setAccountNumber(accountNumber);
		entity.setPan(pan);
		entity.setCreditCard(creditCard);
		entity.setDurationYears(durationYears);
		entity.setRateOfInterest(rateOfInterest);
		entity.setLoanAmount(loanAmount);
		entity.setLoanType(loanType);
		entity.setEmailId(emailId);
		
		
		HttpSession session=request.getSession();
		
		
		/*session.setAttribute("firstName",firstName);
		session.setAttribute("lastName",lastName);
		session.setAttribute("dob",dob);
		session.setAttribute("gender",gender);
		session.setAttribute("address",address);
		session.setAttribute("city",city);
		session.setAttribute("phoneNumber",phoneNumber);
		session.setAttribute("accountNumber",accountNumber);
		session.setAttribute("pan",pan);
		session.setAttribute("creditCard",creditCard);
		session.setAttribute("durationYears",durationYears);
		session.setAttribute("rateOfInterest",rateOfInterest);
		session.setAttribute("loanAmount",loanAmount);
		session.setAttribute("loanType",loanType);
		session.setAttribute("emailId",emailId);
		session.setAttribute("langauge",langauge);*/
		
		
		
		session.setAttribute("data", entity);
		RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
	}

}
