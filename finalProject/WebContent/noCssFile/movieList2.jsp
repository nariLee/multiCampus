<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<title>Insert title here</title>
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
	.loading-image{display:block; margin-left:45%; margin-top: 13%; text-align: center; z-index: 100;}
</style>


<!-- <script> 
   
  	$(window).load(function(){
	$("input[name=movieName]").val(encodeURI($("input[name=movieName]").val()));
	var movieName = $("form[name=formName]").serializeArray();
	//var str = $("form[name=formName]").serialize().replace(/%/g, '%25');
	
	//alert(str)
	$.ajax({
		type:"POST",
		headers : {
			"Content-Type" : "application/x-www-form-urlencoded;charset=UTF-8",
			},
		url:"${pageContext.request.contextPath}/cont?command=naverMovie",
		dataType: "text",
		data: movieName,
		success: function(data){
			/*document.getElementById("movieImg").
			document.getElementsByName("movieImg").innerHTML = data;
			 $('img[name=movieImg]').val(data) */
			console.log(movieName);
		},
		error: function(xhr, data, error){
			alert(error);
		}
			
			
	})
}) 

</script>  -->
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


	<form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
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
	</form>

	
	<c:out value="${movieResult.movieListResult.totCnt}"/>
	<table border="1">
		<tr>
			<td>영화명</td><td>영화명(영)</td><td>이미지</td><td>제작연도</td><td>개봉연도</td><td>영화유형</td><td>제작상태</td><td>제작국가</td>
			<td>영화장르</td><td>대표제작국가</td><td>대표장르</td><td>영화감독</td><td>제작사</td>
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
			<td><img src="${requestScope.items.image}" name="movieImg"/></td><!-- 이미지/ -->
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
</body>
</html>