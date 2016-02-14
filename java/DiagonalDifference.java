
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.abs;

/**
 * See <a href="https://www.hackerrank.com/challenges/diagonal-difference">Diagonal Difference</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class DiagonalDifference {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String[][] m = new String[N][N];
        for (int i = 0; i < N; i++) {
            m[i] = in.readLine().split(" ");
        }
        int d1 = 0;
        for (int i = 0; i < N; i++) {
            d1 += Integer.parseInt(m[i][i]);
        }
        int d2 = 0;
        for (int i = N - 1; i >= 0; i--) {
            d2+=Integer.parseInt(m[i][N-i-1]);
        }
        out.println(abs(d1-d2));
        out.close();
    }
}
