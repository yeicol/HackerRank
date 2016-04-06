import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-conditional-statements">Day 3: Intro to Conditional Statements</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day3IntroToConditionalStatements {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n % 2 == 1){
          ans = "Weird";
      }
      else{
          // Complete the code
          if(n > 20){
              ans = "Not Weird";
          }
          else if(n >= 6){
              ans = "Weird";
          }
          else if(n >= 2){
              ans = "Not Weird";
          }
      }
      System.out.println(ans);
   }
}
