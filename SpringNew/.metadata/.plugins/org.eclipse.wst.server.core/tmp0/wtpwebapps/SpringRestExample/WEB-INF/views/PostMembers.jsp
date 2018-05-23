<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${message} 
<br></br>
<form:form method="post" modelAttribute="member" action="addMembers">

Name:-<form:input path="name" />
<br></br>
Phone:-<form:input path="phone" />
<br></br>
Email:-<form:input path="email" />
<br></br>

<button type="submit">Submit</button>
<br></br>
<a href="getMembers">ShowMembers</a>



</form:form>
</body>
</html>