<?php
/**
 * See <a href="https://www.hackerrank.com/challenges/make-it-anagram">Make it Anagram</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function countDelections($A, $B) {
    $coincidences = 0;
    $countA = count($A);
    $countB = count($B);
    for($i = 0; $i < $countA; $i++){
        $key = array_search ($A[$i], $B);
        if($key !== false){
            $coincidences += 2;
            unset($B[$key]);
        }
    }
    return ($countA + $countB - $coincidences);
}
$fp = fopen("php://stdin", "r");
list($A) = fscanf($fp, "%s");
$A = str_split($A);
list($B) = fscanf($fp, "%s");
$B = str_split($B);

echo countDelections($A, $B);
?>
