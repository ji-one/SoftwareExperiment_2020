<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="mon_test.Calc" %>
<jsp:useBean id ="mon_test" class="mon_test.Calc" scope="page"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = request.getParameter("input_str");
		int num = Integer.parseInt(str);
	%>
	<%=mon_test.Factorial(num)%>
</body>
</html>