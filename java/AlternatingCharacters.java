
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/alternating-characters">Alternating Characters</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class AlternatingCharacters {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {
			char[] s = in.readLine().toCharArray();
			int d = 0;
			for (int j = 0; j < s.length - 1; j++) {
				if (s[j] == s[j + 1]) {
					d++;
				}
			}
			out.println(d);
		}
		out.close();
	}
}
