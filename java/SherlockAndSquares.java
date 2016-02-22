import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/sherlock-and-squares">Sherlock and Squares</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class SherlockAndSquares {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String[] P = in.readLine().split(" ");
            int A = Integer.parseInt(P[0]);
            int B = Integer.parseInt(P[1]);
            int S = (int) (floor(sqrt(B))) - (int) ceil(sqrt(A)) + 1;
            out.println(S);
        }
        out.close();
    }
}
