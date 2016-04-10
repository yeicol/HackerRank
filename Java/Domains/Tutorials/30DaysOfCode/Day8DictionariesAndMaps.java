import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-dictionaries-and-maps">Day 8: Dictionaries and Maps</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day8DictionariesAndMaps {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		Map<String, String> phoneBook = new HashMap<>();
		String name;
		String phone;
		while (n-- > 0) {
            String[] P = in.readLine().split("\\s");
			name = P[0];
			phone = P[1];
			phoneBook.put(name, phone);

		}

		while ((name = in.readLine()) != null) {
			phone = phoneBook.get(name);
			if (phone != null) {
				out.println(name + "=" + phone);
			}
			else {
				out.println("Not found");
			}
		}

		out.close();
	}
}
