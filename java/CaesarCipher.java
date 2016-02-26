
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/caesar-cipher-1">Caesar Cipher</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CaesarCipher {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		in.readLine();
		char[] N = in.readLine().toCharArray();
		int K = Integer.parseInt(in.readLine());
		for (char c : N) {
			if (Character.isLetter(c)) {
				char a = Character.isLowerCase(c) ? 'a' : 'A';
				c = (char) ((int) a + ((int) c - (int) a + K) % 26);
			}
			out.print(c);
		}
		out.close();
	}
}
