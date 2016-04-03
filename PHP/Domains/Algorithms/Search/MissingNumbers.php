<?php
/**
 * See <a href="https://www.hackerrank.com/challenges/missing-numbers">Missing Numbers</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function missingNumbers($A, $B) {
    $repetitionsOfA = array_count_values($A);
    $repetitionsOfB = array_count_values($B);
    $missingNumbers = [];
    foreach($repetitionsOfB as $key => $value) {
        $countA = (key_exists($key, $repetitionsOfA)) ? $repetitionsOfA[$key] : 0;
        $numberOfLosses = $value - $countA;
        if($numberOfLosses !== 0) {
           $missingNumbers[] = $key; 
        }
    }
    sort($missingNumbers);
    return implode(' ', $missingNumbers);
}
$fp = fopen("php://stdin", "r");
fgets($fp);
$A = explode(' ',trim(fgets($fp)));
fgets($fp);
$B = explode(' ',trim(fgets($fp)));

echo missingNumbers($A, $B);
?>
