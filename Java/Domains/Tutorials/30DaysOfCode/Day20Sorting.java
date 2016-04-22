
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-sorting">Day 20: Sorting</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day20Sorting {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        in.readLine();
        int[] array = Arrays.stream(in.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        bubbleSort(array);
        out.close();

    }

    private static void bubbleSort(int[] array) {
        int totalSwaps = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int swaps = 0;

            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swaps++;
                    totalSwaps++;
                }
            }

            if (swaps == 0) {
                out.println("Array is sorted in " + totalSwaps + " swaps.");
                out.println("First Element: " + array[0]);
                out.println("Last Element: " + array[length - 1]);

                break;
            }
        }
    }

}
