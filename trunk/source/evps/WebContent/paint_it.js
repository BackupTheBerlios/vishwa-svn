function decorator(element, text, a, pane, header) {
	$("h1, h2, #site-table a, .widget .title, input, select, textarea, button, .box .tab:hover").css("color", "#" + text);
	$("#pane a").css("color", "#" + pane);
	$("#pane").css("border-color", "#" + header);
	$("input, select, textarea, button").hover(function(){
	     $(this).css("border", "1px solid #" + text);
	}, function() {
		  $(this).css("border", "1px solid #ccc");
	});
	$("#header").css("background", "#" + header + " url('templates/themes/default/images/header-bg.png') repeat-x bottom");
	$(".table-styled thead th").css("background", "#" + header + " url('templates/themes/default/images/header-bg.png') repeat-x top");
	$("#title h1, #title h2, #title a").css("color", "#fff").css("text-shadow", "rgba(0, 0, 0, 0.5) 0 -1px 0");
}

function paintIt(element, text, a, pane, header, paintElement) {
	if ($.cookie("color") == element) {
		decorator(element, text, a, pane, header);
	}
	if (paintElement) $(element).css("color", "#" + text);
	$(element).css("cursor", "pointer").click(function()  {
		$.cookie("color", element);
		decorator(element, text, a, pane, header);
	});
}

$(document).ready(function() {
	paintIt("#tab-1", "005785", "6d97b3", "94ccf2", "0575ac");
	paintIt("#tab-2", "4c7016", "7c9c5f", "a7db75", "698e36");
	paintIt("#tab-3", "851607", "cf6d5b", "ff8873", "cb3500");
	paintIt("#tab-4", "ba500c", "e89535", "ffad4d", "f5911c");
	
	paintIt(".teal", "0c6a8a", "6a99ad", "93d4f0", "238ca6", true);
	paintIt(".dove", "4b5676", "7385a3", "a7c2ed", "6d7f9c", true);
	paintIt(".sky", "005785", "6d97b3", "94ccf2", "0578b0", true);
	paintIt(".aqua", "027061", "60948c", "89d4c8", "008776", true);
	paintIt(".green", "4c7016", "7c9c5f", "a7db75", "6c9238", true);
	paintIt(".violet", "4d3870", "8779a6", "b19be6", "706199", true);
	paintIt(".purple", "691e79", "a97ab3", "ce95db", "904b9f", true);
	paintIt(".pink", "840259", "b37196", "e87fb9", "e87fb9", true);
	paintIt(".olive", "635e35", "918d61", "c7c185", "8a8459", true);
	paintIt(".suede", "504638", "998d7c", "d1c0aa", "887c6b", true);
	paintIt(".black", "353535", "737373", "bababa", "484848", true);
	paintIt(".red", "851607", "cf6d5b", "ff8873", "d03700", true);
	paintIt(".orange", "ba500c", "e89535", "ffad4d", "fb951d", true);
});
