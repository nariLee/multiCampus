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

<body  class="homepage is-preload">
	
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
							<h1><a href="#">영화 흥행지수 분석</a></h1>
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
						<p class="style1">관람객 순위와 Medium 흥행지수가 가장 차이나는 영화 목록</p>


<div style="width:50%; float:left; padding:50px;">
	<table class="type10">
    <thead>
    <tr>
        <th scope="cols">순위</th>
        <th scope="cols">영화명</th>
         <th scope="cols">누적관객수</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20186202&movieNm=신과함께-인과 연&movieNmEn=&audiAcc=11541545&rank=4&review_score=1867&review_variety=11524&pop_score=202.96&rank2=1">신과함께-인과 연</a>
        </td>
        <td>11541545</td>
        
    </tr>
    <tr class="even">
        <th scope="row">2</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20181181&movieNm=미션 임파서블: 폴아웃&movieNmEn=&audiAcc=6472118&rank=2&review_score=2732&review_variety=451&pop_score=1.58&rank2=7">미션 임파서블: 폴아웃</a>
        </td>
        <td>6472118</td>
        
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20179101&movieNm=공작&movieNmEn=&audiAcc=4289216&rank=3&review_score=-254&review_variety=7948&pop_score=115.02&rank2=2">공작</a>
        </td>
        <td>4289216</td>
    </tr>
    <tr class="even">
        <th scope="row">4</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20181942&movieNm=맘마미아!2&movieNmEn=&audiAcc=1732298&rank=5&review_score=10309&review_variety=7044&pop_score=103.74&rank2=3">맘마미아!2</a>
        </td>
        <td>1732298</td>
    </tr>
    <tr>
        <th scope="row">5</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20170670&movieNm=목격자&movieNmEn=&audiAcc=1696742&rank=2&review_score=-395&review_variety=472&pop_score=4.72&rank2=5">목격자</a>
        </td>
        <td>1696742</td>
        
    </tr>
    <tr class="even">
        <th scope="row">6</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20184802&movieNm=몬스터 호텔 3&movieNmEn=&audiAcc=946548&rank=7&review_score=439&review_variety=368&pop_score=1.59&rank2=6">몬스터 호텔 3</a>
        </td>
        <td>946548</td>
        
    </tr>
    <tr>
        <th scope="row">7</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20183584&movieNm=메가로돈&movieNmEn=&audiAcc=469430&rank=8&review_score=221&review_variety=274&pop_score=0.23&rank2=9">메가로돈</a>
        </td>
        <td>469430</td>
        
    </tr>
    <tr class="even">
        <th scope="row">8</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20153446&movieNm=너의 결혼식&movieNmEn=&audiAcc=130339&rank=1&review_score=-359&review_variety=496&pop_score=11.25&rank2=4">너의 결혼식</a>
        </td>
        <td>130339</td>
        
    </tr>
    <tr>
        <th scope="row">9</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20187647&movieNm=나를 차버린 스파이&movieNmEn=&audiAcc=39686&rank=6&review_score=-4274&review_variety=394&pop_score=0.78&rank2=8">나를 차버린 스파이</a>
        </td>
        <td>39686</td>
        
    </tr>
    <tr class="even">
        <th scope="row">10</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20187657&movieNm=마일22&movieNmEn=&audiAcc=3451&rank=10&review_score=17&review_variety=9&pop_score=0.01&rank2=10">마일22</a>
        </td>
        <td>3451</td>
    </tr>
    <%-- <tr>
        <th scope="row">11</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20170942&movieNm=인랑&movieNmEn=&audiAcc=893168&rank=11">인랑</a>
        </td>
        <td>893168</td>
    </tr> --%>
    
    </tbody>
</table>
</div>

<div style="width:50%; float:left; padding:50px;">
	<table class="type10">
    <thead>
    <tr>
        <th scope="cols">흥행순위</th>
        <th scope="cols">영화명</th>
         <th scope="cols">흥행종합지수</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>신과함께-인과 연</td>
        <td>202.96</td>
    </tr>
    <tr class="even">
        <th scope="row">2</th>
        <td>공작</td>
        <td>115.02</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>맘마미아!2</td>
        <td>103.74</td>
    </tr>
    <tr class="even">
        <th scope="row">4</th>
        <td>너의 결혼식</td>
        <td>11.25</td>
    </tr>
    <tr>
        <th scope="row">5</th>
        <td>목격자</td>
        <td>4.72</td>
    </tr>
    <tr class="even">
        <th scope="row">6</th>
        <td>몬스터 호텔3</td>
        <td>1.59</td>
    </tr>
    <tr>
        <th scope="row">7</th>
        <td>미션 임파서블: 폴아웃</td>
        <td>1.58</td>
    </tr>
    <tr class="even">
        <th scope="row">8</th>
        <td>나를 차버린 스파이</td>
        <td>0.78</td>
    </tr>
    <tr>
        <th scope="row">9</th>
        <td>메가로돈</td>
        <td>0.23</td>
    </tr>
    <tr class="even">
        <th scope="row">10</th>
        <td>마일22</td>
        <td>0.01</td>
    </tr>
    
    </tbody>
</table>
</div>


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