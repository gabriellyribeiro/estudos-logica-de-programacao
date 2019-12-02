function js_style(){
//font styles added by JS:
 text.style.fontSize = "18pt";
 text.style.fontFamily = "Comic Sans MS";
 text.style.color = "red";
// professor fez assim:  document.getElementById("text").style.color = "";
}
function muda(){
    document.getElementById("fundo").style.color = "red";
    document.getElementById("fundo").style.backgroundImage = "url('img/star.png')";
    document.getElementById("fundo").style.backgroundRepeat= "no-repeat";
}
function myFunction() {
    var firstName = document.createElement("firstName").value
    var lastName =  document.createElement("lastName").value
    
    document.write(firstName);
  }