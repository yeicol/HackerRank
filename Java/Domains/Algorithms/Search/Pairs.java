
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/pairs">Pairs</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Pairs {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int K = Integer.parseInt(in.readLine().split("\\s")[1]);
        int[] A = Arrays.stream(in.readLine().split("\\s")).mapToInt(Integer::parseInt).sorted().toArray();
        out.println(countPairs(A, K));
        out.close();
    }

    public static int countPairs(int[] A, int K) {
        int pairs = 0;
        int point1 = 0;
        int point2 = 1;
        int difference;
        while (point2 < A.length) {
            difference = A[point2] - A[point1];
            if (difference == K) {
                pairs++;
                point1++;
                point2++;
            } else if (difference < K) {
                point2++;
            } else {
                point1++;
                if (point2 - point1 == 0) {
                    point2++;
                }
            }

        }

        return pairs;
    }
}
