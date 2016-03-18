
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * See <a href="https://www.hackerrank.com/challenges/sparse-arrays">Sparse Arrays</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class SparseArrays {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        Map<String, Integer> querys = new HashMap<>();
        String query;
        while (N-- > 0) {
            int count = 1;
            query = in.readLine();
            if (querys.containsKey(query)) {
                count += querys.get(query);
            }
            querys.put(query, count);
        }
        N = Integer.parseInt(in.readLine());
        while (N-- > 0) {
            query = in.readLine();
            if (querys.containsKey(query)) {
                out.println(querys.get(query));
            } else {
                out.println(0);
            }
        }
        out.close();
    }
}
