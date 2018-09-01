<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>


</head>
<body>
	<p>
		<button onclick="location.href='http://localhost/finalProject/cont?command=movieDailyList'">일간</button>
		<button onclick="location.href='http://localhost/finalProject/cont?command=movieWeeklyList'">주간</button>
	</p>
	<p>
		<button onclick="location.href='http://localhost/finalProject/cont?command=peopleList'">배우</button>
		<button onclick="location.href='http://localhost/finalProject/cont?command=peopleList2'">감독</button>
	</p>
	<p>
		<button onclick="location.href='http://localhost/finalProject/cont?command=movieList'">영화</button>
	</p>
	<p>
		<button onclick="location.href='http://localhost/finalProject/cont?command=companyList'">영화사</button>
	</p>
	<script> 
	
	</script>

	
	
	<form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
		<input type="text" name="movieNm" placeholder="작품 제목을 검색해보세요."> 
		<input type="submit" name="" value="검색">
	</form>

</body>
</html>