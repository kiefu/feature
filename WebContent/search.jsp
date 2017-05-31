<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><c:out value="検索画面"></c:out></title>
</head>
<body>
    <h1>
        <a>検索</a>
    </h1>
    <form:form modelAttribute="employee">
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
            </tbody>
        </table>
        <input type="submit" />
    </form:form>
    <tr><td><a href="${pageContext.request.contextPath}/regoster">登録</a></td>
    <a>一覧</a>
    <c:if test="${not empty searchList}">

        <table border="1">
            <tbody>
                <tr>
                    <th>ID</th>
                    <th>氏名</th>
                    <th>詳細</th>
                </tr>
                <c:forEach var="search" items="${searchList}">
                    <tr><td><a href="${pageContext.request.contextPath}/detail/${detail.id}/">詳細</a></td>
                        <td><c:out value="${search.id}"></c:out></td>
                        <td><c:out value="${search.name}"></c:out></td>
                        <td><c:out value="${search.description}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>