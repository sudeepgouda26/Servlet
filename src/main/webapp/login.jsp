
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= request.getAttribute("errorMsg") %>
<form action="login" method="post">

<input type="text" name="un" placeholder="enter your username" required>
<input type="password" name="pwd" placeholder="enter your password" required>
<button type="submit">login</button> 

</form>
</body>
</html>