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
	
	input {width=15px;}
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
							<h1><a href="#">전체 영화 리스트</a></h1>
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
										
										<%-- <form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
											현재페이지 :<input type="text" name="curPage" value="${requestScope.curPage}">
											최대 출력갯수:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage}">
											감독명:<input type="text" name="directorNm" value="${requestScope.directorNm}">		
											영화명:<input type="text" name="movieNm" value="${requestScope.movieNm}"> <br/>
											개봉연도조건:<input type="text" name="openStartDt" value="${requestScope.openStartDt}"> ~ <input type="text" name="openEndDt" value="${requestScope.openEndDt}">
											제작연도조건:<input type="text" name="prdtStartYear" value="${requestScope.prdtStartYear}"> ~ <input type="text" name="prdtEndYear" value="${requestScope.prdtEndYear}">		
									
											국적:<select name="repNationCd">
													<option value="">-전체-</option>
													<c:forEach items="${nationCd.codes}" var="code">
													<option value="<c:out value="${code.fullCd}"/>"<c:if test="${param.repNationCd eq code.fullCd}"> selected="seleted"</c:if>><c:out value="${code.korNm}"/></option>
													</c:forEach>
												</select><br/>
											영화형태:
												<c:forEach items="${movieTypeCd.codes}" var="code" varStatus="status">
												<input type="checkbox" name="movieTypeCdArr" value="<c:out value="${code.fullCd}"/>" id="movieTpCd_<c:out value="${code.fullCd}"/>"/> <label for="movieTpCd_<c:out value="${code.fullCd}"/>"><c:out value="${code.korNm}"/></label>
												<c:if test="${status.count %4 eq 0}"><br/></c:if>
												</c:forEach>
												<br/>
											<input type="submit" name="" value="조회">
										</form> --%>
										
										<form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
											<table>
											<tr>
												<td align="right">페이지 이동:</td>
												<td><input type="text" name="curPage" value="${requestScope.curPage}"></td>
												<td align="right">출력수: </td>
												<td><input type="text" name="itemPerPage" value="${requestScope.itemPerPage }"></td>
													<td></td>
													<td></td>
													<td></td>
													<td align="right">감독명:</td>
												<td><input type="text" name="directorNm" value="${requestScope.directorNm}"></td>
												<td>&nbsp;&nbsp;&nbsp;</td>
												<td align="right">영화명:</td>
												<td><input type="text" name="movieNm" value="${requestScope.movieNm}"> <br/></td>
											
											</tr>
											<tr>
												<td align="right">개봉연도 조건:</td>
												<td><input type="text" name="openStartDt" value="${requestScope.openStartDt}"> </td> 
												<td>~</td>
												<td><input type="text" name="openEndDt" value="${requestScope.openEndDt}"></td>
												<td></td>
												<td align="right">제작연도조건:</td>
												<td><input type="text" name="prdtStartYear" value="${requestScope.prdtStartYear}"></td>
												<td>~</td>
												<td><input type="text" name="prdtEndYear" value="${requestScope.prdtEndYear}"></td>
												<td></td>
												<td align="right">국적:</td>
												<td>
													<select name="repNationCd">
														<option value="">-전체-</option>
														<c:forEach items="${nationCd.codes}" var="code">
														<option value="<c:out value="${code.fullCd}"/>"<c:if test="${param.repNationCd eq code.fullCd}"> selected="seleted"</c:if>><c:out value="${code.korNm}"/></option>
														</c:forEach>
													</select>
												</td>
											</tr>
											<tr>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td><input type="submit" name="" value="조회"></td>
											</tr>
											
											
											</table>
										</form>
									</header>
									
									
									
									<!-- 데이터 출력  -->
									
									<c:out value="${movieResult.movieListResult.totCnt}"/>
										<table border="1" class="type10">
		<tr>
			<thead>
				<th width="5px">영화명</th><th>영화명(영)</th><th>제작연도</th><th>개봉연도</th><th>영화유형</th><th>제작상태</th><th>제작국가</th>
				<th>영화장르</th><th>대표제작국가</th><th>대표장르</th><th>영화감독</th><th>제작사</th>
			</thead>
		</tr>
		<c:if test="${not empty movieResult.movieListResult.movieList}">
			<c:forEach items="${movieResult.movieListResult.movieList}" var="movie">
				<tr>
					<td>
						<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=<c:out value='${movie.movieCd}'/>
						&movieNm=<c:out value='${movie.movieNm}'/>
						&movieNmEn=<c:out value='${movie.movieNmEn}'/>"
						>${movie.movieNm}</a>
						
						 <form action="cont?command=movieList" method="post" name="formName" id="formId">
							<input type="hidden" name="movieName" id="movieName" value="${movie.movieNm}"/>
							<!-- <input type="submit" value="dd"> -->
						</form>
					</td>
					<td><c:out value="${movie.movieNmEn}"/></td><!-- 영화명(영문) -->
					<td><c:out value="${movie.prdtYear}"/></td><!-- 제작연도 -->
					<td><c:out value="${movie.openDt}"/></td><!-- 개봉연도 -->
					<td><c:out value="${movie.typeNm}"/></td><!-- 영화유형 -->
					<td><c:out value="${movie.prdtStatNm}"/></td><!-- 제작상태 -->
					<td><c:out value="${movie.nationAlt}"/></td><!-- 제작국가 -->
					<td><c:out value="${movie.genreAlt}"/></td><!-- 영화장르 -->
					<td><c:out value="${movie.repNationNm}"/></td><!-- 대표제작국가 -->
					<td><c:out value="${movie.repGenreNm}"/></td><!-- 대표장르명 -->
					<td><c:forEach items="${movie.directors}" var="director"><c:out value="${director.peopleNm}"/>,</c:forEach></td><!-- 영화감독 -->
					<td><c:forEach items="${movie.companys}" var="company"><c:out value="${company.companyNm}"/>,</c:forEach></td>	<!-- 제작사 -->		
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