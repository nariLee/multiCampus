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
			����: ${movieInfoResult.movieInfoResult.movieInfo.movieNm}<br>
				${movieInfoResult.movieInfoResult.movieInfo.movieNmEn}<br>
			����: ${requestScope.items.userRating}<br>
			����: 
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.genres}" var="genre">
				${genre.genreNm}
			</c:forEach><br>
			����: 
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.nations}" var="nation">
				${nation.nationNm}
			</c:forEach><br>
			������:${movieInfoResult.movieInfoResult.movieInfo.openDt}&nbsp;${movieInfoResult.movieInfoResult.movieInfo.prdtStatNm}<br>
			����: ${movieInfoResult.movieInfoResult.movieInfo.directors[0].peopleNm}<br>
			�⿬: 
			<c:forEach items="${movieInfoResult.movieInfoResult.movieInfo.actors}" var="actor">
				${actor.peopleNm},
			</c:forEach><br>
			���: ${movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }
			<c:if test="${empty movieInfoResult.movieInfoResult.movieInfo.audits[0].watchGradeNm }">
			��ü�̿밡
			</c:if>
			</td>
		</tr>
		
		</table>
			<br>
			
			<c:if test="${not empty requestScope.rank}">
		<table border="1">
			<tr>
				<td>���� ����</td>
				<td>SNS ���� ����</td>
				<td>���� ��������</td>
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
				<td>�ڽ� ���ǽ� ����</td>
				<td>�������� ����</td>
				<td>������ ��</td>
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
						<c:when test="${movieInfoResult.movieInfoResult.movieInfo.movieNm eq '�̼� ���ļ���: ���ƿ�'}">
							<img src="images/wordCloud_�̼� ���ļ���-���ƿ�.png" width="300px"/>			
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
			<%-- <p>��ȭ�ڵ�: ${movieInfoResult.movieInfoResult.movieInfo.movieCd}</p>
			<p>��ȭ��(����): ${movieInfoResult.movieInfoResult.movieInfo.movieNm}</p>
			<p>��ȭ��(����): ${movieInfoResult.movieInfoResult.movieInfo.movieNmEn}</p>
			<p>��ȭ��(����): ${movieInfoResult.movieInfoResult.movieInfo.movieNmOg}</p>
			<p>���ۿ���: ${movieInfoResult.movieInfoResult.movieInfo.prdtYear}</p>
			<p>�󿵽ð�: ${movieInfoResult.movieInfoResult.movieInfo.showTm}</p>
			<p>��������: ${movieInfoResult.movieInfoResult.movieInfo.openDt}</p>
			<p>���ۻ��¸�: ${movieInfoResult.movieInfoResult.movieInfo.prdtStatNm}</p>
			<p>��ȭ������: ${movieInfoResult.movieInfoResult.movieInfo.typeNm}</p>
			<p>���۱���: ${movieInfoResult.movieInfoResult.movieInfo.nations}</p>
			<p>���۱�����: ${movieInfoResult.movieInfoResult.movieInfo.nationNm}</p>
			<p>�帣��: ${movieInfoResult.movieInfoResult.movieInfo.genreNm}</p>
			<p>����: ${movieInfoResult.movieInfoResult.movieInfo.directors}</p>
			<p>������: ${movieInfoResult.movieInfoResult.movieInfo.peopleNm}</p>
			<p>���: ${movieInfoResult.movieInfoResult.movieInfo.actors}</p>
			<p>����: ${movieInfoResult.movieInfoResult.movieInfo.peopleNm}</p>
			<p>����(����): ${movieInfoResult.movieInfoResult.movieInfo.peopleNmEn}</p>
			<p>�迪��: ${movieInfoResult.movieInfoResult.movieInfo.cast}</p>
			<p>�迪��(����): ${movieInfoResult.movieInfoResult.movieInfo.castEn}</p>
			<p>������: ${movieInfoResult.movieInfoResult.movieInfo.showTypes}</p>
			<p>�����¸�: ${movieInfoResult.movieInfoResult.movieInfo.showTypeNm}</p>
			<p>��������: ${movieInfoResult.movieInfoResult.movieInfo.audits}</p>
			<p>���ǹ�ȣ: ${movieInfoResult.movieInfoResult.movieInfo.auditNo}</p>
			<p>������� ��Ī: ${movieInfoResult.movieInfoResult.movieInfo.watchGradeNm}</p>
			<p>���� ��ȭ��: ${movieInfoResult.movieInfoResult.movieInfo.companys}</p>
			<p>���� ��ȭ�� �ڵ�: ${movieInfoResult.movieInfoResult.movieInfo.companyCd}</p>
			<p>���� ��ȭ���: ${movieInfoResult.movieInfoResult.movieInfo.companyNm}</p>
			<p>���� ��ȭ���(����): ${movieInfoResult.movieInfoResult.movieInfo.companyNmEn}</p>
			<p>���� ��ȭ�� �о߸�: ${movieInfoResult.movieInfoResult.movieInfo.companyPartNm}</p>
			<p>����: ${movieInfoResult.movieInfoResult.movieInfo.staffs}</p>
			<p>���ܸ�(����): ${movieInfoResult.movieInfoResult.movieInfo.peopleNmEn}</p>
			<p>���ܿ��Ҹ�: ${movieInfoResult.movieInfoResult.movieInfo.staffRoleNm}</p> --%>
		
	</c:if>
	
	
</body>
</html>