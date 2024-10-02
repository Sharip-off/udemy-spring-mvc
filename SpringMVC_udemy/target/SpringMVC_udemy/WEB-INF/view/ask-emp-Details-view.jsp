<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ask</title>
</head>
<body>
<h2>Input a details</h2>
<br><br>
<form:form action="showDetails" modelAttribute="employee">
    Employee name: <form:input path="name"/>
    <br><br>
    Employee surname: <form:input path="surname"/>
    <br><br>
    Employee salary: <form:input path="salary"/>
    <br><br>
    Employee department:<form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>