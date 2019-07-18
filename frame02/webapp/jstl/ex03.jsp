<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>제어문-반복문</h1>
	<c:forEach begin="1" end="10" step="3" var="idx" varStatus="status">
	<!-- 1부터 10까지 반복, step은 증가하는 수,
	var로 변수를 설정해주면 index도 볼 수 있다
	varStatus는 jstl의 객체(객체 속성값 확인가능)-->
		<p>${idx }출력${status.step }</p>
	</c:forEach>
	<hr>
	<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("set1");
		hset.add("set2");
		hset.add("set3");
		hset.add("set1");
		hset.add("set2");
		//중복처리 가능
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		hmap.put("key1","val1");
		hmap.put("key2","val2");
		hmap.put("key3","val3");
		hmap.put("key4","val4");
		
		pageContext.setAttribute("alist", hmap);
	%>
	<ul>
	<c:forEach items="${alist }" var="msg" varStatus="status">
	<!-- jstl의 객체로 index를 부를 수도 있다. -->
		<li>${status.index }-${msg.value }</li>
		<!-- hashmap을 넣었다면 변수에 .key나 .value를 넣어 해당값을 불러올 수도 있다 -->
	</c:forEach>		
	</ul>
</body>
</html>