<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	String[] strs = {"ab","abc","abcd","abcde"};

	ArrayList<String> alist = new ArrayList<String>();
	alist.add("AB");
	alist.add("ABC");
	alist.add("ABCD");
	alist.add("ABCDE");
	
	HashSet<String> hset = new HashSet<String>();
	hset.add("a");
	hset.add("ab");
	hset.add("abc");
	hset.add("abcd");
	//hashSet같은 순서가 정렬되지 않는 모음은
	//표현에 제약이 있기 때문에 오류가 난다. 
	//객체 자체는 표현이 되지만
	//순서를 정해서 표현하는 것은 오류가 난다
	
	//순서가 없더라도 표현할 수 있는 게 있다.
	//순서는 없지만 key값으로 구분이 가능하기 때문이다.
	//json의 표현과 유사하다.
	HashMap<String,String> hmap = new HashMap<String,String>();
	hmap.put("key1","val1");
	hmap.put("key2","val2");
	hmap.put("key3","val3");
	hmap.put("key4","val4");
	
	com.bit.entity.JavaBean bean = null;
	bean = new com.bit.entity.JavaBean();
	
	bean.setSu1(1234);
	bean.setSu2(3.14);
	bean.setCh('A');
	bean.setBoo(true);
	bean.setMsg("bean object");
	bean.setNalja(new Date());

	pageContext.setAttribute("bean", bean); 
	
	//pageContext.setAttribute("strs", strs); 
	//pageContext.setAttribute("list", hset); 
	//pageContext.setAttribute("map", hmap); 
	//pageContext.setAttribute("list", alist); //해당페이지에서만 쓸수있는 list 저장
%>
<body>
	<h1>자료 표현</h1>
	<ul>
	<!-- 변수명으로 접근하는 것 같지만 getter로 접근한다(써져있는 이름으로 된)
	getter setter는 약속을 지켜서 이름을 만들어야한다
	따라서 JavaBean에 getter가 없으면 오류가 난다 -->
		<li>${bean.su1}</li>
		<li>${bean.su2}</li>
		<li>${bean.ch}</li>
		<li>${bean.boo}</li>
		<li>${bean.msg}</li>
		<li>${bean.nalja}</li>
	</ul>
	<!-- 
	<dl>
		<dt>0</dt>
		<dd>${map.key1 }</dd>
	</dl>
	<dl>
		<dt>1</dt>
		<dd>${map.key2 }</dd>
	</dl>
	<dl>
		<dt>2</dt>
		<dd>${map.key3 }</dd>
	</dl>
	<dl>
		<dt>3</dt>
		<dd>${map.key4 }</dd>
	</dl>
	 -->
</body>
</html>