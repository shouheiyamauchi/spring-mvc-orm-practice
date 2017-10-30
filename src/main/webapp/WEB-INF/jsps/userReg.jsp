<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"
	integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
	crossorigin="anonymous"></script>
</head>
<script>
	$(document).ready(function() {
		$("#id").change(function() {
			console.log("Value in ID field changed");
		})
	})
</script>
<body>
	<form action="registerUser" method="post">
		<pre>
			ID: <input type="text" name="id" id="id" />
			Name: <input type="text" name="name" />
			Email: <input type="text" name="email" />
			<input type="submit" name="register" />
		</pre>
	</form>

	<br />${result}
</body>
</html>