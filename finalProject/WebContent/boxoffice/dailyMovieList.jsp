<%@ page language="java" contentType="text/html; charset=UTF-8"
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
							<h1><a href="#">일간 박스오피스</a></h1>
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
					<div class="title">${requestScope.targetDt} 기준</div>
					<div class="container">

						<!-- Content -->
							<div id="content">
								<article class="box post">
									<header class="style1">
										<!-- <h2>Lorem ipsum dolor sit amet magna egestas<br class="mobile-hide" />
										morbi bibendum sed malesuada</h2>
										<p>Tempus feugiat veroeros sed nullam dolore</p> -->
										
										
										<%-- 
										<form action="${pageContext.request.contextPath}/cont?command=movieDailyList" method="post">
											일자:<input width="15px" type="text" name="targetDt" value="${requestScope.targetDt }">
											최대 출력갯수:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage }">
											영화구분:<select name="multiMovieYn">
												<option value="">-전체-</option>
												<option value="Y"<c:if test="${param.multiMovieYn eq 'Y'}"> selected="seleted"</c:if>>다양성영화</option>
												<option value="N"<c:if test="${param.multiMovieYn eq 'N'}"> selected="seleted"</c:if>>상업영화</option>
											</select>
											국적:<select name="repNationCd">
												<option value="">-전체-</option>
												<option value="K"<c:if test="${param.repNationCd eq 'K'}"> selected="seleted"</c:if>>한국</option>
												<option value="F"<c:if test="${param.repNationCd eq 'F'}"> selected="seleted"</c:if>>외국</option>
												</select>
											지역:<select name="wideAreaCd">
												<option value="">-전체-</option>
												</select>
											주간/주말구분:<select name="weekGb">
												<option value="1"<c:if test="${param.weekGb eq '1'}"> selected="seleted"</c:if>> 주말 </option>
												<option value="0"<c:if test="${param.weekGb eq '0'}"> selected="seleted"</c:if>> 주간 </option>
												<option value="2"<c:if test="${param.weekGb eq '2'}"> selected="seleted"</c:if>> 주중 </option>
												</select>
												<br/>
												<input type="submit" name="" value="조회">
										</form> --%>
										
										
										<form action="${pageContext.request.contextPath}/cont?command=movieDailyList" method="post">
											<table>
												<tr>
													<td align="right">일자:</td>
													<td><input width="15px" type="text" name="targetDt" value="${requestScope.targetDt }"></td>
													<td></td>
													<td align="right">영화구분:</td>
													<td>
														<select name="multiMovieYn">
															<option value="">-전체-</option>
															<option value="Y"<c:if test="${param.multiMovieYn eq 'Y'}"> selected="seleted"</c:if>>다양성영화</option>
															<option value="N"<c:if test="${param.multiMovieYn eq 'N'}"> selected="seleted"</c:if>>상업영화</option>
														</select>
													</td>
												</tr>
												<tr>
													<td align="right">국적:</td>
													<td>
														<select name="repNationCd">
															<option value="">-전체-</option>
															<option value="K"<c:if test="${param.repNationCd eq 'K'}"> selected="seleted"</c:if>>한국</option>
															<option value="F"<c:if test="${param.repNationCd eq 'F'}"> selected="seleted"</c:if>>외국</option>
														</select>
													</td>
													
													<td></td>
													<td align="right">지역:</td>
													<td>
														<select name="wideAreaCd">
															<option value="">-전체-</option>
														</select>
													</td>
													<td></td>
													
													<td align="right">주간/주말구분:</td>
													<td>
														<select name="weekGb">
															<option value="1"<c:if test="${param.weekGb eq '1'}"> selected="seleted"</c:if>> 주말 </option>
															<option value="0"<c:if test="${param.weekGb eq '0'}"> selected="seleted"</c:if>> 주간 </option>
															<option value="2"<c:if test="${param.weekGb eq '2'}"> selected="seleted"</c:if>> 주중 </option>
														</select>
													</td>
													
												</tr>
												<tr>
												<td></td>
												<td></td>
												<td></td>
												<td>
													<input type="submit" name="" value="조회">
												</td>
												
												</tr>
											
											
											
											
												
												
												
												</table>
										</form>
									</header>
									
									
									
									<!-- 데이터 출력  -->
									
									
									<table border="1" id="boxtab" class="type10">
										<thead>
										<tr>
											<th>순위</th>
											<th>영화명</th>
											<th>개봉일</th>
											<th>매출액</th>
											<th>매출액점유율</th>
											<th>매출액증감(전일대비)</th>
											<th>매출액증감비율(전일대비)</th>
											<th>누적매출액</th>
											<th>관객수</th>
											<th>관객수증감(전일대비)</th>
											<th>관객수증감비율(전일대비)</th>
											<th>누적관객수</th>
											<th>스크린수</th>
											<th>상영횟수</th>
										</tr>
										</thead>
									<c:if test="${not empty dailyResult.boxOfficeResult.dailyBoxOfficeList}">
										<c:forEach items="${dailyResult.boxOfficeResult.dailyBoxOfficeList}" var="boxoffice">
											<tr>
												<td>${boxoffice.rank}</td>
												<td>
													<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=<c:out value='${boxoffice.movieCd }'/>
													&movieNm=<c:out value='${boxoffice.movieNm}'/>
													&movieNmEn=<c:out value='${boxoffice.movieNmEn}'/>
													&audiAcc=<c:out value='${boxoffice.audiAcc}'/>
													&rank=<c:out value='${boxoffice.rank}'/>
													"
													>${boxoffice.movieNm }</a>
												</td>
												<td><c:out value="${boxoffice.openDt}"/></td>
												<td><c:out value="${boxoffice.salesAmt}"/></td>
												<td><c:out value="${boxoffice.salesShare}"/></td>
												<td><c:out value="${boxoffice.salesInten}"/></td>
												<td><c:out value="${boxoffice.salesChange}"/></td>
												<td><c:out value="${boxoffice.salesAcc}"/></td>
												<td><c:out value="${boxoffice.audiCnt}"/></td>
												<td><c:out value="${boxoffice.audiInten}"/></td>
												<td><c:out value="${boxoffice.audiChange}"/></td>
												<td><c:out value="${boxoffice.audiAcc}"/></td>
												<td><c:out value="${boxoffice.scrnCnt}"/></td>
												<td><c:out value="${boxoffice.showCnt}"/></td>
												
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