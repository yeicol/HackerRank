
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/cut-the-sticks">Cut the sticks</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CutTheSticks {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        in.readLine();
        String str = in.readLine();

        int[] S = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        printCuts(S);
        out.close();
    }

    private static void printCuts(int sticks[]) {
        int pos = 0;
        int countSticks = sticks.length;
        while (pos < countSticks) {
            int lengthOfCut = sticks[pos];
            if (lengthOfCut > 0) {
                for (int i = pos; i < countSticks; i++) {
                    sticks[i]-=lengthOfCut;
                }
                out.println(countSticks - pos);
            }
            pos++;
        }
    }
}
