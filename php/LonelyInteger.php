<?php
/**
 * See <a href="https://www.hackerrank.com/challenges/lonely-integer">Lonely Integer</a>
 * @author Brian Yeicol Restrepo Tangarife
 */

function lonelyInteger( $A) {
    $c = array_fill_keys($a, 0);
    foreach($A as $i) {
        $c[$i]++;
    }
    foreach($c as $k => $v) {
        if($v === 1) {
            echo $k;
            break;
        }
    }
}
$fp = fopen("php://stdin", "r");

fscanf($fp, "%d", $N);
$A = fgets($fp);
$A = split(' ',$A);
echo lonelyInteger($A);

?>
