package com.demo.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dto.Model;
import com.demo.exception.Exception2;

/**
 * Servlet implementation class HtmlForm
 */
@WebServlet("/HtmlForm")
public class HtmlForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String add = request.getParameter("address");
		String gender = request.getParameter("gender");
		String lang = request.getParameter("lang");
		String city = request.getParameter("city");
		String email = request.getParameter("emailid");
		String accno = request.getParameter("accno");
		String pan = request.getParameter("PAN");
		String credit = request.getParameter("credit");
		int years = Integer.parseInt(request.getParameter("credit"));
		double interest = Double.parseDouble(request.getParameter("roi"));
		double loan = Double.parseDouble(request.getParameter("amt"));
		String type = request.getParameter("loanType");
		String mobile = request.getParameter("phno");
		HttpSession session = request.getSession();

		Model model = new Model();
		try {
			if (!(fname.length() > 5)) {
				throw new ServletException(Exception2.ERROR1);
			}
			if (!(lname.length() > 5)) {
				throw new ServletException(Exception2.ERROR2);
			}
			if (!(add.length() > 0)) {
				throw new ServletException(Exception2.ERROR3);
			}

			if (!(mobile.matches("[7-9]{1}[0-9]{9}"))) {
				throw new ServletException(Exception2.ERROR4);
			}

			if (!(pan.matches("[A-Z]{4}[0-9]{5}[A-Z]{1}"))) {
				throw new ServletException(Exception2.ERROR5);
			}
			if (!(accno.length() > 10)) {
				throw new ServletException(Exception2.ERROR6);
			}

			if (!(credit.length() > 10)) {
				throw new ServletException(Exception2.ERROR7);
			}

			if (!(interest > 100.0)) {
				throw new ServletException(Exception2.ERROR8);
			}

			if (!(loan > 10000.0)) {
				throw new ServletException(Exception2.ERROR9);
			}

			if (years < 28) {
				throw new ServletException(Exception2.ERROR10);
			}

			model.setFname(fname);
			model.setLang(lang);
			model.setLname(lname);
			model.setGender(gender);
			model.setAddress(add);
			model.setCity(city);
			model.setEmail(email);
			model.setAccno(accno);
			model.setCard(credit);
			model.setInterest(interest);
			model.setLoanAmt(loan);
			model.setLoanType(type);
			model.setMobile(mobile);
			model.setPan(pan);
			model.setYears(years);

			session.setAttribute("model", model);
			dispatcher = request.getRequestDispatcher("/Servlet2");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.include(request, response);
			out.write(e.getMessage());

		}

	}
}
