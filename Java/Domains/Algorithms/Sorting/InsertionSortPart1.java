
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/insertionsort1">Insertion Sort - Part 1</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class InsertionSortPart1 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void insertIntoSorted(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int x = ar[i];
            int j = i;
            while (j > 0 && ar[j - 1] > x) {
                ar[j] = ar[j - 1];
                j = j - 1;
                printArray(ar);
            }
            ar[j] = x;
        }
    }

    public static void main(String[] args) throws IOException {
        in.readLine();
        int[] ar = Arrays.stream(in.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        insertIntoSorted(ar);
        printArray(ar);
        out.close();
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            out.print(n + " ");
        }
        out.println("");
    }

}
