<!-- �м������� ���� -->


<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
	<title>Medium - ��ȭ �λ���Ʈ</title>
</head>


<style>
.green_window {
	display: inline-block;
	width: 366px; height: 34px;
	background: white;
	border-radius: 4px;
	vertical-align: bottom;


}
.input_text {
	width: 348px; height: 21px;
	margin: 6px 0 0 9px;
	border: 0;
	line-height: 21px;
	font-weight: bold;
	font-size: 50px;
	outline: none;
	vertical-align: bottom;

}
.sch_smit {
	width: 10px; height: 35px;
	margin: 0; border: 0;
	vertical-align: bottom;
	background: #ea9283;
	color: white;
	font-weight: bold;
	border-radius: 4px;
	cursor: pointer;

}
.sch_smit:hover {
	background: #ea9283;
}











/*��ȭ �����̵�  */
* {
  box-sizing: border-box;
}

/* Position the image container (needed to position the left and right arrows) */
.container {
  position: relative;
}

/* Hide the images by default */
.mySlides {
  display: none;
}

/* Add a pointer when hovering over the thumbnail images */
.cursor {
  cursor: pointer;
}

/* Next & previous buttons */
.prev,
.next {
  cursor: pointer;
  position: absolute;
  top: 40%;
  width: auto;
  padding: 16px;
  margin-top: -50px;
  color: white;
  font-weight: bold;
  font-size: 20px;
  border-radius: 0 3px 3px 0;
  user-select: none;
  -webkit-user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover,
.next:hover {
  background-color: rgba(0, 0, 0, 0.8);
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* Container for image text */
.caption-container {
  text-align: center;
  background-color: #222;
  padding: 2px 16px;
  color: white;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Six columns side by side */
.column {
  float: left;
  width: 16.66%;
}

/* Add a transparency effect for thumnbail images */
.demo {
  opacity: 0.6;
}

.active,
.demo:hover {
  opacity: 1;
}
</style>

	</head>
	<body class="homepage is-preload">
		<div id="page-wrapper">

			<!-- Header -->
				<section id="header" class="wrapper">

					<!-- Logo -->

						<div id="logo">
							<h1><a href="#">MEDIUM</a></h1>

						</div>




						<div style="display: table; width: 600px; position: absolute; height:130px;">
							<div style="position: absolute; top: 100%; display: table-cell; vertical-align: top; text-align:center,">
								<div style="position: relative; top: -500%; left: 10%;">
									<div>
									
											<form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
												<span class='green_window'>
													<input type='text' name="movieNm" placeholder="��ǰ���� �˻��غ�����.">
												</span>
												<button type='submit' class='sch_smit'>�˻�</button>
											</form>
									
						  			</div>
								<br>

								<div>

									<!-- <img src="images2/search.png" width=722 height=235 > -->

									<br>
									<br>

								</div>

					</div>
				</div>
			</div>



					
						 <nav id="nav">
							
							<ul>
								<li class="active"><a href="${pageContext.request.contextPath}/medium.jsp">This is Medium</a></li>
								<li class="current"><a href="site_intro.jsp">����Ʈ�Ұ�</a></li>
								<li>
									<a href="#">��ü��ȭ</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieList">��ȭ ����Ʈ</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=peopleList">��� ����Ʈ</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=peopleList2">���� ����Ʈ</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=companyList">��ȭ�� ����Ʈ</a></li>
									</ul>
								</li>
								<li>
									<a href="#">������ ��ȭ</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieDailyList">�ϰ� ����</a></li>
										<li><a href="${pageContext.request.contextPath}/cont?command=movieWeeklyList">�ְ� ����</a></li>
									</ul>
								</li>
								<!-- <li><a href="right-sidebar.html">�󿵿��� ��ȭ</a></li> -->
								<!-- <li><a href="no-sidebar.html">���۽� ���� ��������</a></li> -->
								<li><a href="analysis.jsp">��ȭ �������� �м�</a></li>
							</ul>
						</nav>

				</section>




			<!-- ��ȭ ��� �����̵� -->
				<section id="footer" class="wrapper">
					<div class="title">���� �� ��ȭ</div>
					<div class="container">
						<header class="style1">
							<!-- <h2>���� ������ ��ȭ</h2> -->
								<!-- Container for the image gallery -->
									<div class="container">
									
									  <!-- Full-width images with number text -->
									  <div class="mySlides">
									    <div class="numbertext">1 / 12</div>
									      <img src="images/movie_���� ��ȥ��.jpg" style="width:30%">
									  </div>
									
									  <div class="mySlides">
									    <div class="numbertext">2 / 12</div>
									      <img src="images/movie_�Ű��Բ�-�ΰ� ��.jpg" style="width:30%">
									  </div>
									
									  <div class="mySlides">
									    <div class="numbertext">3 / 12</div>
									      <img src="images/movie_����.jpg" style="width:30%">
									  </div>
									
									  <div class="mySlides">
									    <div class="numbertext">4 / 12</div>
									      <img src="images/movie_�����.jpg" style="width:30%">
									  </div>
									
									  <div class="mySlides">
									    <div class="numbertext">5 / 12</div>
									      <img src="images/movie_�����̾�!2.jpg" style="width:30%">
									  </div>
									
									  <div class="mySlides">
									    <div class="numbertext">6 / 12</div>
									      <img src="images/movie_���� ȣ�� 3.jpg" style="width:30%">
									  </div>
									  
									  <div class="mySlides">
									    <div class="numbertext">7 / 12</div>
									      <img src="images/movie_�̼� ���ļ���-���ƿ�.jpg" style="width:30%">
									  </div>
									  
									  <div class="mySlides">
									    <div class="numbertext">8 / 12</div>
									      <img src="images/movie_���� ������ ������.jpg" style="width:30%">
									  </div>
									  
									  <div class="mySlides">
									    <div class="numbertext">9 / 12</div>
									      <img src="images/movie_�ް��ε�.jpg" style="width:30%">
									  </div>
									  
									  <div class="mySlides">
									    <div class="numbertext">10 / 12</div>
									      <img src="images/movie_������ ���󿡸�-������ ������.jpg" style="width:30%">
									  </div>
									  
									  <div class="mySlides">
									    <div class="numbertext">11 / 12</div>
									      <img src="images/movie_������ ���ī��-��Ǳ� �ô�.jpg" style="width:30%">
									  </div>
									  
									  <div class="mySlides">
									    <div class="numbertext">12 / 12</div>
									      <img src="images/movie_����22.jpg" style="width:30%">
									  </div>
									
									  <!-- Next and previous buttons -->
									  <a class="prev" onclick="plusSlides(-1)" style="left: 0px">&#10094;</a>
									  <a class="next" onclick="plusSlides(1)">&#10095;</a>
									
									  <!-- Image text -->
									  <div class="caption-container">
									    <p id="caption"></p>
									  </div>
									
									  <!-- Thumbnail images -->
									  <div class="row">
									    <div class="column">
									      <img class="demo cursor" src="images/movie_���� ��ȥ��.jpg" style="width:100%" onclick="currentSlide(1)" alt="���� ��ȥ��">
									    </div>
									    <div class="column"> 
									      <img class="demo cursor" src="images/movie_�Ű��Բ�-�ΰ� ��.jpg" style="width:100%" onclick="currentSlide(2)" alt="�Ű��Բ�- �ΰ� ��">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_����.jpg" style="width:100%" onclick="currentSlide(3)" alt="����">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_�����.jpg" style="width:100%" onclick="currentSlide(4)" alt="�����">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_�����̾�!2.jpg" style="width:100%" onclick="currentSlide(5)" alt="�����̾�!2">
									    </div> 
									    <div class="column">
									      <img class="demo cursor" src="images/movie_���� ȣ�� 3.jpg" style="width:100%" onclick="currentSlide(6)" alt="���� ȣ�� 3">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_�̼� ���ļ���-���ƿ�.jpg" style="width:100%" onclick="currentSlide(7)" alt="�̼� ���ļ���:���ƿ�">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_���� ������ ������.jpg" style="width:100%" onclick="currentSlide(8)" alt="���� ������ ������">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_�ް��ε�.jpg" style="width:100%" onclick="currentSlide(9)" alt="�ް��ε�">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_������ ���󿡸�-������ ������.jpg" style="width:100%" onclick="currentSlide(10)" alt="������ ���󿡸�:������ ������">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_������ ���ī��-��Ǳ� �ô�.jpg" style="width:100%" onclick="currentSlide(11)" alt="������ ���ī��:��Ǳ� �ô�">
									    </div>
									    <div class="column">
									      <img class="demo cursor" src="images/movie_����22.jpg" style="width:100%" onclick="currentSlide(12)" alt="����22">
									    </div>
									  </div>
									</div>
						</header>
						<!-- <div class="row">
							
							
						</div> -->
						
						
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
	<script>
	
	var slideIndex = 1;
	showSlides(slideIndex);

	// Next/previous controls
	function plusSlides(n) {
	  showSlides(slideIndex += n);
	}

	// Thumbnail image controls
	function currentSlide(n) {
	  showSlides(slideIndex = n);
	}

	function showSlides(n) {
	  var i;
	  var slides = document.getElementsByClassName("mySlides");
	  var dots = document.getElementsByClassName("demo");
	  var captionText = document.getElementById("caption");
	  if (n > slides.length) {slideIndex = 1}
	  if (n < 1) {slideIndex = slides.length}
	  for (i = 0; i < slides.length; i++) {
	    slides[i].style.display = "none";
	  }
	  for (i = 0; i < dots.length; i++) {
	    dots[i].className = dots[i].className.replace(" active", "");
	  }
	  slides[slideIndex-1].style.display = "block";
	  dots[slideIndex-1].className += " active";
	  captionText.innerHTML = dots[slideIndex-1].alt;
	}
	
	</script>



	</body>
	
</html>