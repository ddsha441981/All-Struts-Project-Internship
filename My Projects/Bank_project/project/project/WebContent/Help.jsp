<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<title>Insert title here</title>

</head>
<body>
	<table>
		<tr>
			<td><img alt="logo" src="images/Logo.gif" height="100"
				width="200"></td>
			<td><h1>Welcome to E-Medical and Medicated Services</h1></td>
		</tr>

		<tr>
			<td>
				<ul>
<li><a href="HomePage.jsp">Home</a></li>
<li><a href="AboutUs.jsp">About Us</a></li>
<li><a href="ContactUs.jsp">Contact Us</a></li>
<li><a href="Help.jsp">help</a></li>
<li><a href="feedback.jsp">FeedBack</a></li>
</ul>
			</td>
			<td>
				<div align="right">
					<s:form action="mylogin" method="post">
						<s:textfield name="uname" label="Enter Name"></s:textfield>
						<s:password name="upass" label="Enter Password"></s:password>
						<s:submit value="Submit"></s:submit>
						<s:a href="Registration.jsp">
							<b>New User</b>
						</s:a>
					</s:form>
				</div>
			</td>
		</tr>
	</table>
	
	
	
	<center><h2>Help</h2></center>
	<p>References:
	<p>1."Definition – allopathy". The Free Dictionary. Farlex.
		Retrieved 25 October 2013. Citing: Gale Encyclopedia of Medicine
		(2008) and Mosby's Medical Dictionary, 8th ed. (2009).</p>
	<p>2.Whorton JC (2004). Oxford University Press US, ed. Nature
		Cures: The History of Alternative Medicine in America (illustrated
		ed.). New York: Oxford University Press.</p>
	<p>3.Xiaorui Zhang (2001). "Legal Status of Traditional Medicine
		and Complementary/Alternative Medicine: A Worldwide Review" (PDF).
		Archived (PDF) from the original on 26 September 2007.</p>
	<p>4.Hahnemann S (1810), Organon der Heilkunst, first edition.</p>
	<p>5. Wells, John C. (2009). Longman Pronunciation Dictionary.
		London: Pearson Longman.</p>
	<p>6. Populorum, Michael Alexander (2008-01-01). Trends und
		Beschäftigungsfelder im Gesundheits- und Wellness-Tourismus:
		Berufsentwicklung, Kompetenzprofile und Qualifizierungsbedarf in
		wellness-bezogenen Freizeit- und Gesundheitsberufen (in German).</p>
	<p>7. Acarya, Yadava Trivikramatmaja, ed. (1945). "Sutrasthana
		1.7-9". Susrutasa?hita. Bombay: Nir?ayasagara Press. pp. 2–3.</p>
	<p>8. Mathur KN (2003), Prinzipien der homöopathischen
		Verschreibung: Synopsis weltweiter klinischer Erfahrungen (in German),
		Georg Thieme Verlag, pp. 122–123</p>
	<p>9. Bellavite, Paolo; Conforti, Anita; Piasere, Valeria;
		Ortolani, Riccardo (2005), "Immunology and Homeopathy. 1. Historical
		Background", Evidence-Based Complementary and Alternative Medicine 2 (



	</body>
</html>