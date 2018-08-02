
$('.dropdown').click(
	function(){
		var dropList = $(this).find('ul');
		if(dropList.hasClass('dropdownMenu')){
			dropList.removeClass('dropdownMenu');
		}else{
			dropList.addClass('dropdownMenu');
		}
	}
);

$('.dropMenu').hover(
	function(){
		if(!$(this).hasClass('onClick')){
			$(this).find('a').css("color","#333");
			$(this).find('a').find('span').css("background-color","rgb(244,244,244)");
			$(this).css({"cursor":"pointer","background-color":"rgb(244,244,244)"});
		}
	},function(){
		if(!$(this).hasClass('onClick')){
			$(this).find('a').css("color","rgb(119,119,119)");
			$(this).find('a').find('span').css("background-color","rgb(251,251,251)");
			$(this).css("background-color","rgb(251,251,251)");
		}
	}
);
