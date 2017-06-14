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
    <form:form modelAttribute="searchForm" action="${action}">
       <div>
           <form:label path="id">ID</form:label><br />
           <form:input path="id"/>
      </div>
      <div>
      		<form:label path="name">氏名</form:label><br />
      		<form:input path="name"/>
		</div>
    <div>
    </div>
   	 <input type="submit" value="検索" />
	</form:form>


   <a href="${pageContext.request.contextPath}/register">登録</a>
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