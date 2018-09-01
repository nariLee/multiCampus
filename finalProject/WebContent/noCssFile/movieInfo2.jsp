<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<%-- ${requestScope.items}<br>
<p>--------</p>
${movieInfoResult.movieInfoResult} --%>
	<c:if test="${not empty movieInfoResult}">
		<table border="1">
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
			제목: ${movieInfoResult.movieInfoResult.movieInfo.movieNm}<br>
				${movieInfoResult.movieInfoResult.movieInfo.movieNmEn}<br>
			평점: ${requestScope.items.userRating}<br>
			개요: 
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.genres}" var="genre">
				${genre.genreNm}
			</c:forEach><br>
			국가: 
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.nations}" var="nation">
				${nation.nationNm}
			</c:forEach><br>
			개봉일:${movieInfoResult.movieInfoResult.movieInfo.openDt}&nbsp;${movieInfoResult.movieInfoResult.movieInfo.prdtStatNm}<br>
			감독: ${movieInfoResult.movieInfoResult.movieInfo.directors[0].peopleNm}<br>
			출연: 
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.actors}" var="actor">
				${actor.peopleNm},
			</c:forEach><br>
			등급: ${movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }
			<c:if test="${empty movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }">
			전체이용가
			</c:if>
			</td>
		</tr>
		
		</table>
			<br>
			
			<c:if test="${not empty requestScope.rank}">
		<table border="1">
			<tr>
				<td>누적 관객</td>
				<td>SNS 흥행 지수</td>
				<td>종합 흥행지수</td>
			</tr>
			<tr>
				<td>
				${requestScope.audiAcc}
					<c:if test="${empty requestScope.audiAcc}">
						-
					</c:if>
				</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>박스 오피스 순위</td>
				<td>흥행지수 순위</td>
				<td>전반적 평가</td>
			</tr>
			<tr>
				<td>
					${requestScope.rank}
					<c:if test="${empty requestScope.rank}">
						-
					</c:if>
				</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<td colspan="3">
					<c:choose>
						<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '미션 임파서블: 폴아웃'}">
							<img src="images/wordCloud_미션 임파서블-폴아웃.png" width="300px"/>			
						</c:when>
						<c:otherwise>
						<img src="images/wordCloud_${movieInfoResult.movieInfoResult.movieInfo.movieNm}.png"/>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>	
			</c:if>
			
			<p>
			<%-- <p>영화코드: ${movieInfoResult.movieInfoResult.movieInfo.movieCd}</p>
			<p>영화명(국문): ${movieInfoResult.movieInfoResult.movieInfo.movieNm}</p>
			<p>영화명(영문): ${movieInfoResult.movieInfoResult.movieInfo.movieNmEn}</p>
			<p>영화명(원문): ${movieInfoResult.movieInfoResult.movieInfo.movieNmOg}</p>
			<p>제작연도: ${movieInfoResult.movieInfoResult.movieInfo.prdtYear}</p>
			<p>상영시간: ${movieInfoResult.movieInfoResult.movieInfo.showTm}</p>
			<p>개봉연도: ${movieInfoResult.movieInfoResult.movieInfo.openDt}</p>
			<p>제작상태명: ${movieInfoResult.movieInfoResult.movieInfo.prdtStatNm}</p>
			<p>영화유형명: ${movieInfoResult.movieInfoResult.movieInfo.typeNm}</p>
			<p>제작국가: ${movieInfoResult.movieInfoResult.movieInfo.nations}</p>
			<p>제작국가명: ${movieInfoResult.movieInfoResult.movieInfo.nationNm}</p>
			<p>장르명: ${movieInfoResult.movieInfoResult.movieInfo.genreNm}</p>
			<p>감독: ${movieInfoResult.movieInfoResult.movieInfo.directors}</p>
			<p>감독명: ${movieInfoResult.movieInfoResult.movieInfo.peopleNm}</p>
			<p>배우: ${movieInfoResult.movieInfoResult.movieInfo.actors}</p>
			<p>배우명: ${movieInfoResult.movieInfoResult.movieInfo.peopleNm}</p>
			<p>배우명(영문): ${movieInfoResult.movieInfoResult.movieInfo.peopleNmEn}</p>
			<p>배역명: ${movieInfoResult.movieInfoResult.movieInfo.cast}</p>
			<p>배역명(영문): ${movieInfoResult.movieInfoResult.movieInfo.castEn}</p>
			<p>상영형태: ${movieInfoResult.movieInfoResult.movieInfo.showTypes}</p>
			<p>상영형태명: ${movieInfoResult.movieInfoResult.movieInfo.showTypeNm}</p>
			<p>심의정보: ${movieInfoResult.movieInfoResult.movieInfo.audits}</p>
			<p>심의번호: ${movieInfoResult.movieInfoResult.movieInfo.auditNo}</p>
			<p>관람등급 명칭: ${movieInfoResult.movieInfoResult.movieInfo.watchGradeNm}</p>
			<p>참여 영화사: ${movieInfoResult.movieInfoResult.movieInfo.companys}</p>
			<p>참여 영화사 코드: ${movieInfoResult.movieInfoResult.movieInfo.companyCd}</p>
			<p>참여 영화사명: ${movieInfoResult.movieInfoResult.movieInfo.companyNm}</p>
			<p>참여 영화사명(영문): ${movieInfoResult.movieInfoResult.movieInfo.companyNmEn}</p>
			<p>참여 영화사 분야명: ${movieInfoResult.movieInfoResult.movieInfo.companyPartNm}</p>
			<p>스텝: ${movieInfoResult.movieInfoResult.movieInfo.staffs}</p>
			<p>스텝명(영문): ${movieInfoResult.movieInfoResult.movieInfo.peopleNmEn}</p>
			<p>스텝역할명: ${movieInfoResult.movieInfoResult.movieInfo.staffRoleNm}</p> --%>
		
	</c:if>
	
	
</body>
</html>