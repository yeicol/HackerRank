var $btn = document.getElementById("btn"); 
$btn.addEventListener("click", function(){
    var value = parseInt(this.innerHTML, 10) + 1;
    this.innerHTML = value;
});