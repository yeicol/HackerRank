
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.abs;
import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * See <a href="https://www.hackerrank.com/contests/w19/challenges/fix-the-cycles">Fix the Cycles</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
 public class FixTheCycles {

 	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 	static PrintWriter out = new PrintWriter(System.out);

 	public static void main(String[] args) throws IOException {

 		String[] P = in.readLine().split(" ");
 		int a = Integer.parseInt(P[0]);
 		int b = Integer.parseInt(P[1]);
 		int c = Integer.parseInt(P[2]);
 		int d = Integer.parseInt(P[3]);
 		int e = Integer.parseInt(P[4]);
 		int f = Integer.parseInt(P[5]);
 		int C1 = a + b + c + d;
 		int C2 = a + b + f;
 		int C3 = a + d + e;
 		out.println(abs((int) min(0, C1, C2, C3)));
 		out.close();
 	}
 }
