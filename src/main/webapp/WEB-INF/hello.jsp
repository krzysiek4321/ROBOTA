<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>

<c:forEach items="${students}" var="item">
    ${item.id} ${item.name}<br>

</c:forEach>
</body>
</html>