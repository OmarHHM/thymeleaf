document.getElementById('usuarionombre').style.visibility = "hidden";
var divElement = document.getElementById('usuarionombre'); 


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
	var complemento=divElement.innerHTML;
	var url="http://localhost:8080/getUser"+"?usuario="complemento;
	
	$.get(url, function( data ) {
		  alert(data.id):
		});
}





