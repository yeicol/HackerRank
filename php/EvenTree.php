<?php
/**
 * See <a href="https://www.hackerrank.com/challenges/even-tre">Even Tree</a>
 * @author Brian Yeicol Restrepo Tangarife
 */

$fp = fopen("php://stdin", "r");
$P = fscanf($fp, "%s %s%[^\n]");
list ($N, $M) = $P;
$t = array_fill(0, $N, 0);
$c = array_fill(0, $N, 1);

for ($i = 0; $i < $M; $i++) {
    $P = fscanf($fp, "%s %s%[^\n]");
    list ($e, $v) = $P;
    $t[$e - 1] = $v;
    $c[$v - 1] += $c[$e - 1];
    $r = $t[$v - 1];

    while ($r != 0) {
        $c[$r - 1] += $c[$e - 1];
        $r = $t[$r - 1];
    }
}

$q = -1;
for ($i = 0; $i < $M; $i++) {
    if ($c[$i] % 2 == 0) {
        $q++;
    }
}
echo $q;

?>
