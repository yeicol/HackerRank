
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/service-lane">Srvice Lane</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class ServiceLane {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine().split(" ")[1]);
        int[] N = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i, j, min;
        String[] P;

        while (T-- > 0) {
            P = in.readLine().split(" ");
            i = Integer.parseInt(P[0]);
            j = Integer.parseInt(P[1]);
            min = 3;

            while (min > 1 && i <= j) {
                min = (N[i] < min) ? N[i] : min;
                i++;
            }
            out.println(min);
        }
        out.close();
    }
}
