<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>Home画面</title>
	<link rel="stylesheet" type="text/css" href="css/demo.css" />
	<link rel="stylesheet" type="text/css" href="css/slicebox.css" />
	<link rel="stylesheet" type="text/css" href="css/custom.css" />
	<link rel="stylesheet" type="text/css" href="css/menu.css" />


	<script src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/modernizr.custom.46884.js"></script>

	<style type="text/css">
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}

/* ========TEMPLATE LAYOUT======== */
#header {
	width: 100%;
	background-color: black;
	margin: 0 auto;
	margin-top: 80px;
	max-width: 323px;
}

#main {
	width: 100%;
	height: 500px;
	text-align: center;
	margin-top :100px;
}

#text-center {
	display: inline-block;
	text-align: center;
}
</style>
</head>
<body>
	<div id="header">
		<div id="menu-container">
			<ul id="navigationMenu">
				<li><a href="#" class="selectedMenu">HOME</a></li>
				<li><a href="GoBuyItemAction" class="normalMenu">PRODUCTLIST</a></li>
				<li><a href="MyPageAction" class="normalMenu">MYPAGE</a></li>
				<li><a href="LoginAction" class="normalMenu">LOGIN</a></li>
			</ul>
		</div>
	</div>
	<div id="main">

			<div class="wrapper">

			  <ul id="sb-slider" class="sb-slider">
                    <li><img src="<s:property value="A"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="B"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="C"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="D"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="E"/>" alt="" width="840" height="430" />
                    </li>
                </ul>
            </div>

		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入"/>
			</s:form>
			<s:if test="#session.id != null">
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
		</div>
	</div>

	<!--ダウンロードしたファイル-->
<script src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.slicebox.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<!--javascript追記-->
	<script type="text/javascript">
		$(function() {
			var Page = (function() {
				var $navArrows = $('#nav-arrows').hide(), $shadow = $('#shadow')
						.hide(), slicebox = $('#sb-slider').slicebox({
					onReady : function() {
						$navArrows.show();
						$shadow.show();
					},
					orientation : 'r',
					cuboidsRandom : true,
					disperseFactor : 30,
					autoplay : true,
					interval: 4000

				}), init = function() {
					initEvents();
				}, initEvents = function() {
					// add navigation events
					$navArrows.children(':first').on('click', function() {
						slicebox.next();
						return false;
					});
					$navArrows.children(':last').on('click', function() {
						slicebox.previous();
						return false;
					});
				};
				return {
					init : init
				};
			})();
			Page.init();
		});
	</script>


</body>
</html>