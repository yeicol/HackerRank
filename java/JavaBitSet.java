
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;

/**
 * See <a href="https://www.hackerrank.com/challenges/a-very-big-sum">Java BitSet</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaBitSet {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] P = in.readLine().split(" ");
        int N = Integer.parseInt(P[0]);
        int M = Integer.parseInt(P[1]);
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        for (int i = 0; i < M; i++) {
            P = in.readLine().split(" ");
            String o = P[0].toUpperCase();
            int t1 = Integer.parseInt(P[1]);
            int t2 = Integer.parseInt(P[2]);
            switch (o) {
                case "AND":
                    if (t1 == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (t1 == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (t1 == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (t1 == 1) {
                        B1.flip(t2);
                    } else {
                        B2.flip(t2);
                    }
                    break;
                case "SET":
                    if (t1 == 1) {
                        B1.set(t2);
                    } else {
                        B2.set(t2);
                    }
                    break;
            }
            out.println(B1.cardinality() + " " + B2.cardinality());
        }
        out.close();

    }

}
