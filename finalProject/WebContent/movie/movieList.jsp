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
	
	input {width=15px;}
</style>

<body>
	
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
<body class="no-sidebar is-preload">
		<div id="page-wrapper">

			<!-- Header -->
				<section id="header" class="wrapper">

					<!-- Logo -->
						<div id="logo">
							<h1><a href="#">��ü ��ȭ ����Ʈ</a></h1>
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
											���������� :<input type="text" name="curPage" value="${requestScope.curPage}">
											�ִ� ��°���:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage}">
											������:<input type="text" name="directorNm" value="${requestScope.directorNm}">		
											��ȭ��:<input type="text" name="movieNm" value="${requestScope.movieNm}"> <br/>
											������������:<input type="text" name="openStartDt" value="${requestScope.openStartDt}"> ~ <input type="text" name="openEndDt" value="${requestScope.openEndDt}">
											���ۿ�������:<input type="text" name="prdtStartYear" value="${requestScope.prdtStartYear}"> ~ <input type="text" name="prdtEndYear" value="${requestScope.prdtEndYear}">		
									
											����:<select name="repNationCd">
													<option value="">-��ü-</option>
													<c:forEach items="${nationCd.codes}" var="code">
													<option value="<c:out value="${code.fullCd}"/>"<c:if test="${param.repNationCd eq code.fullCd}"> selected="seleted"</c:if>><c:out value="${code.korNm}"/></option>
													</c:forEach>
												</select><br/>
											��ȭ����:
												<c:forEach items="${movieTypeCd.codes}" var="code" varStatus="status">
												<input type="checkbox" name="movieTypeCdArr" value="<c:out value="${code.fullCd}"/>" id="movieTpCd_<c:out value="${code.fullCd}"/>"/> <label for="movieTpCd_<c:out value="${code.fullCd}"/>"><c:out value="${code.korNm}"/></label>
												<c:if test="${status.count %4 eq 0}"><br/></c:if>
												</c:forEach>
												<br/>
											<input type="submit" name="" value="��ȸ">
										</form> --%>
										
										<form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
											<table>
											<tr>
												<td align="right">������ �̵�:</td>
												<td><input type="text" name="curPage" value="${requestScope.curPage}"></td>
												<td align="right">��¼�: </td>
												<td><input type="text" name="itemPerPage" value="${requestScope.itemPerPage }"></td>
													<td></td>
													<td></td>
													<td></td>
													<td align="right">������:</td>
												<td><input type="text" name="directorNm" value="${requestScope.directorNm}"></td>
												<td>&nbsp;&nbsp;&nbsp;</td>
												<td align="right">��ȭ��:</td>
												<td><input type="text" name="movieNm" value="${requestScope.movieNm}"> <br/></td>
											
											</tr>
											<tr>
												<td align="right">�������� ����:</td>
												<td><input type="text" name="openStartDt" value="${requestScope.openStartDt}"> </td> 
												<td>~</td>
												<td><input type="text" name="openEndDt" value="${requestScope.openEndDt}"></td>
												<td></td>
												<td align="right">���ۿ�������:</td>
												<td><input type="text" name="prdtStartYear" value="${requestScope.prdtStartYear}"></td>
												<td>~</td>
												<td><input type="text" name="prdtEndYear" value="${requestScope.prdtEndYear}"></td>
												<td></td>
												<td align="right">����:</td>
												<td>
													<select name="repNationCd">
														<option value="">-��ü-</option>
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
												<td><input type="submit" name="" value="��ȸ"></td>
											</tr>
											
											
											</table>
										</form>
									</header>
									
									
									
									<!-- ������ ���  -->
									
									<c:out value="${movieResult.movieListResult.totCnt}"/>
										<table border="1" class="type10">
		<tr>
			<thead>
				<th width="5px">��ȭ��</th><th>��ȭ��(��)</th><th>���ۿ���</th><th>��������</th><th>��ȭ����</th><th>���ۻ���</th><th>���۱���</th>
				<th>��ȭ�帣</th><th>��ǥ���۱���</th><th>��ǥ�帣</th><th>��ȭ����</th><th>���ۻ�</th>
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
					<td><c:out value="${movie.movieNmEn}"/></td><!-- ��ȭ��(����) -->
					<td><c:out value="${movie.prdtYear}"/></td><!-- ���ۿ��� -->
					<td><c:out value="${movie.openDt}"/></td><!-- �������� -->
					<td><c:out value="${movie.typeNm}"/></td><!-- ��ȭ���� -->
					<td><c:out value="${movie.prdtStatNm}"/></td><!-- ���ۻ��� -->
					<td><c:out value="${movie.nationAlt}"/></td><!-- ���۱��� -->
					<td><c:out value="${movie.genreAlt}"/></td><!-- ��ȭ�帣 -->
					<td><c:out value="${movie.repNationNm}"/></td><!-- ��ǥ���۱��� -->
					<td><c:out value="${movie.repGenreNm}"/></td><!-- ��ǥ�帣�� -->
					<td><c:forEach items="${movie.directors}" var="director"><c:out value="${director.peopleNm}"/>,</c:forEach></td><!-- ��ȭ���� -->
					<td><c:forEach items="${movie.companys}" var="company"><c:out value="${company.companyNm}"/>,</c:forEach></td>	<!-- ���ۻ� -->		
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