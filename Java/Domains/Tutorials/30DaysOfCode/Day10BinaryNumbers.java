import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-binary-numbers">Day 10: Binary Numbers</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day10BinaryNumbers {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		int maxConsecutives = 0;
		int aux = 0;
		while(n >= 1) {
			aux = n % 2 == 1 ? aux + 1 : 0;
			maxConsecutives = (aux > maxConsecutives) ? aux : maxConsecutives;
			n/=2;
		}
		out.println(maxConsecutives);
		out.close();
	}
}
