/**
 * See <a href="https://www.hackerrank.com/contests/javascript-week2/challenges/binary-calculator">Day 7: Binary Calculator</a>
 * @author Brian Yeicol Restrepo Tangarife
 */

var $res = document.getElementById('res');
var $btn0 = document.getElementById('btn0');
var $btn1 = document.getElementById('btn1');
var $btnClr = document.getElementById('btnClr');
var $btnEql = document.getElementById('btnEql');
var $btnSum = document.getElementById('btnSum');
var $btnSub = document.getElementById('btnSub');
var $btnMul = document.getElementById('btnMul');
var $btnDiv = document.getElementById('btnDiv');
var op1 = "";
var op2 = "";
var op = "";
var firstOp = true;

function binaryAddition(op1, op2) {
    return (parseInt(op1, 2) + parseInt(op2, 2));
}

function binaryMultiplication(op1, op2) {
    return (parseInt(op1, 2) * parseInt(op2, 2));
}

function binarySubstraction(op1, op2) {
    return (parseInt(op1, 2) - parseInt(op2, 2));
}

function binaryDivision(op1, op2) {
    return (parseInt(op1, 2) / parseInt(op2, 2));
}

function dec2bin(dec) {
    return (dec >>> 0).toString(2);
}

function addValue(val) {
    $res.innerHTML += val;
    if (firstOp) {
        op1 += val;
    } else {
        op2 += val;
    }
}

function clearOperation() {
    op1 = "";
    op2 = "";
    $res.innerHTML = "";
    firstOp = true;
}

function getResult() {
    switch (op) {
        case "+":
            return binaryAddition(op1, op2);
        case "*":
            return binaryMultiplication(op1, op2);
        case "-":
            return binarySubstraction(op1, op2);
        case "/":
            return binaryDivision(op1, op2);
    }
}

function addOperator(operator) {
    firstOp = false;
    op = operator;
    $res.innerHTML += op;
}

$btn0.addEventListener("click", function() {
    addValue("0");
});

$btn1.addEventListener("click", function() {
    addValue("1");
});

$btnClr.addEventListener("click", clearOperation);

$btnEql.addEventListener("click", function() {
    var result = dec2bin(getResult());
    op1 = result;
    op2 = "";
    firstOP = true;
    $res.innerHTML = result;

});

$btnSum.addEventListener("click", function() {
    addOperator("+");
});

$btnSub.addEventListener("click", function() {
    addOperator("-");
});

$btnMul.addEventListener("click", function() {
    addOperator("*");
});

$btnDiv.addEventListener("click", function() {
    addOperator("/");
});
