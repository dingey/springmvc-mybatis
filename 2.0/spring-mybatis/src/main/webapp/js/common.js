function query() {
	var data = $("form").eq(0).serialize();
	$(".pagination").find("li").each(function() {
		if ($(this).attr("class") == "active") {
			data = "pageNum=" + $(this).text() + "&" + data;
		}
	})
	data = "pageSize=" + $("#pageSize").val() + "&" + data;
	console.log(data);
	$("#data-container").load(
			$("form").eq(0).attr("action") + " #data-content", data,
			function() {
				initTableCheck();
			});
}
function page(num) {
	var data = $("form").eq(0).serialize() + "&pageNum=" + num;
	data = "pageSize=" + $("#pageSize").val() + "&" + data;
	//console.log(data);
	$("#data-container").load(
			$("form").eq(0).attr("action") + " #data-content", data,
			function() {
				initTableCheck();
			});
}
function pagejump() {
	var data = $("form").eq(0).serialize() + "&pageNum="
			+ $(".page-input").val();
	data = "pageSize=" + $("#pageSize").val() + "&" + data;
	//console.log(data);
	$("#data-container").load(
			$("form").eq(0).attr("action") + " #data-content", data,
			function() {
				initTableCheck();
			});
}
function pageInput() {
	if (event.keyCode == 13) {
		pagejump();
	}
}
function save() {

}
function validate() {
	var flag = true;
	$("form").eq(0).find('input, select').each(function() {
		if ($(this).attr("required") && $(this).val() == "") {

		}
	});
}
function initTableCheck() {
	$("table>thead>tr>th>input[type='checkbox']").click(
			function() {
				$("table>tbody>tr>td>input[type='checkbox']").prop("checked",
						$(this).prop("checked"));
			});
}
function drawPage(page, pages) {
	$(".pagination")
			.empty()
			.append(
					"<li><a href=\"#\" aria-label=\"Previous\" title=\"前一页\" onclick=\"page(-1)\"> <span aria-hidden=\"true\">&laquo;</span>");
	if (page < 4) {
		for (var i = 1; i < 6; i++) {
			if (i == page) {
				$(".pagination").append(
						"<li class=\"active\"><a href=\"/index2.html?page=" + i
								+ "\">" + i + "</a></li>");
			} else {
				$(".pagination").append(
						"<li><a href=\"/index2.html?page=" + i + "\">" + i
								+ "</a></li>");
			}
		}
		if (pages > 5) {
			$(".pagination").append("<li><span>…</span></li>");
			$(".pagination").append(
					"<li><a href=\"/index2.html?page=" + pages + "\">" + pages
							+ "</a></li>");
		}
	} else if (page > 3 && page < (pages - 2)) {
		$(".pagination").append(
				"<li><a href=\"/index2.html?page=1\">1</a></li>");
		$(".pagination").append("<li><span>…</span></li>");
		for (var i = (page - 2); i <= (page + 2); i++) {
			if (i == page) {
				$(".pagination").append(
						"<li class=\"active\"><a href=\"/index2.html?page=" + i
								+ "\">" + i + "</a></li>");
			} else {
				$(".pagination").append(
						"<li><a href=\"/index2.html?page=" + i + "\">" + i
								+ "</a></li>");
			}
		}
		$(".pagination").append("<li><span>…</span></li>");
		$(".pagination").append(
				"<li><a href=\"/index2.html?page=" + pages + "\">" + pages
						+ "</a></li>");
	} else if (page > 3 && page > (pages - 2)) {
		$(".pagination").append(
				"<li><a href=\"/index2.html?page=1\">1</a></li>");
		$(".pagination").append("<li><span>…</span></li>");
		for (var i = (pages - 4); i <= pages; i++) {
			if (i == page) {
				$(".pagination").append(
						"<li class=\"active\"><a href=\"/index2.html?page=" + i
								+ "\">" + i + "</a></li>");
			} else {
				$(".pagination").append(
						"<li><a href=\"/index2.html?page=" + i + "\">" + i
								+ "</a></li>");
			}
		}
	} else {
		$(".pagination").append(
				"<li><a href=\"/index2.html?page=1\">1</a></li>");
		$(".pagination").append("<li><span>…</span></li>");
		for (var i = (pages - 4); i <= pages; i++) {
			if (i == page) {
				$(".pagination").append(
						"<li class=\"active\"><a href=\"/index2.html?page=" + i
								+ "\">" + i + "</a></li>");
			} else {
				$(".pagination").append(
						"<li><a href=\"/index2.html?page=" + i + "\">" + i
								+ "</a></li>");
			}
		}
	}
	$(".pagination")
			.append(
					"<li><a href=\"#\" aria-label=\"Next\" onclick=\"page(1)\"> <span aria-hidden=\"true\" title=\"下一页\">&raquo;</span></a></li>");
}