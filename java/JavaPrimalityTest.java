import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/java-primality-test/">Java Primality Test</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaPrimalityTest {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      System.out.print(n.isProbablePrime(1) ? "prime": "not prime");
   }
}
