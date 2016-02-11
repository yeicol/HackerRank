
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-end-of-file">Java End-of-file</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaEndOfFile {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        long n = 1;
        while ((l = in.readLine()) != null) {
            out.println(Long.toString(n) + ' ' + l);
            n++;
        }
        out.close();
    }
}
