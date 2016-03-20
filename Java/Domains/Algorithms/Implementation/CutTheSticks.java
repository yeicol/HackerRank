
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CutTheSticks {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        in.readLine();
        String str = in.readLine();
        int[] S = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        quickSort(S, 0, S.length - 1);
        printCuts(S);
        out.close();
    }

    private static int partition(int A[], int left ,int r) {
        int i = left, j = r;
        int tmp;
        int p = A[(left + r) / 2];

        while (i <= j) {
            while (A[i] < p) {
                i++;
            }
            while (A[j] > p) {
                j--;
            }
            if (i <= j) {
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    private static void quickSort(int A[], int left, int right) {
        int index = partition(A, left, right);
        if (left < index - 1) {
            quickSort(A, left, index - 1);
        }
        if (index < right) {
            quickSort(A, index, right);
        }
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
