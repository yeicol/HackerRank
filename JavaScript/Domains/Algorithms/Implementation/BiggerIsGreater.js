'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'biggerIsGreater' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING w as parameter.
 */

function biggerIsGreater(w) {
    const regexD = 'z*y*x*w*v*u*t*s*r*q*p*o*n*m*l*k*j*i*h*g*f*e*d*c*b*a*'
    const matchesRD = w.match(new RegExp(regexD, 'g'));
    if (matchesRD.length === 2){
        return 'no answer';
    }
    
    let pMatch = matchesRD[matchesRD.length - 3];
    let lMatch = matchesRD[matchesRD.length - 2];
    const letterToReplace = pMatch.slice(-1);
    let i = 0;
    while(i < lMatch.length) {
        if(lMatch[i] <= letterToReplace) {
            break;
        }
        i++;
    }
    i--;
    pMatch = replaceStringIndex(pMatch, pMatch.length - 1, lMatch[i]);
    lMatch = replaceStringIndex(lMatch, i, letterToReplace);
    const base = w.slice(0, -(lMatch.length + pMatch.length));

    return base + pMatch + lMatch.split('').sort().join('');
}

function replaceStringIndex(string, index, letter) {
    return string.slice(0, index) + letter + string.slice(index + 1)
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const T = parseInt(readLine().trim(), 10);

    for (let TItr = 0; TItr < T; TItr++) {
        const w = readLine();

        const result = biggerIsGreater(w);

        ws.write(result + '\n');
    }

    ws.end();
}

