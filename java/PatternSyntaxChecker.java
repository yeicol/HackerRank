
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;

/**
 * See <a href="https://www.hackerrank.com/challenges/pattern-syntax-checker">Pattern Syntax Checker</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class PatternSyntaxChecker {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String s;
        for (int i = 0; i < N; i++) {
            s = in.readLine();
            try {
                Pattern.matches(s, "hackerrank");
                out.println("Valid");
            } catch (Exception e) {
                out.println("Invalid");
            }
        }
        out.close();
    }
}
