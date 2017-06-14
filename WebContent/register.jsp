<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3>登録</h3>
<table>
<form method="post" action="register.jsp">
<tr>
<td>ID：</td><input type="text" value="id" />
</tr>
<tr>
<td>氏名　：</td><input type="text" value="name" />
</tr>
<tr>
<td>画像: </td>
<td>ファイルアップロード </td><input type="file" value="file" />
</tr>
<tr>
<td>備考　：</td>
<input type="text" value="description" />
</tr>
<tr>
<td>確定</td><type="text" value="確定" /></td>
</tr>
</form>
</table>

</body>
</html>