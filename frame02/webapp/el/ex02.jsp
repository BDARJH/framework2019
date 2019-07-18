<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String msg = "hello el";
	pageContext.setAttribute("msg", msg);
	//el표현식으로 출력하려면 pageContext.setAttribute를 하면 된다
	//page scope 이용 = 동일 페이지에서만 값이 유지됨
	//req scope = 페이지-페이지 사이에서만 값이 유지
	//그렇다면 page랑 req랑 같은 이름의 값을 던져주면 어떻게 되나?
	//page scope만 나온다
	//scope의 우선순위는 page > req > session > application (중복일 경우)
	//중복일 때는 확실히 지정해서 불러올 수 있는데
	//변수앞에 어떤 스코프에서 값을 가져오는 지 명시하면 된다.
	//requestScope.msg 이런식으로 어떤스코프.변수명
	%>
	<h1>동작</h1>
	<p>${pageScope.msg}</p>
	<p>${requestScope.msg}</p>
	<p>${sessionScope.msg}</p>
	<p>${applicationScope.msg}</p>
	<p>${msg2}</p>
</body>
</html>