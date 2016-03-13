
/**
 * See <a href="https://www.hackerrank.com/contests/javascript-week2/challenges/create-a-button">Day 5: Create a Button</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
var $btn = document.getElementById("btn"); 
$btn.addEventListener("click", function(){
    var value = parseInt(this.innerHTML, 10) + 1;
    this.innerHTML = value;
});
