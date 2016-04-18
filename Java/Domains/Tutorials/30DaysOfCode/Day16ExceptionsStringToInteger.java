import java.io.*;
import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-exceptions-string-to-integer">Day 16: Exceptions - String to Integer</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day16ExceptionsStringToInteger {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.next();
       try{
            int N = Integer.parseInt(S);
            System.out.println(N);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
