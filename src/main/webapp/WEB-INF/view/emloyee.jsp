<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><c:out value="${title}"></c:out></title>
</head>
<body>
    <h1>
        <c:out value="${title}"></c:out>
    </h1>
    <p>
        <c:out value="${message}"></c:out>
    </p>
    <form:form modelAttribute="searchlistform">
        <table>
            <tbody>
            	<tr>
                    <td><form:label path="id">id</form:label></td>
                    <td><form:input path="age" size="20" /></td>
             	</tr>
                <tr>
                    <td><form:label path="name">氏名</form:label></td>
                    <td><form:input path="name" size="20" /></td>
                </tr>

                <tr>
                    <td><form:label path="description">詳細</form:label></td>
                    <td><form:textarea path="description" cols="20" row="5" /></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" />
    </form:form>
    <c:if test="${not empty serachList}">
        <table border="1">
            <tbody>
                <tr>
                    <th>ID</th>
                    <th>氏名</th>
                    <th>アイコン</th>
                    <th>詳細</th>
                </tr>
                <c:forEach var="serach" items="${serachList}">
                    <tr>
                        <td><c:out value="${serach.id}"></c:out></td>
                        <td><c:out value="${serach.name}"></c:out></td>
                        <td><c:out value="${serach.description}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>