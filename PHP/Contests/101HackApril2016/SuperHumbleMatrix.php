<?php
/**
 * See <a href="https://www.hackerrank.com/contests/101hack36/challenges/super-humble-matrix">Super Humble Matrix</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
function countHumbleMatrix($N, $M) {
    $mod = 1000000007;
    $factorial = [1];
    for ($k = 1; $k <= $N + $M; $k++) {
        $factorial[$k] = ($k * $factorial[$k - 1]) % $mod;
    }

    $ans = 1;
    $i = $N;
    $j = 1;
    for ($k = $N - 1; $k >= 1 - $M; $k--) {
        $pos = $j - ($i - $k) + 1;
        $ans *= $factorial[$pos];
        $ans %= $mod;
        $i = max(--$i, 1);
        $j = min(++$j, $M);
    }

    return $ans; 
}
    
$fp = fopen("php://stdin", "r");
$P = fscanf($fp, "%d %d%[^\n]");
list ($N, $M) = $P;

echo countHumbleMatrix($N, $M);
