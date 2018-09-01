<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>

<title>Medium - 영화 인사이트</title>
</head>
<style>
	.loading{
		width: 100%;
   height: 100%;
   top: 0;
   left: 0;
   position: fixed;
   display: block;
   background-color: #fff;
   z-index: 99;
   text-align: center;
   margin-bottom: 200px; padding-bottom: 200px;
		
	}
	.loading-image{display:block; margin-left:45%; margin-top: 15%; text-align: center; z-index: 100;}
</style>

<body>
	
	<div class="loading">
		<img src="images/loading4.gif" class="loading-image"/>
		<p>데이터 처리중입니다.
		<br>잠시만 기다려 주세요.</p>
	</div>
	<script type="text/javascript">
        window.onbeforeunload = function () { $('.loading').show(); }  //현재 페이지에서 다른 페이지로 넘어갈 때 표시해주는 기능
        $(window).load(function () {          //페이지가 로드 되면 로딩 화면을 없애주는 것
            $('.loading').hide();
        });
	</script>
<body class="no-sidebar is-preload">
		<div id="page-wrapper">

			<!-- Header -->
				<section id="header" class="wrapper">

					<!-- Logo -->
						<div id="logo">
							<h1><a href="#">전체 배우 리스트</a></h1>
							<!-- <p>A free responsive site template by HTML5 UP</p> -->
						</div>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="active"><a href="${pageContext.request.contextPath}/medium.jsp">This is Medium</a></li>
								<li class="current"><a href="site_intro.jsp">사이트소개</a></li>
								<li>
									<a href="#">전체영화</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieList">영화 리스트</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=peopleList">배우 리스트</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=peopleList2">감독 리스트</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=companyList">영화사 리스트</a></li>
									</ul>
								</li>
								<li>
									<a href="#">상영중인 영화</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieDailyList">일간 순위</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieWeeklyList">주간 순위</a></li>
									</ul>
								</li>
								<!-- <li><a href="right-sidebar.html">상영예정 영화</a></li> -->
								<!-- <li><a href="no-sidebar.html">제작시 예상 흥행지수</a></li> -->
								<li><a href="analysis.jsp">영화 흥행지수 분석</a></li>
							</ul>
						</nav>

				</section>

			<!-- Main -->
				<div id="main" class="wrapper style2">
					<div class="title"></div>
					<div class="container">

						<!-- Content -->
							<div id="content">
								<article class="box post">
									<header class="style1">
										<!-- <h2>Lorem ipsum dolor sit amet magna egestas<br class="mobile-hide" />
										morbi bibendum sed malesuada</h2>
										<p>Tempus feugiat veroeros sed nullam dolore</p> -->
										
										<form action="${pageContext.request.contextPath}/cont?command=peopleList" method="post">
											현재페이지 :<input type="text" name="curPage" value="${requestScope.curPage}">
											최대 출력갯수:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage}">
											영화인명:<input type="text" name="peopleNm" value="${requestScope.peopleNm}">		
											필모리스트:<input type="text" name="filmoNames" value="${requestScope.filemoNames}"> <br/>
											
												<br/>
											<input type="submit" name="" value="조회">
										</form>	
									</header>
									
									
									
									<!-- 데이터 출력  -->
									
									
									<c:out value="${peopleResult.peopleListResult.totCnt}"/>
										<table border="1" class="type10">
											<thead>
												<tr>
													<!-- <th>영화인코드</th> --><th>영화인명</th><th>영화인명(영문)</th><th>분야</th><th>필모리스트</th>	
												</tr>
											</thead>
											 <c:if test="${not empty peopleResult.peopleListResult.peopleList}">
										<c:forEach items="${peopleResult.peopleListResult.peopleList}" var="people">
											<tr>
												<c:if test="${people.repRoleNm eq '배우'}">
													<%-- <td><c:out value="${people.peopleCd }"/></td> --%>
													<td><c:out value="${people.peopleNm }"/></td>
													<td><c:out value="${people.peopleNmEn }"/></td>
													<td><c:out value="${people.repRoleNm}"/></td>
													<td><c:out value="${people.filmoNames}"/></td>
												</c:if>
											</tr>
										</c:forEach>
										</c:if>
										</table>
									
									
									
									
									
									
									
									
									
									
								</article>
							</div>

					</div>
				</div>

				

			<!-- Footer -->
				<section id="footer" class="wrapper">
					<div class="title">The Rest Of It</div>
					<div class="container">
							
						<div id="copyright">
							<ul>
								<li>&copy; Untitled.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</div>
				</section>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>