import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/simple-array-sum">Simple Array Sum</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class SimpleArraySum {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String[] P = in.readLine().split(" ");
        int s = 0;
        for (int i = 0; i < N; i++) {
            s+= Integer.parseInt(P[i]);
        }
        out.println(s);
        out.close();
    }
}
