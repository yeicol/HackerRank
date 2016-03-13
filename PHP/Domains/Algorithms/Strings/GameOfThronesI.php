<?php
/**
 * See <a href="https://www.hackerrank.com/challenges/game-of-thrones">Game of Thrones - I</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function canBePalidrome($string){
    $occurrences = [];
    $length = strlen($string);
    for($i = 0; $i < $length; $i++){
        $char = $string[$i];
        if(array_key_exists($char, $occurrences)){
            $occurrences[$char]++;
        }
        else {
            $occurrences[$char] = 1;
        }
    }
    $maxOdd = $length  %2 === 0 ? 0 : 1;
    $odd = 0;
    foreach($occurrences as $ocurrence){
       if($ocurrence %2 !== 0 && ++$odd > $maxOdd){
           return "NO";
       }
    }
    return "YES";
}

$fp = fopen("php://stdin", "r");
list ($string) = fscanf($fp, "%s");
echo canBePalidrome($string);
?>
