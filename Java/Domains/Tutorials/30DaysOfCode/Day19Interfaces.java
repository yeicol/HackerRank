import java.io.*;
import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-interfaces">Day 19: Interfaces</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
class Day19Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisor = 1;
        int sum = 0;
        while(divisor <= n / 2) {
            if(n % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }
        return sum + n;
    }
}
