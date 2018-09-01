<!--
	로그인 후 화면
-->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Medium - 영화 인사이트</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
		<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width"/>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
		<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700,700italic,400italic'>
		<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css'>
		<link rel="stylesheet" href="assets2/css/style.css">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets2/css/main.css" />
		<meta name="google-signin-scope" content="profile email">
		<meta name="google-signin-client_id" content="YOUR_CLIENT_ID.apps.googleusercontent.com">
		<noscript><link rel="stylesheet" href="assets2/css/noscript.css" /></noscript>


</head>
<style>
	.subtitle{color: white; text-align: center;}
</style>
<body>
<body class="is-preload">



		<!-- Wrapper -->
			<div id="wrapper" class="fade-in">


				<!-- Intro -->
					<div id="intro">
						<h1 style ="color: white;">Medium<br />
						영화 인사이트</h1>
						<p style="color: white; text-align:center;"> 관람객 수, <br />
						흥행의 전부가 아니다! </p>
						<ul class="actions">
							<li><a href="#header" class="button icon solo fa-arrow-down scrolly">Continue</a></li>
						</ul>
						
						<!-- Nav -->
							<nav id="nav">
								<ul class="links">
									<li class="active"><a href="${pageContext.request.contextPath}/cont?command=dailySummary">This is Medium</a></li>
								</ul>
								<ul>
									<!--로그인 회원가입 팝업-->

									<h4><a href="index.html" class="btn">LOGOUT</a></h4>

										
												</section>
										</div>
									</div>

								</ul>
							</nav>


						
					</div>

				<!-- Header -->
					<header id="header">
						<a href="${pageContext.request.contextPath}/cont?command=dailySummary" class="logo">Medium</a>
					</header>


				<!-- Main -->
					<div id="main">

						<!-- Featured Post -->
							<article class="post featured">
								<header class="major">
									<span class="date">This is Medium!</span>


									<!-- <h2><p style="text-align:center">이 영화,<br />
									진짜로 흥행할까?</p></h2> -->
								</header>
								<!-- <a href="#" class="image main"><img src="images2/pic01.png" alt="" /></a> -->
								
								
								
								
								
								
								
								
								<!-- 영화 차트 순위 -->
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
								
								
								
								
								
								
								
								
								
								
								
								
								
								<ul class="actions special">
									<li><a href="medium.jsp" class="button large" >분석 페이지로 바로 가기</a></li>
								</ul>
							</article>
					</div>

				<!-- Footer -->
					<!-- <footer id="footer">
						<section>
							<form method="post" action="#">
								<div class="fields">
									<div class="field">
										<label for="name">Name</label>
										<input type="text" name="name" id="name" />
									</div>
									<div class="field">
										<label for="email">Email</label>
										<input type="text" name="email" id="email" />
									</div>
									<div class="field">
										<label for="message">Message</label>
										<textarea name="message" id="message" rows="3"></textarea>
									</div>
								</div>
								<ul class="actions">
									<li><input type="submit" value="Send Message" /></li>
								</ul>
							</form>
						</section>
						<section class="split contact">
							<section class="alt">
								<h3>Address</h3>
								<p>1234 Somewhere Road #87257<br />
								Nashville, TN 00000-0000</p>
							</section>
							<section>
								<h3>Phone</h3>
								<p><a href="#">(000) 000-0000</a></p>
							</section>
							<section>
								<h3>Email</h3>
								<p><a href="#">info@untitled.tld</a></p>
							</section>
							<section>
								<h3>Social</h3>
								<ul class="icons alt">
									<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
									<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
									<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
									<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								</ul>
							</section>
						</section>
					</footer> -->

				<!-- Copyright -->
					<div id="copyright">
						<ul><li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li></ul>
					</div>

			</div>

		<!-- Scripts -->
			<script src="assets2/js/jquery.min.js"></script>
			<script src="assets2/js/jquery.scrollex.min.js"></script>
			<script src="assets2/js/jquery.scrolly.min.js"></script>
			<script src="assets2/js/browser.min.js"></script>
			<script src="assets2/js/breakpoints.min.js"></script>
			<script src="assets2/js/util.js"></script>
			<script src="assets2/js/main.js"></script>
			<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
			<script src='https://andwecode.com/wp-content/uploads/2015/10/jquery.leanModal.min_.js'></script>
			<script src="assets2/js/index.js"></script>
			<script src="assets2/js/kakaologin.js"></script>
			<script src="https://apis.google.com/js/platform.js" async defer></script>
			<!-- <script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>
			<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
			<script type='text/javascript'>
			  //<![CDATA[
			    // 사용할 앱의 JavaScript 키를 설정해 주세요.

					Kakao.init('03e0428212c5429884cf69ed4aeec3cc');
			    // 카카오 로그인 버튼을 생성합니다.
			    Kakao.Auth.createLoginButton({
			      container: '#kakao-login-btn',
			      success: function(authObj) {
			        alert(JSON.stringify(authObj));
			      },
			      fail: function(err) {
			         alert(JSON.stringify(err));
			      }
			    });

			  //]]>
		</script>
			<script type="text/javascript">
				var naverLogin = new naver.LoginWithNaverId(

					{
						clientId: "UTKGihje_l4m4VPzgGYn",
						callbackUrl: "http://localhost:80/finalProject/callback.jsp",
						isPopup: false,
						loginButton: {color: "green", type: 3, height: 48}
					}
				);
				naverLogin.init();
			</script> -->



</body>
</html>