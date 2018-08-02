
var methodNum;
//$('#choosePayMethod').blur(
//	function(){
//		if($('#choosePayMethod').val() == "生活缴费"){
//			methodNum = 0;
//		}else if($('#choosePayMethod').val() == "物业管理缴费"){
//			methodNum = 1;
//		}else if($('#choosePayMethod').val() == "车位费缴费"){
//			methodNum = 2;
//		}
//		for(var i=0;i<2;i++){
//			if(!$('#payMethodDisplay').children('div').eq(i).hasClass('hideForm')){
//				$('#payMethodDisplay').children('div').eq(i).addClass('hideForm');
//			}
//		}
//		$('#payMethodDisplay').children('div').eq(methodNum).removeClass('hideForm');
//		
//	}
//);

$('#choosePayMethod').bind("change",function(){
	if($('#choosePayMethod').val() == "生活缴费"){
			methodNum = 0;
		}else if($('#choosePayMethod').val() == "物业管理缴费"){
			methodNum = 1;
		}else if($('#choosePayMethod').val() == "车位费缴费"){
			methodNum = 2;
		}else if($('#choosePayMethod').val() == "停车月租缴费"){
			methodNum = 3;
		}
		for(var i=0;i<4;i++){
			if(!$('#payMethodDisplay').children('div').eq(i).hasClass('hideForm')){
				$('#payMethodDisplay').children('div').eq(i).addClass('hideForm');
			}
		}
		$('#payMethodDisplay').children('div').eq(methodNum).removeClass('hideForm');
});