
consultaPerfil();
function readURL(input) {
	
    if (input.files && input.files[0]) {
    	var reader = new FileReader();
    	reader.onload = function(e) {
    		$('#imagePreview').css('background-image', 'url('+e.target.result +')');
            $('#imagePreview').hide();
            $('#imagePreview').fadeIn(650);
        }
        reader.readAsDataURL(input.files[0]);
    }
}
$("#imageUpload").change(function() {
    readURL(this);
});


function consultaPerfil(){
	var userName = document.getElementById('usuarionombre'); 
	var url="/getUser"+"?usuario="+userName.innerHTML;
	
	$.get(url, function(data) {
		if(data!=null){
			$('#nombre').val(data.nombre);
			$('#apellido_paterno').val(data.apellido1);
			$('#apellido_materno').val(data.apellido2);
			$('#email').val(data.email);
		}else{
			$('#nombre').value("");
			$('#apellido_paterno').val("");
			$('#apellido_materno').val("");
			$('#email').val("");
		}	
	});
}





