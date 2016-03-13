
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-loops">Java Loops</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaLoops {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine());
        String[] P;
        String s;
        int a, b, n, o;
        for (int i = 0; i < t; i++) {
            s = "";
            o = 0;
            P = in.readLine().split(" ");
            a = Integer.parseInt(P[0]);
            b = Integer.parseInt(P[1]);
            n = Integer.parseInt(P[2]);
            for (int j = 0; j < n; j++) {
                o += (int) (Math.pow(2, j) * b);
                s += Integer.toString(a + o) + " ";
            }
            out.println(s.substring(0, s.length() - 1));
        }
        out.close();
    }
}
