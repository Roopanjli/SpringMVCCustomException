<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error{ 
color:Red;
}
.common{
color: Blue;
background-color: #ffEEEE;
border: 3px solid #ff0000;
}

</style>
</head>
<body>
<form:form action="Operation" method="POST" commandName="rb">
<form:errors path="*" element="div" cssClass="common"/>
<table>
<tr>
<td>FirstName</td>
<td><form:input path="firstName"/></td>
<td><form:errors path="firstName" cssClass="error"/></td>
</tr>
<tr>
<td>LastName</td>
<td><form:input path="lastName"/></td>
<td><form:errors path="lastName" cssClass="error"/></td>
</tr>
<tr>
<td>EmailId</td>
<td><form:input path="email"/></td>
<td><form:errors path="email" cssClass="error"/></td>
</tr>
<tr>
<td>Profession</td>
<td><form:select path="profession" items="${profession}"></form:select></td>
<td><form:errors path="profession" cssClass="error"/></td>
</tr>
<tr>
<td>Hobby</td>
<td><form:checkboxes path="hobby" items="${hobby}"/></td>
<td><form:errors path="hobby" cssClass="error"/></td>
</tr>
<tr>
<td></td><td><input type="submit" value="Register"></td><td></td>
</tr>
</table>
</form:form>
</body>
</html>