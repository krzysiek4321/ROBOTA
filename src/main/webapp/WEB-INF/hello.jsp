<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>

<c:forEach items="${students}" var="item">
     ${item.name} <input type="button"  onclick="location.href='/user?=${item.name}'" value="Log in" ><br>

</c:forEach>
</body>
</html>