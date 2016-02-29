/**
 * See <a href="https://www.hackerrank.com/contests/javascript-week2/challenges/day-1-loops">Day 1: Loops</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function vowelsAndConsonants(s) {
    var vowels = [];
    var consonants = [];
    var letter = "";
    for ( var i = 0; i < s.length; i++ )
    {
        letter = s.charAt(i);
        if(letter.match(/[aeiou]/gi) !== null)
        {
            vowels.push(letter);
        }
        else
        {
            consonants.push(letter);
        }
    }
    var letters = vowels.concat(consonants);
    for (letter of letters) {
        console.log(letter);
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");

var input = "";

process.stdin.on("data", function (line) {
    input += line;
});

process.stdin.on("end", function () {
     vowelsAndConsonants(input);
});
