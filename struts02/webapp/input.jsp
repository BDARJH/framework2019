<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="result.action">
		<div>
			<label for="id">id</label>
			<input type="text" name="id" id="id"/>
		</div>
		<div>
			<label for="pw">pw</label>
			<input type="password" name="pw" id="pw"/>
		</div>
		<div>
			<button type="submit">전송</button>
		</div>
	</form>
</body>
</html>