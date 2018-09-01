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
		<p>������ ó�����Դϴ�.
		<br>��ø� ��ٷ� �ּ���.</p>
	</div>
	<script type="text/javascript">
        window.onbeforeunload = function () { $('.loading').show(); }  //���� ���������� �ٸ� �������� �Ѿ �� ǥ�����ִ� ���
        $(window).load(function () {          //�������� �ε� �Ǹ� �ε� ȭ���� �����ִ� ��
            $('.loading').hide();
        });
	</script>

	<form action="${pageContext.request.contextPath}/cont?command=movieWeeklyList" method="post">
		����:<input type="text" name="targetDt" value="${requestScope.targetDt }">
		�ִ� ��°���:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage }">
		��ȭ����:<select name="multiMovieYn">
			<option value="">-��ü-</option>
			<option value="Y"<c:if test="${param.multiMovieYn eq 'Y'}"> selected="seleted"</c:if>>�پ缺��ȭ</option>
			<option value="N"<c:if test="${param.multiMovieYn eq 'N'}"> selected="seleted"</c:if>>�����ȭ</option>
		</select>
		����:<select name="repNationCd">
			<option value="">-��ü-</option>
			<option value="K"<c:if test="${param.repNationCd eq 'K'}"> selected="seleted"</c:if>>�ѱ�</option>
			<option value="F"<c:if test="${param.repNationCd eq 'F'}"> selected="seleted"</c:if>>�ܱ�</option>
			</select>
		����:<select name="wideAreaCd">
			<option value="">-��ü-</option>
			</select>
		�ְ�/�ָ�����:<select name="weekGb">
			<option value="1"<c:if test="${param.weekGb eq '1'}"> selected="seleted"</c:if>> �ָ� </option>
			<option value="0"<c:if test="${param.weekGb eq '0'}"> selected="seleted"</c:if>> �ְ� </option>
			<option value="2"<c:if test="${param.weekGb eq '2'}"> selected="seleted"</c:if>> ���� </option>
			</select>
			<br/>
			<input type="submit" name="" value="��ȸ">
	</form>
	
	
	<table border="1" id="boxtab">
		<tbody>
		<tr>
			<td>����</td>
			<td>��ȭ��</td>
			<td>������</td>
			<td>�����</td>
			<td>�����������</td>
			<td>���������(���ϴ��)</td>
			<td>�������������(���ϴ��)</td>
			<td>���������</td>
			<td>������</td>
			<td>����������(���ϴ��)</td>
			<td>��������������(���ϴ��)</td>
			<td>����������</td>
			<td>��ũ����</td>
			<td>��Ƚ��</td>
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