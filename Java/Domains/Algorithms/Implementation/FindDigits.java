import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/find-digits">Find Digits</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
 public class FindDigits {

     static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     static PrintWriter out = new PrintWriter(System.out);

     public static void main(String[] args) throws IOException {
         int T = Integer.parseInt(in.readLine());
         for (int i = 0; i < T; i++) {
             String s = in.readLine();
             int N = Integer.parseInt(s);
             char[] d = s.toCharArray();
             int c = 0;
             for (int j = 0; j < d.length; j++) {
                 int k = Character.getNumericValue(d[j]);
                 if (k != 0) {
                     if (N % k == 0) {
                         c++;
                     }
                 }
             }
             out.println(c);
         }
         out.close();
     }
 }
