<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HTML Form Demo</h1>

	<form action="HtmlForm">
		<table>
			<tr>
				<td>Enter First name :</td>
				<td><input type="text" name="fname" /><br /></td>
			</tr>
			<tr>
				<td>Enter Last name :</td>
				<td><input type="text" name="lname" /><br /></td>

			</tr>
			<tr>
				<td>Enter your Gender :</td>
				<td><input type="radio" value="Male" name="gender" checked>Male
					<input type="radio" value="Female" name="gender" />Female <br /></td>
			</tr>
			<tr>
				<td>Select your Language :</td>
				<td><input type="checkbox" value="English" name="lang">
					English <input type="checkbox" value="Hindi" name="lang">
					Hindi <input type="checkbox" value="French" name="lang">
					French <br /></td>
			</tr>

			<tr>
				<td>Enter your address :</td>
				<td><textarea rows="6" cols="30" name="address">Type here</textarea><br /></td>

			</tr>
			<tr>
				<td>Select City :</td>
				<td><select name="city">
						<option value="Select City">Select</option>
						<option value="Delhi">Delhi</option>
						<option value="Pune">Pune</option>
						<option value="Harayana">Harayana</option>
						<option value="Bareilly">Bareilly</option>
				</select></td>
			</tr>

			<tr>
				<td>Enter Mobile Number :</td>
				<td><input type="text" name="phno" /><br /></td>
			</tr>
			<tr>

				<td>Enter Account Number :</td>
				<td><input type="text" name="accno" /><br /></td>
			</tr>

			<tr>
				<td>Enter PAN Number :</td>
				<td><input type="text" name="PAN" /><br /></td>
			</tr>


			<tr>
				<td>Enter Credit Card Number :</td>
				<td><input type="text" name="credit" /><br /></td>
			<tr>
			<tr>
				<td>Enter Number of Years For Loan :</td>
				<td><input type="number" name="noofyr" /><br /></td>
			</tr>

			<tr>
				<td>Enter Rate of Interest :</td>
				<td><input type="number" name="roi" /><br /></td>
			</tr>
			<tr>
				<td>Enter Loan Amount :</td>
				<td><input type="number" name="amt" /><br /></td>
			</tr>
			<tr>
				<td>Select Loan Type :</td>
				<td><select name="loanType">
						<option value="loan type">Loan Type</option>
						<option value="Home">Home</option>
						<option value="Car">Car</option>
						<option value="Personal">Personal</option>
						<option value="Education">Education</option>

				</select></td>
			</tr>
			<tr>
				<td>Enter your EmailId :
				<td><input type="email" name="emailid" title="Enter ur email" /><br /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>
	</form>
</body>
</html>