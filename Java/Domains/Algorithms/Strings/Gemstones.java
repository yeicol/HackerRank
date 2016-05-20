
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * See <a href="https://www.hackerrank.com/challenges/gem-stones">Gemstones</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Gemstones {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		List<String> rocks = new ArrayList<>();
		while (N-- > 0) {
			rocks.add(in.readLine());
		}

		List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

		Stream<String> gemstones = alphabet.stream()
				.filter(
						letter -> rocks.stream()
						.filter(
								rock -> rock.contains(letter)
						)
						.count() == rocks.size()
				);

		out.print(gemstones.toArray().length);
		out.close();
	}
}
