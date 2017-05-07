<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>更新確認画面</title>
</head>
<body>
    <h1>更新</h1>

    <form:form modelAttribute="updateDto">
    <table>
        <tr><td>ID:</td>${updateDto.id}</tr>
        <tr><td>氏名:</td><form:input path="name"/></tr>
        <tr><td>備考:</td><form:input path="description"/></tr>
        <tr><td>アイコン:</td><form method="POST" enctype="multipart/form-data" action="../UploadServlet">
		<input type="file" name="file"/><br />
		<input type="submit" value="アップロード"/></form>
		</tr>
       	<tr>確定<input type="submit"><tr/>
    </table>
    </form:form>

</body>
</html>