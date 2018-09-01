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
	<title>Medium - ��ȭ �λ���Ʈ</title>
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
			<p>������ ó�����Դϴ�.
			<br>��ø� ��ٷ� �ּ���.</p>
		</div>
		<script type="text/javascript">
	        window.onbeforeunload = function () { $('.loading').show(); }  //���� ���������� �ٸ� �������� �Ѿ �� ǥ�����ִ� ���
	        $(window).load(function () {          //�������� �ε� �Ǹ� �ε� ȭ���� �����ִ� ��
	            $('.loading').hide();
	        });
		</script>

<div id="page-wrapper">

			<!-- Header -->
				<section id="header" class="wrapper">

					<!-- Logo -->
						<div id="logo">
							<h1><a href="#">��ȭ �� ������</a></h1>
							<!-- <p>A free responsive site template by HTML5 UP</p> -->
						</div>


					<!-- Nav -->
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

			<!-- Intro -->
				<section id="intro" class="wrapper style2">
					<div class="title">Real box office</div>
					<div class="container">
						<p class="style1">��ȭ �� ����</p>

<c:if test="${not empty movieInfoResult}">
<div>
	<table class="type11">
	<tbody>
		<tr>
			<td>
				<c:choose>
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '����'}">
					<img src="images/movie_����.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '���� ��ȥ��'}">
					<img src="images/movie_���� ��ȥ��.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�����̾�!2'}">
					<img src="images/movie_�����̾�!2.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�ް��ε�'}">
					<img src="images/movie_�ް��ε�.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�����'}">
					<img src="images/movie_�����.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '���� ȣ�� 3'}">
					<img src="images/movie_���� ȣ�� 3.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�Ű��Բ�-�ΰ� ��'}">
					<img src="images/movie_�Ű��Բ�-�ΰ� ��.jpg" width="300px"/>			
				</c:when>
			
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�̼� ���ļ���: ���ƿ�'}">
					<img src="images/movie_�̼� ���ļ���-���ƿ�.jpg" width="300px"/>			
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '���� ������ ������'}">
					<img src="images/movie_���� ������ ������.jpg" width="300px"/>		
				</c:when>	
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '����22'}">
					<img src="images/movie_����22.jpg" width="300px"/>		
				</c:when>
				
				<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�ζ�'}">
					<img src="images/movie_�ζ�.jpg" width="300px"/>		
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
			
			<b>����:</b> &nbsp;&nbsp;
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.genres}" var="genre">
				${genre.genreNm}
			</c:forEach><br>
			<b>����:</b> &nbsp;&nbsp;
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.nations}" var="nation">
				${nation.nationNm}
			</c:forEach><br>
			<b>������:</b>&nbsp;&nbsp; ${movieInfoResult.movieInfoResult.movieInfo.openDt}&nbsp;${movieInfoResult.movieInfoResult.movieInfo.prdtStatNm}<br>
			<b>����:</b>&nbsp;&nbsp; ${movieInfoResult.movieInfoResult.movieInfo.directors[0].peopleNm}<br>
			<b>�⿬: </b>&nbsp;&nbsp;
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.actors}" var="actor">
				${actor.peopleNm},
			</c:forEach><br>
			<b>���:</b>&nbsp;&nbsp; ${movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }
			<c:if test="${empty movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }">
			��ü�̿밡&nbsp;&nbsp;
			</c:if><br>	
			<b>���̹� ����:</b>&nbsp;&nbsp; ${requestScope.items.userRating}<br>
			</td>
		</tr>   
    
    </tbody>
</table>
</div>
</c:if>

<br><br><br>



<c:if test="${not empty requestScope.rank2}">
	<p class="style1">���� ���� �м�</p>
	<div>
		<table class="type11">
			
	    	<tr class="odd"  align="center">
					<td>���� ����</td>
					<td>��������</td>
					<td>���� �پ缺 ����</td>
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
					<td>�ڽ� ���ǽ� ����</td>
					<td>������������</td>
					<td>�������</td>
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
							<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�̼� ���ļ���: ���ƿ�'}">
								<img src="images/wordCloud_�̼� ���ļ���-���ƿ�.png" width="500px" height="500px"/>			
							</c:when>
							<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�����̾�!2'}">
								<img src="images/wordCloud_�����̾�2.png" width="500px" height="500px"/>			
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