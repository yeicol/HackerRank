
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/funny-string">Funny String</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class FunnyString {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {
			String S = in.readLine();
			System.out.println((isFunny(S)) ? "Funny" : "Not Funny");
		}
		out.close();
	}

	private static boolean isFunny(String S) {
		char[] c = S.toCharArray();
		char[] r = new StringBuilder(S).reverse().toString().toCharArray();
		for (int i = 1; i < S.length(); i++) {
			if (Math.abs((int) c[i] - (int) c[i - 1]) != Math.abs((int) r[i] - (int) r[i - 1])) {
				return false;
			}
		}
		return true;
	}
}
