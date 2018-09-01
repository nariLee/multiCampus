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

	<form action="${pageContext.request.contextPath}/cont?command=companyList" method="post">
		현재페이지 :<input type="text" name="curPage" value="${requestScope.curPage}">
		최대 출력갯수:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage}">
		영화사명:<input type="text" name="companyNm" value="${requestScope.companyNm}">		
		대표자명:<input type="text" name="ceoNm" value="${requestScope.ceoNm}"> <br/>
		영화사분류:
			<c:forEach items="${companyPartCd.codes}" var="code" varStatus="status">
			<input type="checkbox" name="companyPartCdArr" value="<c:out value="${code.fullCd}"/>" id="companyTpCd_<c:out value="${code.fullCd}"/>"/> <label for="companyTpCd_<c:out value="${code.fullCd}"/>"><c:out value="${code.korNm}"/></label>
			<c:if test="${status.count %4 eq 0}"><br/></c:if>
			</c:forEach>
			<br/>
		<input type="submit" name="" value="조회">
	</form>
	
	<c:out value="${companyResult.companyListResult.totCnt}"/>
	<table border="1">
		<tr>
			<td>영화사코드</td><td>영화사명</td><td>영화사명(영문)</td><td>영화사분류</td><td>대표자명</td><td>필모리스트</td>
		</tr>
	<c:if test="${not empty companyResult.companyListResult.companyList}">
	<c:forEach items="${companyResult.companyListResult.companyList}" var="company">
		<tr>
			<td><c:out value="${company.companyCd }"/></td>
			<td><c:out value="${company.companyNm }"/></td>
			<td><c:out value="${company.companyNmEn }"/></td>
			<td><c:out value="${company.companyPartNames }"/></td>
			<td><c:out value="${company.ceoNm}"/></td>
			<td><c:out value="${company.filmoNames}"/></td>						
		</tr>
	</c:forEach>
	</c:if>
	</table>
</body>
</html>