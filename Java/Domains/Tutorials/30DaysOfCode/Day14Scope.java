
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-scope">Day 14: Scope</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day14Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}

class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = elements[elements.length - 1] - elements[0];
    }

}
