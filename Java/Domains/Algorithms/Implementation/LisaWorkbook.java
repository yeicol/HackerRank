
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class LisaWorkbook {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] P = in.readLine().split("\\s");
        int n = Integer.parseInt(P[0]);
        int k = Integer.parseInt(P[1]);
        String[] t = in.readLine().split("\\s");
        for (int i = 1; i <= n; i++) {

        }

        out.close();
    }
}
