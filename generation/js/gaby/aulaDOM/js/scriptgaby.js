function validateForm() {
       
    var preenchido = document.getElementById("email").value;
    var preenchido2 = document.getElementById("password").value;

    if (preenchido == "") {
        document.write("nao foi");
    } else {
        document.write("foi");
        
    }
    if(preenchido2 == ""){
        document.write("Não foi");
    } else {
        document.write("FOii");
    }
   
}