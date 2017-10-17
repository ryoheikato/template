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
<link rel="stylesheet" type="text/css" href="css/flexslider.css" />
<link rel="stylesheet" type="text/css" href="css/SlideDownBoxMenu.css" />
<!-- jQueryの読み込み -->
<script src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/modernizr.custom.46884.js"></script>

<!--<script>
			$(function() {
             $('.flexslider').flexslider({
                 slideshowSpeed: 5000,
                 /*mousewheel: true,*/
                 slideshow:true

             });
	});
	</script>-->



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


</style>


</head>
<body>
	<div id="header">
		<div id="container">
 			 <ul id="sdt_menu" class="sdt_menu">
   				<li> <a href="#"> <img src="img/1.jpg" alt="メニュー画像"/> <span class="sdt_active"></span> <span class="sdt_wrap"> <span class="sdt_link">home</span> <span class="sdt_descr">トップページへ</span> </span> </a> </li>
    			<li> <a href="#"> <img src="img/2.jpg" alt="メニュー画像"/> <span class="sdt_active"></span> <span class="sdt_wrap"> <span class="sdt_link">product</span> <span class="sdt_descr">製品紹介</span> </span> </a>
      <div class="sdt_box"> <a href="#">categories1</a> <a href="#">categories2</a> <a href="#">categories3</a> </div></li>
    			<li> <a href="#"> <img src="img/3.jpg" alt="メニュー画像"/> <span class="sdt_active"></span> <span class="sdt_wrap"> <span class="sdt_link">access</span> <span class="sdt_descr">アクセス</span> </span> </a> </li>
    			<li> <a href="#"> <img src="img/4.jpg" alt="メニュー画像"/> <span class="sdt_active"></span> <span class="sdt_wrap"> <span class="sdt_link">company</span> <span class="sdt_descr">会社概要</span> </span> </a> </li>
    			<li> <a href="#"> <img src="img/5.jpg" alt="メニュー画像"/> <span class="sdt_active"></span> <span class="sdt_wrap"> <span class="sdt_link">contact</span> <span class="sdt_descr">お問い合わせ</span> </span> </a>
      <div class="sdt_box"> <a href="#">categories1</a> <a href="#">categories2</a> <a href="#">categories3</a> </div></li>
  </ul>
</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>

			<div class="wrapper">

			<ul id="sb-slider" class="sb-slider">
				<li><img src="img/roomA.jpg" alt="" width="840" height="430" /></li>
				<li><img src="img/roomB.jpg" alt="" width="840" height="430" /></li>
				<li><img src="img/roomC.jpg" alt="" width="840" height="430" /></li>
				<li><img src="img/roomD.jpg" alt="" width="840" height="430" /></li>
				<li><img src="img/roomE.jpg" alt="" width="840" height="430" /></li>
			</ul>
			<!--  <ul class="slides">
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
                </ul> -->
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


<!--ダウンロードしたファイル-->
<script type="text/javascript" src="js/jquery.slicebox.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<!--javascript追記-->
<script type="text/javascript">

 $(function() {
  var Page = (function() {
   var $navArrows = $('#nav-arrows').hide(),
    $shadow = $('#shadow').hide(),
    slicebox = $('#sb-slider').slicebox({
     onReady: function() {
      $navArrows.show();
      $shadow.show();
     },
     orientation: 'r',
     cuboidsRandom: true,
     disperseFactor: 30,
     autoplay: true,
     interval: 4000
    }),
    init = function() {
     initEvents();
    },
    initEvents = function() {
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
    init: init
   };
  })();
  Page.init();
 });


 $(function() {
		$('#sdt_menu > li').bind('mouseenter',function(){
			var $elem = $(this);
			$elem.find('img')
				 .stop(true)
				 .animate({
					'width':'170px',
					'height':'170px',
					'left':'0px'
				 },400,'easeOutBack')
				 .andSelf()
				 .find('.sdt_wrap')
				 .stop(true)
				 .animate({'top':'140px'},500,'easeOutBack')
				 .andSelf()
				 .find('.sdt_active')
				 .stop(true)
				 .animate({'height':'170px'},300,function(){
				var $sub_menu = $elem.find('.sdt_box');
				if($sub_menu.length){
					var left = '170px';
					if($elem.parent().children().length == $elem.index()+1)
						left = '-170px';
					$sub_menu.show().animate({'left':left},200);
				}
			});
		}).bind('mouseleave',function(){
			var $elem = $(this);
			var $sub_menu = $elem.find('.sdt_box');
			if($sub_menu.length)
				$sub_menu.hide().css('left','0px');

			$elem.find('.sdt_active')
				 .stop(true)
				 .animate({'height':'0px'},300)
				 .andSelf().find('img')
				 .stop(true)
				 .animate({
					'width':'0px',
					'height':'0px',
					'left':'85px'},400)
				 .andSelf()
				 .find('.sdt_wrap')
				 .stop(true)
				 .animate({'top':'25px'},500);
		});
	});
</script>
</body>
</html>