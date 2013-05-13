function widgetCollapse(widget_id, hideit) {
	if ($.cookie(widget_id)) {
		 if (hideit == true) {
		 	 $(".body." + widget_id).show();
			 $(".title ." + widget_id).attr("class", widget_id +" toggle");
		 } else {
			 $(".body." + widget_id).hide();
			 $(".title ." + widget_id).attr("class", widget_id +" untoggle");
		 }	
	}
	
	$(".title ." + widget_id).attr("style", "cursor: pointer");
	$(".title ." + widget_id).click(function() {
		if ($(".body." + widget_id).is(":hidden")) {
   			$(".body." + widget_id).slideDown();
    		
			if (hideit == true) {
				$.cookie(widget_id, "true");
	    		$(".title ." + widget_id).attr("class", widget_id +" untoggle");
			} else {
				$.cookie(widget_id, null);
	    		$(".title ." + widget_id).attr("class", widget_id +" toggle");
			}
			
		} else {
			$(".body." + widget_id).slideUp();
			
			if (hideit == true) {
				$.cookie( widget_id, null);
				$(".title ." + widget_id).attr("class", widget_id +" toggle");
			} else {
				$.cookie( widget_id, "true");
				$(".title ." + widget_id).attr("class", widget_id +" untoggle");
			}
		}
	});
};