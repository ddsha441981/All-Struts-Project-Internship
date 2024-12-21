$(document).ready(function(){
	var string0 = "Sed eleifend ac orci facilisis pellentesque. Sed lacinia tristique lacus in cursus. Curabitur sodales imperdiet mauris, sed lacinia purus vestibulum sit amet. Praesent blandit facilisis tellus, eu pellentesque risus egestas at. Ut consectetur sapien quam, eu fermentum est congue in. Duis justo magna, luctus bibendum fermentum quis, venenatis iaculis turpis. Vivamus pharetra tempor rhoncus.";
	for (var n = 0; n < string0.length; n++){
		$("body").append("<span id='a"+n+"'>" + (string0[n]==" "?"&nbsp;":string0[n]) + "</span>");	  	
		$("#a" + n + "").delay(n*50).queue( function(next){
														$(this).css({"top": "10px", "opacity" : "1"});
														next();
											});
	};
});



