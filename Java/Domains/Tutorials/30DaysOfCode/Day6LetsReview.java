
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-review-loop">Day 6: Let's Review</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day6LetsReview {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(in.readLine());
		while (T-- > 0) {
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
