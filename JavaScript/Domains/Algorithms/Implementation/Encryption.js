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
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function encryption(s) {
    const newS = s.replace(/\s+/g, '');
    const root = Math.sqrt(newS.length);
    const columns = Math.ceil(root);
    
    let result = '';
    for(let i = 0; i < columns ; i++) {
        let columnMessage = ' '
        for (let j = i; j < newS.length; j += columns) {
            columnMessage+= newS[j];
        }
        
        result+= columnMessage;
    }
    return result.trim();
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    const result = encryption(s);

    ws.write(result + '\n');

    ws.end();
}
