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
 * Complete the 'appendAndDelete' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. STRING t
 *  3. INTEGER k
 */

function appendAndDelete(s, t, k) {
    const minLength = Math.min(s.length, t.length);
    let equalLetters = 0;
    let i = 0;
    while(i < minLength) {
        if(s[i] === t[i]) {
            i++;
            equalLetters++;
        } else {
            break;
        }
    }
    const lettersToDelete = s.length - equalLetters;
    const lettersToAdd = t.length - equalLetters;
    const minOperations = lettersToAdd + lettersToDelete;
    const missingOperations = k - minOperations;
    let isSuccessful = false;
    if(missingOperations >= 0) {
        if (missingOperations % 2 === 1) {
            const lettersNeededToBeRemoved = Math.floor(missingOperations / 2);
            isSuccessful = lettersNeededToBeRemoved - equalLetters >= 0;
        } else {
            isSuccessful = true;
        }
    }
    return isSuccessful ? 'Yes' : 'No';

    
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    const t = readLine();

    const k = parseInt(readLine().trim(), 10);

    const result = appendAndDelete(s, t, k);

    ws.write(result + '\n');

    ws.end();
}
