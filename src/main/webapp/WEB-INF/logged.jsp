<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Student Information</h2>
<c:forEach items="${course}" var="item">
    ${item.name}<br>

</c:forEach>
</body>
</html>