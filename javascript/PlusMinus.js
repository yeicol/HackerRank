/**
 * See <a href="https://www.hackerrank.com/challenges/plus-minus">Plus Minus</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

function main() {
    var N = parseInt(readLine());
    var A = readLine().split(' ');

    var positive = a => parseInt(a, 10) > 0;
    var negative = a => parseInt(a, 10) < 0;

    var p = A.filter(positive).length;
    var n = A.filter(negative).length;
    var z = A.length - p - n ;

    console.log((p/N).toFixed(6));
    console.log((n/N).toFixed(6));
    console.log((z/N).toFixed(6));
}
