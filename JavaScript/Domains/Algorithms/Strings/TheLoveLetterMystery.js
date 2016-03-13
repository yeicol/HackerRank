/**
 * See <a href="https://www.hackerrank.com/challenges/the-love-letter-mystery">The Love-Letter Mystery</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function main() {
    var T = parseInt(readLine());
    var s;
    for (var i = 0; i < T; i++) {
        s = readLine();
        console.log(conversion(s));
    }
}
process.stdin.resume();
process.stdin.setEncoding('ascii');
r = [];
var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function(data) {
    input_stdin += data;
});

process.stdin.on('end', function() {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}


function conversion(s) {
    var n = 0;
    var f, l, fc, lc;
    for (var j = 0; j < s.length / 2; j++) {
        f = s[j];
        l = s[s.length - j - 1];
        if (f !== l) {
            fc = f.charCodeAt(0);
            lc = l.charCodeAt(0);
            n += (fc > lc) ? fc - lc : lc - fc;
        }
    }
    return n;
}
