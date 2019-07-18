<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL 표현식</h1>
	<!-- 표현을 쉽게 하기 위해 만들어진 문법 -->
	<table>
		<tr>
			<th>자료형</th>
			<th>Java</th>
			<th>EL</th>
		</tr>
		<tr>
			<td>String</td>
			<td><%="abcd"+"ABCD"%></td>
			<td>${"ABCD"}</td>
			<!-- 표현하기 위해 만들어졌기 때문에 연산기호 쓸 수 없다 -->
		</tr>
		<tr>
			<td>String</td>
			<td><%out.print("ABCD"); %></td>
			<td>${'ABCD'}</td>
			<!-- 문자와 문자열을 구분하지 않는다-->
		</tr>
		<tr>
			<td>숫자(정수)</td>
			<td><%=1234-1 %></td>
			<td>${1234-1}</td>
			<!-- 숫자 타입일 때 기본적인 사칙연산이 가능하다 + - * / -->
		</tr>
		<tr>
			<td>숫자(정수 - 나눗셈)</td>
			<td><%=5/2 %></td>
			<td>${5 div 2}</td>
			<!-- 하지만 나눗셈일 경우 el타입은 정수나눗셈을 자동으로 실수로 반환해준다. -->
			<!-- 나머지가 그대로 나오게 됨 -->
			<!-- 나눗셈 / 는 태그를 닫는다고 인식할 가능성이 높기 때문에 div로 처리 -->
		</tr>
		<tr>
			<td>실수</td>
			<td><%=3.14 %></td>
			<td>${3.14}</td>
			<!--  -->
		</tr>
		<tr>
			<td>실수(연산)</td>
			<td><%=6.000000001-2.000000009 %></td>
			<td>${6.000000001-2.000000009}</td>
			<!-- java와 똑같이 처리, 오차범위도 똑같이 표현해준다
			정수,실수 연산의 경우 실수로 반환 -->
		</tr>
		<tr>
			<td>boolean(true/false)</td>
			<td><%=false %></td>
			<td>${false}</td>
			<!-- 똑같이 true false 표현 -->
		</tr>
		<tr>
			<td>boolean(==)</td>
			<td><%=3==2+1 %></td>
			<td>${3 eq 2+1}</td>
			<!-- 3<2 와 같은 기본 연산은 똑같이 잘 처리
			하지만 3==2+1 같은 연산은 다르게 처리해준다 -->
		</tr>
		<tr>
			<td>boolean(>)</td>
			<td><%=3>2 %></td>
			<td>${3 gt 2}</td>
		</tr>
		<tr>
			<td>boolean(&lt;)</td>
			<td><%=3<2 %></td>
			<td>${3 lt 2}</td>
		</tr>
		<tr>
			<td>boolean(>=)</td>
			<td><%=3>=2 %></td>
			<td>${3 ge 2}</td>
		</tr>
		<tr>
			<td>boolean(&lt;=)</td>
			<td><%=3<=2 %></td>
			<td>${3 le 2}</td>
		</tr>
		<tr>
			<td>null</td>
			<td><%String msg=null;
			out.print(msg);
			%></td>
			<td>${msg}</td>
			<!-- null은 빈값, el에서는 없는것을 표현해주지 않는다 -->
			<!-- el은 변수를 못쓴다 -->
			<!-- 회원가입시 조건을 걸 필요 없이(null이냐 null이 아니냐에 따라)
			el로 적어놓으면 그냥 있으면 해당 문구가 나오고 빈값이면 문구가 안나오게 된다 -->
		</tr>	
	</table>
</body>
</html>