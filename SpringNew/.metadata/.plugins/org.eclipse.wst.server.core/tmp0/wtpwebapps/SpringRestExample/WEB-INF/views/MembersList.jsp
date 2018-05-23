<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Members</h1>
<br></br>
Members:- ${members}
<br></br>

<c:forEach items="${members}" var="employee">
        <tr>
            <td>Name: <c:out value="${employee.name}"/></td>
            <br></br>
            
            <td>Phone: <c:out value="${employee.phone}"/></td>  
            <br></br>
            
            <td>Email: <c:out value="${employee.email}"/></td>  
        <br></br>
        
        </tr>
    </c:forEach>
</body>
</html>