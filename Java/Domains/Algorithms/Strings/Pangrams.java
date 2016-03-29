import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/pangrams">Pangrams</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Pangrams {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);
	static final char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	public static void main(String[] args) throws IOException {
		String s = in.readLine();
		boolean f = true;
		for (int i = 0; i < a.length; i++) {
			String l = String.valueOf(a[i]);
			if (!s.toLowerCase().contains(l)) {
				f = false;
				break;
			}
		}
		out.println(f ? "pangram" : "not pangram");
		out.close();
	}
}
