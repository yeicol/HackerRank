<?php
/**
 * See <a href="https://www.hackerrank.com/challenges/lonely-integer">Lonely Integer</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function lonelyInteger( $A) {
    $c = array_fill_keys($A, 0);
    foreach($A as $i) {
        $c[$i]++;
    }
    foreach($c as $k => $v) {
        if($v === 1) {
            return $k;
        }
    }
}
$fp = fopen("php://stdin", "r");

fscanf($fp, "%d", $N);
$A = fgets($fp);
$A = explode(' ', $A);
echo lonelyInteger($A);

?>
