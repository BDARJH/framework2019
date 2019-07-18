<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- jstl 기본 설정 c는 core를 의미, prefix는 바꿔줄 수 있다 하지만 기본적으로 c -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl(Java server pages Standard Tag Library)</h1>
	<!-- 출력 -->
	<ul>
	<li><c:out value="1234"></c:out></li>
	<li><c:out value="java"></c:out></li>
	<li><c:out value="${null }">jstl</c:out></li>
	</ul>
	<!-- value가 필수속성이라 없으면 오류 -->
	<!-- 태그 사이의 텍스트는 value가 null일때만 나온다. -->
	<!-- value를 null처리 해주고 싶으면 el 표현식을 쓴다. -->
	<c:set var="msg" value="abcd" ></c:set>
	<!-- 특정스코프에 자동으로 값 설정 attribute로 -->
	<ul>
		<li>${pageScope.msg }</li>
		<li>${requestScope.msg }</li>
		<li>${sessionScope.msg }</li>
		<li>${applicationScope.msg }</li>
		<li><c:out value="${msg }"></c:out></li>
	</ul>	
	<jsp:useBean id="bean" class="com.bit.entity.JavaBean" scope="page"></jsp:useBean>
	<c:set target="${bean }" property="su1" value="123"></c:set>
	<c:set target="${bean }" property="su2" value="3.14"></c:set>
	<c:set target="${bean }" property="ch" value="@"></c:set>
	<c:set target="${bean }" property="boo" value="true"></c:set>
	<c:set target="${bean }" property="msg" value="abcde"></c:set>
	<!--<jsp:useBean id="nalja" class="java.util.Date" scope="page"></jsp:useBean>-->
	<c:set target="${bean }" property="nalja" value="<%=new java.util.Date() %>"></c:set>
	
	<ul>
		<li>${bean.su1 }</li>
		<li>${bean.su2 }</li>
		<li>${bean.ch }</li>
		<li>${bean.boo }</li>
		<li>${bean.msg }</li>
		<li>${bean.nalja }</li>
	</ul>
</body>
</html>