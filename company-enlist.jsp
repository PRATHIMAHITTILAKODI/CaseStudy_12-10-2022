<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1 style="color:red">
<u><i>Enlist Company</i></u>
</h1>
<form:form action="company" method="post" modelAttribute="companyRecord">
<h2>
Company Id:<form:input type="hidden" path="companyId" />
<br/><br/>
 Company Name:<form:input type="text" path="companyName"/>
<br/><br/>
 Company sharePrice:<form:input type="text" path="sharePrice"/>
<br/><br/>
<button type="submit">Submit</button>
</h2>
</form:form>
</div>
</body>
</html>