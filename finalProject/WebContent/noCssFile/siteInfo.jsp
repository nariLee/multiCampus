<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Medium - 영화 인사이트</title>
		<meta charset="utf-8" />
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
.nav{margin:0 auto;}
</style>
<body class="is-preload">

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
					</header>

				<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li class="active"><a href="main.jsp">This is Medium</a></li>
						</ul>
								
						<ul>
							<li class="current"><a href="site_intro.html">사이트소개</a></li>
								<li>
									<a href="all_movie.html">전체영화</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieList">영화 리스트</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=peopleList">배우 리스트</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=peopleList2">감독 리스트</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=companyList">영화사 리스트</a></li>
									</ul>
								</li>
								<li>
									<a href="ing.html">상영중인 영화</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieDailyList">일간 순위</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieWeeklyList">주간 순위</a></li>
									</ul>
								</li>
								<!-- <li><a href="right-sidebar.html">상영예정 영화</a></li> -->
								<!-- <li><a href="no-sidebar.html">제작시 예상 흥행지수</a></li> -->
								<li><a href="analysis.jsp">제작시 예상 흥행지수</a></li>
								
							</ul>
							<ul>
								<h4><a href="index.html" class="btn">LOGOUT</a></h4>
							</ul>
					</nav>

				<!-- Main -->
					<div id="main">

						<!-- Post -->
							<section class="post">
								<header class="major">
									<span class="date">This is Medium!</span>
									<h1>이 영화,<br />
									진짜로 흥행할까?</h1>
								</header>
								<div class="image main"><img src="images2/pic01.png" alt="" /></div>
							</section>

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

	</body>
</html>