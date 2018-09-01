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


<body class="homepage is-preload">
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

<div id="page-wrapper">

			<!-- Header -->
				<section id="header" class="wrapper">

					<!-- Logo -->
						<div id="logo">
							<h1><a href="#">영화 상세 페이지</a></h1>
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

			<!-- Intro -->
				<section id="intro" class="wrapper style2">
					<div class="title">Real box office</div>
					<div class="container">
						<p class="style1">영화 상세 정보</p>

<c:if test="${not empty movieInfoResult}">
<div>
	<table class="type11">
	<tbody>
		<tr>
			<td>
				<c:choose>
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '공작'}">
					<img src="images/movie_공작.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '너의 결혼식'}">
					<img src="images/movie_너의 결혼식.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '맘마미아!2'}">
					<img src="images/movie_맘마미아!2.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '메가로돈'}">
					<img src="images/movie_메가로돈.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '목격자'}">
					<img src="images/movie_목격자.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '몬스터 호텔 3'}">
					<img src="images/movie_몬스터 호텔 3.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '신과함께-인과 연'}">
					<img src="images/movie_신과함께-인과 연.jpg" width="300px"/>			
				</c:when>
			
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '미션 임파서블: 폴아웃'}">
					<img src="images/movie_미션 임파서블-폴아웃.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '나를 차버린 스파이'}">
					<img src="images/movie_나를 차버린 스파이.jpg" width="300px"/>		
				</c:when>	
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '마일22'}">
					<img src="images/movie_마일22.jpg" width="300px"/>		
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '인랑'}">
					<img src="images/movie_인랑.jpg" width="300px"/>		
				</c:when>
				
				<c:when test="${empty requestScope.items.image}">
					<img src="images/noImage.png" width="150px"/>
				</c:when>
				
				<c:otherwise>
					<img src="${requestScope.items.image}" width="150px"/>
				</c:otherwise>
						
			
			</c:choose>
			</td>
			
			<td>
				<h3 style="font-size: 30px; font-weight: bold">
				${movieInfoResult.movieInfoResult.movieInfo.movieNm}
				</h3>
				&nbsp;${movieInfoResult.movieInfoResult.movieInfo.movieNmEn}<br><br><br>
			
			<b>개요:</b> &nbsp;&nbsp;
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.genres}" var="genre">
				${genre.genreNm}
			</c:forEach><br>
			<b>국가:</b> &nbsp;&nbsp;
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.nations}" var="nation">
				${nation.nationNm}
			</c:forEach><br>
			<b>개봉일:</b>&nbsp;&nbsp; ${movieInfoResult.movieInfoResult.movieInfo.openDt}&nbsp;${movieInfoResult.movieInfoResult.movieInfo.prdtStatNm}<br>
			<b>감독:</b>&nbsp;&nbsp; ${movieInfoResult.movieInfoResult.movieInfo.directors[0].peopleNm}<br>
			<b>출연: </b>&nbsp;&nbsp;
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.actors}" var="actor">
				${actor.peopleNm},
			</c:forEach><br>
			<b>등급:</b>&nbsp;&nbsp; ${movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }
			<c:if test="${empty movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }">
			전체이용가&nbsp;&nbsp;
			</c:if><br>	
			<b>네이버 평점:</b>&nbsp;&nbsp; ${requestScope.items.userRating}<br>
			</td>
		</tr>   
    
    </tbody>
</table>
</div>
</c:if>

<br><br><br>



<c:if test="${not empty requestScope.rank2}">
	<p class="style1">흥행 지수 분석</p>
	<div>
		<table class="type11">
			
	    	<tr class="odd"  align="center">
					<td>누적 관객</td>
					<td>긍정지수</td>
					<td>리뷰 다양성 지수</td>
				</tr>
				<tr align="center">
					<td>
					${requestScope.audiAcc}
						<c:if test="${empty requestScope.audiAcc}">
							-
						</c:if>
					</td>
					<td>
						${requestScope.review_score}
					</td>
					<td>
						${requestScope.review_variety}
					</td>
				</tr>
				<tr  class="odd"  align="center">
					<td>박스 오피스 순위</td>
					<td>흥행종합지수</td>
					<td>흥행순위</td>
				</tr>
				<tr  align="center">
					<td>
						${requestScope.rank}
						<c:if test="${empty requestScope.rank}">
							-
						</c:if>
					</td>
					<td>
						${requestScope.pop_score}
					</td>
					<td>
						${requestScope.rank2}
					</td>
				</tr>
				<tr>
				</tr>
				</table>
				<table class="type10">
				<tr>
					<td colspan="3"   align="center">
						<c:choose>
							<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '미션 임파서블: 폴아웃'}">
								<img src="images/wordCloud_미션 임파서블-폴아웃.png" width="500px" height="500px"/>			
							</c:when>
							<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '맘마미아!2'}">
								<img src="images/wordCloud_맘마미아2.png" width="500px" height="500px"/>			
							</c:when>
							<c:otherwise>
							<img src="images/wordCloud_${movieInfoResult.movieInfoResult.movieInfo.movieNm}.png"/>
							</c:otherwise>
						</c:choose>
					</td>
				</tr>
	    	
		</table>
</div>
</c:if>

						</ul>
					</div>
				</section>




						<!-- Features -->
							<section id="features">

								<div class="feature-list">
									<div class="row">
										<div class="col-6 col-12-medium">
											<section>
												</section>
										</div>
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