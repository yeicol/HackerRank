
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-data-types">Day 1: Data Types</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day1DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i1;
        double d1;
        String s1;

        /* Read and save an integer, double, and String to your variables.*/
        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i1);

        /* Print the sum of both double variables on a new line. */
        System.out.println(d + d1);

        /* Concatenate and print both String variables on a new line;
           the 's' variable above should be printed first. */
        System.out.println(s + s1);
        scan.close();
    }
}
