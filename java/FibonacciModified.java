
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * See <a href="https://www.hackerrank.com/challenges/fibonacci-modified">Fibonacci Modified</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class FibonacciModified {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] P = in.readLine().split(" ");
        BigInteger A = new BigInteger(P[0]);
        BigInteger B = new BigInteger(P[1]);
        BigInteger S0 = A;
        BigInteger S1 = B;
        BigInteger Aux;
        byte N = (byte) (Byte.parseByte(P[2]));
        for (int i = 2; i < N; i++) {
            Aux = S1;
            S1 = S0.add(S1.pow(2));
            S0 = Aux;
        }
        out.println(S1);
        out.close();
    }
}
