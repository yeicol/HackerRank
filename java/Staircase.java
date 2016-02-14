
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/staircase">Staircase</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Staircase {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String s, n;
        for (int i = 1; i <= N; i++) {
            s = new String(new char[N - i]).replace("\0", " ");
            n = new String(new char[i]).replace("\0", "#");
            out.println(s + n);
        }
        out.close();
    }
}
