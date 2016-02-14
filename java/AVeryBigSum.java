import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * See <a href="https://www.hackerrank.com/challenges/a-very-big-sum">A Very Big Sum</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class AVeryBigSum {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        BigInteger sum = new BigInteger("0");
        BigInteger k;
        String[] p = in.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            k = new BigInteger(p[i]);
            sum = sum.add(k);
        }
        out.println(sum);
        out.close();
    }
}
