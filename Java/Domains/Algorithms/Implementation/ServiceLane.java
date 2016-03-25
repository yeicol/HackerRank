
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class ServiceLane {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine().split(" ")[1]);
        int[]N = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        out.close();
    }
}
