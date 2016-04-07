
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-loops">Day 5: Loops</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day5Loops {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		byte N = Byte.parseByte(in.readLine());
		byte i = 0;
		while (i++ < 10) {
			out.println(N + " x " + i + " = " + N * i);
		}
		out.close();
	}
}
