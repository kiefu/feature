<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<title>削除確認画面/title>
</head>
<body>
    <h1>削除</h1>
    *下記のデータを削除しますか？
 <table>
<tr><td>ID　：</td><td>{$id}</td></tr>
<tr><td>氏名　：</td><td>{$name}</td></tr>
<tr><td>画像</td></tr>{$file}<tr>
<td>備考　：</td><td>{$description}</td>
</tr>
</table>
        <input type="submit" value="削除" />>
</body>
</html>