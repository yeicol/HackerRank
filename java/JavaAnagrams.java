import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-anagrams">Java Anagrams</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaAnagrams {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		char[] A = in.readLine().toLowerCase().toCharArray();
        char[] B = in.readLine().toLowerCase().toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		out.println(Arrays.equals(B, A) ? "Anagrams" : "Not Anagrams");
		out.close();
	}
}
