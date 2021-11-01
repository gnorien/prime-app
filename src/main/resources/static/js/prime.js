var varPrime = {};

$(document).ready(function() {
	$("#btnPrime2").click(function() {

		var num = $("#txtPrime2").val().trim();
		var search = {}
		search["primeNumber"] = $("#txtPrime2").val();

		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "/app/api/prime",
			data : JSON.stringify(search),
			dataType : 'json',
			cache : false,
			timeout : 600000,
			success : function(data) {
				document.getElementById('txtAreaPrime').value = data;
				console.log("SUCCESS : ", data);

			},
			error : function(e) {

				console.log("ERROR : ", e);

			}
		});

	});
});

$(document).ready(function() {
	$("#btnRest").click(function() {
		
		alert($("#txtPrime2").val());
		$("#txtPrime2").val()='';
	});
	});