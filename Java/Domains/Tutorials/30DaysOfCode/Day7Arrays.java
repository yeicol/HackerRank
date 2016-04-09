
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-arrays">Day 7: Arrays</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day7Arrays {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        in.readLine();
        String[] A = in.readLine().split("\\s");
        for (int i = A.length - 1 ; i >= 0; i--) {
            out.print(A[i]);
            out.print(i == 0 ? "" : " ");
        }
        out.close();
    }
}
