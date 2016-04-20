<?php
/**
 * See <a href="https://www.hackerrank.com/contests/101hack36/challenges/reduced-string">Super Reduced String</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function reduceString($s) {
    while(true) {
        $aux = preg_replace('/(.)\1/', '', $s);
        if($s === $aux) {
           break;
        }
        $s = $aux;
    }
    return strlen($s) > 0 ? $s : "Empty String";
}
    
$fp = fopen("php://stdin", "r");
fscanf($fp, "%s", $s);
echo reduceString($s);

?>
