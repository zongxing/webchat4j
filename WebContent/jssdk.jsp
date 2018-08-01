<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
<script type="text/javascript">
wx.config({
    debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    appId: '${ap.appid}', // 必填，公众号的唯一标识
    timestamp:'${ap.timeStamp}', // 必填，生成签名的时间戳
    nonceStr: '${ap.nonceStr}', // 必填，生成签名的随机串
    signature: '${ap.signature}',// 必填，签名
    jsApiList:  ['chooseImage','scanQRCode'] // 必填，需要使用的JS接口列表
});

wx.ready(function(){
    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
	wx.scanQRCode({
		needResult: 1, // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
		scanType: ["qrCode","barCode"], // 可以指定扫二维码还是一维码，默认二者都有
		success: function(res) {
			var result = res.resultStr; // 当needResult 为 1 时，扫码返回的结果
			//alert(result);
			window.location.href=result;
		}
	});
});

</script>
</head>
<body>
aaaa
</body>
</html>