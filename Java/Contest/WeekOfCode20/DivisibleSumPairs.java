
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="https://www.hackerrank.com/contests/w20/challenges/divisible-sum-pairs">Divisible
 * Sum Pairs</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class DivisibleSumPairs {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int[] p = readArray();
		int n = p[0];
		int k = p[1];
		p = readArray();
		int validPairs = 0;
		int i = 0;
		while (i++ < n) {
			for (int j = i; j < n; j++) {
				if ((p[i - 1] + p[j]) % k == 0) {
					validPairs++;
				}
			}
		}
		out.println(validPairs);
		out.close();
	}

	private static int[] readArray() throws IOException {
		String[] line = in.readLine().split("\\s");
		int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		return a;
	}

}
