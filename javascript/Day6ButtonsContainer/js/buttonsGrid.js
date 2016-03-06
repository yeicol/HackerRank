
/**
 * See <a href="https://www.hackerrank.com/contests/javascript-week2/challenges/buttonscontainer">Day 6: Buttons Container</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
 
var $b5 = document.getElementById("btn5");
var p = [1, 2, 3, 6, 9, 8, 7, 4 ];
var e = [1, 2, 3, 4, 6, 7, 8, 9];

$b5.addEventListener("click", function() {

    for(var j = 0; j < 8; j++)
    {
        var $b = document.getElementById("btn" + e[j]);
        var v  = parseInt($b.innerHTML,10);
        var i  = p.indexOf(v);
        var u  = (i === 0) ? 7 : i - 1;
        $b.innerHTML = p[u];
    }
});