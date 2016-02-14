/**
 * See <a href="https://www.hackerrank.com/challenges/connected-cell-in-a-grid">Connected Cell in a Grid</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
process.stdin.resume();
process.stdin.setEncoding('ascii');
r = [];
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
    var m = parseInt(readLine()) - 1;
    var n = parseInt(readLine()) - 1;
    var toInteger = a => parseInt(a,10);

    var m
    for (var i = 0; i <= m; i++) {
        r.push(readLine().split(" ").map(toInteger));
    }
    var t = 0;
    var k = 0;
    for(var x = 0; x <= m; x++) {
        for (var y = 0; y <= n; y++){
            k = region(x, y, m, n);
            t = k > t ? k : t;
        }
    }
    console.log(t);
}

function region(x, y, m, n) {
    if (x >= 0 && x <= m && y >= 0 && y <= n && r[m][n] !== 2) {
        if(r[x][y] === 1) {
            r[x][y] = 2;
            return 1 + region(x - 1, y - 1, m, n) +
                region(x - 1, y, m, n) +
                region(x - 1, y + 1, m, n) +
                region(x, y - 1, m, n) +
                region(x, y + 1, m, n) +
                region(x + 1, y - 1, m, n) +
                region(x + 1, y, m, n) +
                region(x + 1, y + 1, m, n);
        }
    }
    return 0;
}
