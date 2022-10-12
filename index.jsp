<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company Share List</title>
</head>
<body>
<div align="center">
<h1 style="color:LightGreen">
<u><i>Company Share List</i></u>
</h1>
<h4>
<a href="company-enlist" style="color:magenta">Enlist a new company</a>
</h4>

<h3>

<table border="2" style="color:yellow">
<tr style="background-color:orange">
 <th style="color:blue">COMPANY ID</th>
  <th style="color:blue">COMPANY NAME</th>
   <th style="color:blue">SHARE PRICE</th>
     <th style="color:blue">Actions</th></tr>
   <c:forEach items="${companyList}" var="company">
   <tr style="background-color:yellow">
    <td style="color:blue">${company.companyId}</td>
    <td style="color:blue">${company.companyName}</td>
    <td style="color:blue">${company.sharePrice}</td>
     <td style="color:blue"><h5>
     
     &nbsp;&nbsp;&nbsp;<a href = "edit-sharePrice/${company.companyId}" style="color:magenta">Edit Share Price</a>
     &nbsp;&nbsp;&nbsp;<a href="delete-company/${company.companyId}" style="color:magenta">Delete Company</a>
     </h5></td>
     </tr></h1>
   </c:forEach>
</table>
</h3>
</div>
</body>
</html>