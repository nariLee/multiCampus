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
		<p>������ ó�����Դϴ�.
		<br>��ø� ��ٷ� �ּ���.</p>
	</div>
	<script type="text/javascript">
        window.onbeforeunload = function () { $('.loading').show(); }  //���� ���������� �ٸ� �������� �Ѿ �� ǥ�����ִ� ���
        $(window).load(function () {          //�������� �ε� �Ǹ� �ε� ȭ���� �����ִ� ��
            $('.loading').hide();
        });
	</script>

	<form action="${pageContext.request.contextPath}/cont?command=peopleList" method="post">
		���������� :<input type="text" name="curPage" value="${requestScope.curPage}">
		�ִ� ��°���:<input type="text" name="itemPerPage" value="${requestScope.itemPerPage}">
		��ȭ�θ�:<input type="text" name="peopleNm" value="${requestScope.peopleNm}">		
		�ʸ𸮽�Ʈ:<input type="text" name="filmoNames" value="${requestScope.filemoNames}"> <br/>
		
			<br/>
		<input type="submit" name="" value="��ȸ">
	</form>	

	<c:out value="${peopleResult.peopleListResult.totCnt}"/>
	<table border="1">
		<tr>
			<td>��ȭ���ڵ�</td><td>��ȭ�θ�</td><td>��ȭ�θ�(����)</td><td>�о�</td><td>�ʸ𸮽�Ʈ</td>	
		</tr>
		 <c:if test="${not empty peopleResult.peopleListResult.peopleList}">
	<c:forEach items="${peopleResult.peopleListResult.peopleList}" var="people">
		<tr>
			<c:if test="${people.repRoleNm eq '���'}">
				<td><c:out value="${people.peopleCd }"/></td>
				<td><c:out value="${people.peopleNm }"/></td>
				<td><c:out value="${people.peopleNmEn }"/></td>
				<td><c:out value="${people.repRoleNm}"/></td>
				<td><c:out value="${people.filmoNames}"/></td>
			</c:if>
		</tr>
	</c:forEach>
	</c:if>
	</table>
	
	
</body>
</html>