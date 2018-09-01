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
		<p>������ ó�����Դϴ�.
		<br>��ø� ��ٷ� �ּ���.</p>
	</div>
	<script type="text/javascript">
        window.onbeforeunload = function () { $('.loading').show(); }  //���� ���������� �ٸ� �������� �Ѿ �� ǥ�����ִ� ���
        $(window).load(function () {          //�������� �ε� �Ǹ� �ε� ȭ���� �����ִ� ��
            $('.loading').hide();
        });
	</script>


	<form action="${pageContext.request.contextPath}/cont?command=movieList" method="post">
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
	</form>

	
	<c:out value="${movieResult.movieListResult.totCnt}"/>
	<table border="1">
		<tr>
			<td>��ȭ��</td><td>��ȭ��(��)</td><td>�̹���</td><td>���ۿ���</td><td>��������</td><td>��ȭ����</td><td>���ۻ���</td><td>���۱���</td>
			<td>��ȭ�帣</td><td>��ǥ���۱���</td><td>��ǥ�帣</td><td>��ȭ����</td><td>���ۻ�</td>
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
			<td><img src="${requestScope.items.image}" name="movieImg"/></td><!-- �̹���/ -->
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
</body>
</html>