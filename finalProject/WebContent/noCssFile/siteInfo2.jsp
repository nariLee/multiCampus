<!--
	로그인 후 화면
-->


<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Medium - 영화 인사이트</title>
<meta charset="utf-8">
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
						<!-- <h1 style ="color: white;">Medium<br />
						영화 인사이트</h1>
						<p style="color: white; text-align:center;"> 영화 관계자를 위한 <br />
						빅데이터를 통한 진짜 흥행 분석! </p>
						<ul class="actions">
							<li><a href="#header" class="button icon solo fa-arrow-down scrolly">Continue</a></li>
						</ul> -->
						
						<!-- Nav -->
							<nav id="nav">
								<ul class="links">
									<li class="active"><a href="main.jsp">This is Medium</a></li>
								</ul>
								<ul>
									<h4><a href="index.html" class="btn">LOGOUT</a></h4>
								</ul>
							</nav>	
					</div>
			</div>


				<!-- Header -->
					<!-- <header id="header">
						<a href="main.jsp" class="logo">Medium</a>
					</header> -->


				<!-- Main -->
					<div id="main">

						<!-- Featured Post -->
							<article class="post featured">
								<header class="major">
									<span class="date">This is Medium!</span>


									<h2><p style="text-align:center">이 영화,<br />
									진짜로 흥행할까?</p></h2>
								</header>
								<a href="#" class="image main"><img src="images2/pic01.png" alt="" /></a>
								<%-- <ul class="actions special">
									<li><a href="${pageContext.request.contextPath}/cont?command=movieDailyList" class="button large" >분석 페이지로 바로 가기</a></li>
								</ul> --%>
							</article>
					</div>

				<!-- Footer -->
					<footer id="footer">
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
					</footer>

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
			<script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>
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
			</script>



</body>
</html>