/**
 * See <a href="https://www.hackerrank.com/challenges/utopian-tree">Utopian Tree</a>
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
    var t = parseInt(readLine());
    for(var a0 = 0; a0 < t; a0++){
        var n = parseInt(readLine());
        var h = (n == 0) ? 1 : 2;
        var c = 0;
        while(c < n - 1){
            if(c % 2 == 1) {
                h*=2;
            }
            else {
                h++;
            }
            c++;
        }
        console.log(h);
    }
}
