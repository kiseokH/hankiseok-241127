<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>


<html>
<head>
<meta charset=UTF-8">
<title>코드그룹 정보 출력창</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="pink">
      <td><b>번호</b></td>
      <td><b>구분</b></td>
      <td><b>제목</b></td>
      <td><b>등록일</b></td>
   </tr>

 <c:forEach var="notice" items="${noticeList}">
            <tr align="center">
                <td>${notice.n_idx}</td>
                <td>${notice.n_category}</td>
                <td>${notice.n_title}</td>
                <td>${notice.n_regdate}</td>
                <td>${notice.n_update}</td>
                <td>${notice.n_status}</td>
                <td>
     <a href="${contextPath}/notice/detail.do?n_idx=${notice.n_idx}">상세보기</a>
    </tr>
  </c:forEach>
</table>
</body>
</html>
