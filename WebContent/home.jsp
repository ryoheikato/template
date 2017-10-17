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


<link rel="stylesheet" href="css/flexslider.css" type="text/css" />
<!-- jQueryの読み込み -->
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery.flexslider-min.js"></script>

	<script>
			$(function() {
             $('.flexslider').flexslider({
                 slideshowSpeed: 5000,
                 /*mousewheel: true,*/
                 slideshow:true

             });
	});
	</script>



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
	background-image: url("img/backimage.jpeg");
	background-size: cover;
	background-attachment:fixed;
}

table {
	text-align: center;
	margin: 0 auto;
}

/* ========TEMPLATE LAYOUT======== */
#top {
	width: 780px;
	margin: 30px auto;
	border: 1px solid #FFFFFF;
	color: #FFFFFF;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#main {
	width: 100%;
	height: 1000px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}

#text-center {
	display: inline-block;
	text-align: center;
}

.flexslider {
	background-color:#FFFFFF;
}

</style>


</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>

		<div class="flexslider">
                <ul class="slides">
                    <li><img src="<s:property value="roomA"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="roomB"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="roomC"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="roomD"/>" alt="" width="840" height="430" />
                    </li>
                    <li><img src="<s:property value="roomE"/>" alt="" width="840" height="430" />
                    </li>
                </ul>
            </div>


		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入" />
			</s:form>
			<s:if test="#session.id != null">
				<p>
					ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a>
				</p>
			</s:if>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>