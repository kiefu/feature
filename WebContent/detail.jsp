<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>詳細画面</title>
</head>
<table>
<tr>
<td>ID　：</td>
<td>{$deatail.id}</td>
</tr>
<tr>
<td>氏名　：</td>
<td>{$deatail.name}</td>
</tr>
<tr>
<td>画像</td>
<td>{$deatail.file}</td>
</tr>
<tr>
<td>備考　：</td>
<td>{$deatail.description}</td>
</tr>
</table>
<form input path="{$deatail.id}"/></p>
<input type="submit" value="更新"  a href="${pageContext.request.contextPath}/update/${detail.id}/"/>
<input type="submit" value="削除" a href="${pageContext.request.contextPath}/delete/${detail.id}/">
<body>

</body>
</html>