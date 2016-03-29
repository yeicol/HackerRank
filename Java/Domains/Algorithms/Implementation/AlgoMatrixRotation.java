
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.min;
import java.util.Arrays;

/**
 * See <a href="https://www.hackerrank.com/challenges/matrix-rotation-algo">[Algo] Matrix Rotation</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class AlgoMatrixRotation {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] P = in.readLine().split("\\s");
        int M = Integer.parseInt(P[0]);
        int N = Integer.parseInt(P[1]);
        int R = Integer.parseInt(P[2]);
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            matrix[i] = Arrays.stream(in.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }
        rotateMatrix(matrix, M, N, R);
        printMatrix(matrix, M, N);

    }

    /**
     * Rotates a given matrix in anti-clockwise direction
     *
     * @param matrix matrix to rotate
     * @param M number of rows
     * @param N number of columns
     * @param R number of times the matrix has to be rotated
     */
    private static void rotateMatrix(int[][] matrix, int M, int N, int R) {
        int internalRotations = min(M, N) / 2;
        int mi, mf, ni, nf, i = 0;
        while (i < internalRotations) {
            mi = i;
            mf = M - i;
            ni = i;
            nf = N - i;

            int[] rotated = createRotatedVector(matrix, R, mi, mf, nf, ni);
            overWriteInternalRotations(matrix, rotated, mi, mf, nf, ni);

            i++;
        }
    }

    /**
     * Prints a given matrix
     *
     * @param matrix matrix to print
     * @param M number of rows
     * @param N number of columns
     */
    private static void printMatrix(int[][] matrix, int M, int N) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                out.print(matrix[i][j]);
                out.print(j == N - 1 ? "\n" : " ");
            }
        }
        out.close();
    }

    /**
     * Create a rotated vector from a internal cycle of a given matrix
     *
     * @param matrix matrix to extract data
     * @param rotations number of the rotations
     * @param mi initial position of the row
     * @param mf final position of the row
     * @param nf initial position of the column
     * @param ni final position of the column
     * @return rotated vector
     */
    private static int[] createRotatedVector(int[][] matrix, int rotations, int mi, int mf, int nf, int ni) {
        int perimeter = 2 * (mf - mi) + 2 * (nf - ni) - 4;
        int[] vector = new int[perimeter];
        int index = rotations % perimeter;
        index = index == vector.length ? 0 : index;

        int aux = mi;
        while (aux < mf) {
            index = insertDataVector(vector, index, matrix[aux++][ni]);
        }
        aux = ni + 1;
        while (aux < nf) {
            index = insertDataVector(vector, index, matrix[mf - 1][aux++]);
        }
        aux = mf - 2;
        while (aux >= mi) {
            index = insertDataVector(vector, index, matrix[aux--][nf - 1]);
        }
        aux = nf - 2;
        while (aux > ni) {
            index = insertDataVector(vector, index, matrix[mi][aux--]);
        }
        return vector;
    }

    /**
     * overwrites the content of a rotated vector in the internal cycle of a
     * matrix
     *
     * @param matrix matrix to be overwrite
     * @param rotated vector rotated
     * @param mi initial position of the row
     * @param mf final position of the row
     * @param nf initial position of the column
     * @param ni final position of the column
     */
    private static void overWriteInternalRotations(int[][] matrix, int[] rotated, int mi, int mf, int nf, int ni) {
        int index = 0;
        int aux = mi;
        while (aux < mf) {
            matrix[aux++][ni] = rotated[index++];
        }
        aux = ni + 1;
        while (aux < nf) {
            matrix[mf - 1][aux++] = rotated[index++];
        }
        aux = mf - 2;
        while (aux >= mi) {
            matrix[aux--][nf - 1] = rotated[index++];
        }
        aux = nf - 2;
        while (aux > ni) {
            matrix[mi][aux--] = rotated[index++];
        }
    }

    /**
     * Insert a data in given index from a vector
     *
     * @param vector
     * @param index
     * @param data
     * @return the next index in the vector
     */
    private static int insertDataVector(int[] vector, int index, int data) {
        vector[index] = data;
        return index + 1 == vector.length ? 0 : index + 1;
    }
}
