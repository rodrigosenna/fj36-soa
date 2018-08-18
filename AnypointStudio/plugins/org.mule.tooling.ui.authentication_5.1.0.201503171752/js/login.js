function successMessage(p1) {
	$("#success-message").text(p1);
	$("#success-message").addClass("in");
	$('#myButton').button('reset');
	setTimeout(function() {
		closeWindow();
	}, 1000);
}

function failMessage(p1) {
	$("#fail-message").text(p1);
	$("#fail-message").addClass("in");
	setTimeout(function() {
		$("#fail-message").removeClass("in");
	}, 3000);
	$('#myButton').button('reset');
}

function login() {
	$('#myButton').button('loading');
	var $username = $('#user').val();
	var $password = $('#password').val();
	loginToPlatform($username, $password);
}

function validateField(field, id) {
	if (field.value == '') {
		$('#' + id).addClass('has-error');
		$('#' + id).removeClass('has-success');
	} else {
		$('#' + id).addClass('has-success');
		$('#' + id).removeClass('has-error');

	}
	validateButton()
}

function validateButton() {
	if ($('#userDiv').hasClass('has-error')
			|| $('#passwordDiv').hasClass('has-error')) {
		failMessage("Username and password are required.")
		$('#myButton').attr('disabled', 'disabled');
	} else {
		$('#myButton').removeAttr('disabled');
	}

}
