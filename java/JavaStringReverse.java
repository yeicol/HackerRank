import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-string-reverse">Java String Reverse</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaStringReverse {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String A = in.readLine();
		String B = new StringBuilder(A).reverse().toString();
		out.println(A.compareTo(B) == 0 ? "Yes" : "No");
		out.close();
	}
}
