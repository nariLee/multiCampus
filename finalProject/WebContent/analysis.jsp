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
</style>

<body  class="homepage is-preload">
	
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
							<h1><a href="#">��ȭ �������� �м�</a></h1>
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
						<p class="style1">������ ������ Medium ���������� ���� ���̳��� ��ȭ ���</p>


<div style="width:50%; float:left; padding:50px;">
	<table class="type10">
    <thead>
    <tr>
        <th scope="cols">����</th>
        <th scope="cols">��ȭ��</th>
         <th scope="cols">����������</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20186202&movieNm=�Ű��Բ�-�ΰ� ��&movieNmEn=&audiAcc=11541545&rank=4&review_score=1867&review_variety=11524&pop_score=202.96&rank2=1">�Ű��Բ�-�ΰ� ��</a>
        </td>
        <td>11541545</td>
        
    </tr>
    <tr class="even">
        <th scope="row">2</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20181181&movieNm=�̼� ���ļ���: ���ƿ�&movieNmEn=&audiAcc=6472118&rank=2&review_score=2732&review_variety=451&pop_score=1.58&rank2=7">�̼� ���ļ���: ���ƿ�</a>
        </td>
        <td>6472118</td>
        
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20179101&movieNm=����&movieNmEn=&audiAcc=4289216&rank=3&review_score=-254&review_variety=7948&pop_score=115.02&rank2=2">����</a>
        </td>
        <td>4289216</td>
    </tr>
    <tr class="even">
        <th scope="row">4</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20181942&movieNm=�����̾�!2&movieNmEn=&audiAcc=1732298&rank=5&review_score=10309&review_variety=7044&pop_score=103.74&rank2=3">�����̾�!2</a>
        </td>
        <td>1732298</td>
    </tr>
    <tr>
        <th scope="row">5</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20170670&movieNm=�����&movieNmEn=&audiAcc=1696742&rank=2&review_score=-395&review_variety=472&pop_score=4.72&rank2=5">�����</a>
        </td>
        <td>1696742</td>
        
    </tr>
    <tr class="even">
        <th scope="row">6</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20184802&movieNm=���� ȣ�� 3&movieNmEn=&audiAcc=946548&rank=7&review_score=439&review_variety=368&pop_score=1.59&rank2=6">���� ȣ�� 3</a>
        </td>
        <td>946548</td>
        
    </tr>
    <tr>
        <th scope="row">7</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20183584&movieNm=�ް��ε�&movieNmEn=&audiAcc=469430&rank=8&review_score=221&review_variety=274&pop_score=0.23&rank2=9">�ް��ε�</a>
        </td>
        <td>469430</td>
        
    </tr>
    <tr class="even">
        <th scope="row">8</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20153446&movieNm=���� ��ȥ��&movieNmEn=&audiAcc=130339&rank=1&review_score=-359&review_variety=496&pop_score=11.25&rank2=4">���� ��ȥ��</a>
        </td>
        <td>130339</td>
        
    </tr>
    <tr>
        <th scope="row">9</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20187647&movieNm=���� ������ ������&movieNmEn=&audiAcc=39686&rank=6&review_score=-4274&review_variety=394&pop_score=0.78&rank2=8">���� ������ ������</a>
        </td>
        <td>39686</td>
        
    </tr>
    <tr class="even">
        <th scope="row">10</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20187657&movieNm=����22&movieNmEn=&audiAcc=3451&rank=10&review_score=17&review_variety=9&pop_score=0.01&rank2=10">����22</a>
        </td>
        <td>3451</td>
    </tr>
    <%-- <tr>
        <th scope="row">11</th>
        <td>
        	<a href="${pageContext.request.contextPath}/cont?command=movieInfo&movieCd=20170942&movieNm=�ζ�&movieNmEn=&audiAcc=893168&rank=11">�ζ�</a>
        </td>
        <td>893168</td>
    </tr> --%>
    
    </tbody>
</table>
</div>

<div style="width:50%; float:left; padding:50px;">
	<table class="type10">
    <thead>
    <tr>
        <th scope="cols">�������</th>
        <th scope="cols">��ȭ��</th>
         <th scope="cols">������������</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>�Ű��Բ�-�ΰ� ��</td>
        <td>202.96</td>
    </tr>
    <tr class="even">
        <th scope="row">2</th>
        <td>����</td>
        <td>115.02</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>�����̾�!2</td>
        <td>103.74</td>
    </tr>
    <tr class="even">
        <th scope="row">4</th>
        <td>���� ��ȥ��</td>
        <td>11.25</td>
    </tr>
    <tr>
        <th scope="row">5</th>
        <td>�����</td>
        <td>4.72</td>
    </tr>
    <tr class="even">
        <th scope="row">6</th>
        <td>���� ȣ��3</td>
        <td>1.59</td>
    </tr>
    <tr>
        <th scope="row">7</th>
        <td>�̼� ���ļ���: ���ƿ�</td>
        <td>1.58</td>
    </tr>
    <tr class="even">
        <th scope="row">8</th>
        <td>���� ������ ������</td>
        <td>0.78</td>
    </tr>
    <tr>
        <th scope="row">9</th>
        <td>�ް��ε�</td>
        <td>0.23</td>
    </tr>
    <tr class="even">
        <th scope="row">10</th>
        <td>����22</td>
        <td>0.01</td>
    </tr>
    
    </tbody>
</table>
</div>


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