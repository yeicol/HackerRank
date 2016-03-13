
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-string-compare">Java String Compare</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaStringCompare {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s = in.readLine();
        int k = Integer.parseInt(in.readLine());
        String l = s.substring(0, k);
        String b = l;
        String a;
        while (s.length() >= k) {
            a = s.substring(0, k);
            if (l.compareTo(a) > 0) {
                l = a;
            }
            if (a.compareTo(b) > 0) {
                b = a;
            }
            s = s.substring(1, s.length());
        }
        out.println(l);
        out.println(b);
        out.close();
    }
}
