<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 상세</title>
</head>
<body>
<h1>회원 정보</h1>

<c:if test="${not empty member}">
<c:if test="${not empty member.photo}">
<c:set var="photo80x80Url">../../upload/${member.photo}_80x80.jpg</c:set>
<c:set var="photoUrl">../../upload/${member.photo}</c:set>
</c:if>
<c:if test="${empty member.photo}">
<c:set var="photo80x80Url">../../images/person_80x80.jpg</c:set>
<c:set var="photoUrl"></c:set>
</c:if>

<form action="update" method="post" enctype="multipart/form-data">
<table border='1'>
  <tbody>
<tr>
<th>번호</th>
<td><input type="text" name="no" value="${member.no}" readonly></td></tr>
<tr>
<tr>
<th>이름</th>
<td><input type="text" name="name" value="${member.name}" ></td></tr>
<tr>
<tr>
<th>이메일</th>
<td><input type="email" name="email" value="${member.email}" readonly></td></tr>
<tr>
<tr>
<th>전화 번호</th>
<td><input type="tel" name="tel" value="${member.tel}" ></td></tr>
<tr>
<tr>
<th>주소</th>
<td><input type="text" name="address" value="${member.address}" ></td></tr>
<tr>
<tr>
    <th>사진</th> 
    <td><a href='${photoUrl}'>
    <img src='${photo80x80Url}'></a><br>
    <input name='photoFile' type='file'></td></tr>
  </tbody>
  <tfoot>
  <tr><td colspan="2">
<input type='submit' value='변경'> <a href='delete?no=${member.no}'>삭제</a> 
  </td></tr>
  </tfoot>
  </table>
  </form>
</c:if>

<c:if test="${empty member}">
  <p>해당 번호의 회원이 없습니다.</p>
</c:if>

<p><a href="list">목록</a></p>
</body>
</html>