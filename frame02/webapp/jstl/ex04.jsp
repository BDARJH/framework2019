<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="msgs" value="java,web,db,spring"></c:set>
	<c:forTokens items="${msgs}" delims="," var="msg">
	<!-- 반복문 (java의 tokenizer 생각하면 됨)
	items = 자를 대상, delims = 구분자
	var = 자르고 나온 변수
	-->
	<p>${msg }</p>
	</c:forTokens>
	<p>begin</p>
	<!-- import - url에 해당하는 page를 가져와서 보여준다 -->
	<c:import url="ex03.jsp"></c:import>
	<p>end</p>
	<!-- url객체 : 주소객체 
	해당 주소에 param값을 넣어주면
	그 주소로 가면 req.getAttribute를 해줄 수 있음
	-->
	<c:url value="target.jsp" var="target">
		<c:param name="id" value="admin"></c:param>
	</c:url>
	<c:redirect url="${target }"></c:redirect><!-- 바로 해당 페이지로 redirect -->
	<a href="${target }">link</a>
	<c:import url="https://www.naver.com"></c:import>
	<!-- hidden으로 숨겨서 xml(api)을 넣고 원하는 값만 갖고와서 뿌릴 수 있다 -->
</body>
</html>