<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SuccessFully Registered</h1>
<h2>Name:${rb.firstName}${rb.lastName} </h2>
<h2>Email:${rb.email}</h2>

<h2>Profession:<c:forEach items="${rb.profession}" var="profession">
<c:out value="${profession}"></c:out>
</c:forEach></h2>

<h2>Hobby:<c:forEach  items="${rb.hobby}" var="hobby">
<c:out value="${hobby}"></c:out>

</c:forEach></h2>

</body>
</html>