
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/chocolate-feast">Chocolate Feast</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class ChocolateFeast {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        int N, C, M;
        String[] P;
        while (T-- > 0) {
            P = in.readLine().split("\\s");
            N = Integer.parseInt(P[0]);
            C = Integer.parseInt(P[1]);
            M = Integer.parseInt(P[2]);
            int bought = N / C;
            int wrappers = bought;
            while (wrappers >= M) {
                bought += (wrappers / M);
                int unused = wrappers % M;
                wrappers = (wrappers / M) + unused;
            }
            out.println(bought);
        }
        out.close();
    }
}
