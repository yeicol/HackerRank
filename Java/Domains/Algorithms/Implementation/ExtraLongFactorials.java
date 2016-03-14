import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * See <a href="https://www.hackerrank.com/challenges/extra-long-factorials">Extra Long Factorials</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class ExtraLongFactorials {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        BigInteger N = new BigInteger(in.readLine());
        BigInteger F = N;
        BigInteger one = BigInteger.ONE;
        while (N.compareTo(one) > 0) {
            N = N.subtract(one);
            F = F.multiply(N);

        }
        out.println(F);
        out.close();
    }
}
