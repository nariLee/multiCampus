<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<style>
	.loading{display:block; margin:auto 0; text-align: center; margin-top:200px;}
</style>
<body>
	<div class="loading">
		<img src="images/loading4.gif"/>
		<p>�α��� ���Դϴ�
	</div>
	

	<!-- (1) LoginWithNaverId Javscript SDK -->
	<script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>


	<!-- (2) LoginWithNaverId Javscript ���� ���� �� �ʱ�ȭ -->
	<script>
		var naverLogin = new naver.LoginWithNaverId(
			{
				clientId: "UTKGihje_l4m4VPzgGYn",
				callbackUrl: "http://localhost:80/finalProject/callback.jsp",
				isPopup: false,
				callbackHandle: true
				/* callback �������� �и��Ǿ��� ��쿡 callback ������������ callbackó���� ���ټ� �ֵ��� �����մϴ�. */
			}
		);

		/* (3) �׾Ʒ� �α��� ������ �ʱ�ȭ�ϱ� ���Ͽ� init�� ȣ�� */
		naverLogin.init();

		/* (4) Callback�� ó��. ���������� Callback ó���� �Ϸ�� ��� main page�� redirect(�Ǵ� Popup close) */
		window.addEventListener('load', function () {
			naverLogin.getLoginStatus(function (status) {
				if (status) {
					/* (5) �ʼ������� �޾ƾ��ϴ� ������ ������ �ִٸ� callbackó�� ������ üũ */
					var email = naverLogin.user.getEmail();
					if( email == undefined || email == null) {
						alert("�̸����� �ʼ������Դϴ�. ���������� �������ּ���.");
						/* (5-1) ����� ���� �絿�Ǹ� ���Ͽ� �ٽ� �׾Ʒ� ������������ �̵��� */
						naverLogin.reprompt();
						return;
					}

					window.location.replace("http://" + window.location.hostname + 
                           /*   ( (location.port==""||location.port==undefined)?"":":" + location.port) + "/finalProject/main.jsp"); */ 
							 ( (location.port==""||location.port==undefined)?"":":" + location.port) + "/finalProject/cont?command=dailySummary"); 
				                                                    /* ������ �Ϸ���� /sample/main.html �������� �̵��϶�°��̴�. ���� ���̷� �����ؾ��Ѵ�. */
                 } else {
					console.log("callback ó���� �����Ͽ����ϴ�.");
				}
			});
		});
	</script>


</script>
</body>
</html>