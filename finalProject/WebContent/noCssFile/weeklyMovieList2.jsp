<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
	.loading-image{display:block; margin-left:45%; margin-top: 15%; text-align: center; z-index: 100;}
</style>

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

	<form action="${pageContext.request.contextPath}/cont?command=movieWeeklyList" method="post">
		일자:<input type="text" name="targetDt" value="${requestScope.targetDt }">
		최대 출력갯수:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage }">
		영화구분:<select name="multiMovieYn">
			<option value="">-전체-</option>
			<option value="Y"<c:if test="${param.multiMovieYn eq 'Y'}"> selected="seleted"</c:if>>다양성영화</option>
			<option value="N"<c:if test="${param.multiMovieYn eq 'N'}"> selected="seleted"</c:if>>상업영화</option>
		</select>
		국적:<select name="repNationCd">
			<option value="">-전체-</option>
			<option value="K"<c:if test="${param.repNationCd eq 'K'}"> selected="seleted"</c:if>>한국</option>
			<option value="F"<c:if test="${param.repNationCd eq 'F'}"> selected="seleted"</c:if>>외국</option>
			</select>
		지역:<select name="wideAreaCd">
			<option value="">-전체-</option>
			</select>
		주간/주말구분:<select name="weekGb">
			<option value="1"<c:if test="${param.weekGb eq '1'}"> selected="seleted"</c:if>> 주말 </option>
			<option value="0"<c:if test="${param.weekGb eq '0'}"> selected="seleted"</c:if>> 주간 </option>
			<option value="2"<c:if test="${param.weekGb eq '2'}"> selected="seleted"</c:if>> 주중 </option>
			</select>
			<br/>
			<input type="submit" name="" value="조회">
	</form>
	
	
	<table border="1" id="boxtab">
		<tbody>
		<tr>
			<td>순위</td>
			<td>영화명</td>
			<td>개봉일</td>
			<td>매출액</td>
			<td>매출액점유율</td>
			<td>매출액증감(전일대비)</td>
			<td>매출액증감비율(전일대비)</td>
			<td>누적매출액</td>
			<td>관객수</td>
			<td>관객수증감(전일대비)</td>
			<td>관객수증감비율(전일대비)</td>
			<td>누적관객수</td>
			<td>스크린수</td>
			<td>상영횟수</td>
		</tr>
		
	<c:if test="${not empty weeklyResult.boxOfficeResult.weeklyBoxOfficeList}">
		<c:forEach items="${weeklyResult.boxOfficeResult.weeklyBoxOfficeList}" var="boxoffice">
			<tr>
				<td>${boxoffice.rank}</td>
				<td>
					<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=<c:out value='${boxoffice.movieCd }'/>
					&movieNm=<c:out value='${boxoffice.movieNm}'/>
					&movieNmEn=<c:out value='${boxoffice.movieNmEn}'/>"
					>${boxoffice.movieNm }</a>
				</td>
				<td><c:out value="${boxoffice.openDt}"/></td>
				<td><c:out value="${boxoffice.salesAmt}"/></td>
				<td><c:out value="${boxoffice.salesShare}"/></td>
				<td><c:out value="${boxoffice.salesInten}"/></td>
				<td><c:out value="${boxoffice.salesChange}"/></td>
				<td><c:out value="${boxoffice.salesAcc}"/></td>
				<td><c:out value="${boxoffice.audiCnt}"/></td>
				<td><c:out value="${boxoffice.audiInten}"/></td>
				<td><c:out value="${boxoffice.audiChange}"/></td>
				<td><c:out value="${boxoffice.audiAcc}"/></td>
				<td><c:out value="${boxoffice.scrnCnt}"/></td>
				<td><c:out value="${boxoffice.showCnt}"/></td>
				
			</tr>
		</c:forEach>
	</c:if>
	</table>
		
	
	
</body>
</html>