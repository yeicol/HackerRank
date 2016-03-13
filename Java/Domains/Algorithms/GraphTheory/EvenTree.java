
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/even-tree">Even Tree</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class EvenTree {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        int t[];
        int q[];
        String[] P = in.readLine().split(" ");
        int N = Integer.parseInt(P[0]);
        int M = Integer.parseInt(P[1]);

        t = new int[N];
        q = new int[N];
        Arrays.fill(q, 1);

        for (int i = 0; i < M; i++) {
            P = in.readLine().split(" ");
            int u = Integer.parseInt(P[0]);
            int v = Integer.parseInt(P[1]);

            t[u - 1] = v;

            q[v - 1] += q[u - 1];

            int root = t[v - 1];

            while (root != 0) {
                q[root - 1] += q[u - 1];
                root = t[root - 1];
            }
        }

        int c = -1;
        for (int i = 0; i < M; i++) {
            if (q[i] % 2 == 0) {
                c++;
            }

        }
        out.println(c);
        out.close();

    }

}
