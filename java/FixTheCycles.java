
import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/contests/w19/challenges/fix-the-cycles">Fix the Cycles</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class FixTheCycles {

	public static Scanner sc = new Scanner(System.in);
	public static int a = scan();
	public static int b = scan();
	public static int c = scan();
	public static int d = scan();
	public static int e = scan();
	public static int f = scan();

	public static void main(String[] args) {

		if ((a + b + f) < 0 && (a + e + d) > 0 && (f < 0 && e < 0 || b < 0 && d < 0)) {
			System.out.println(-1);
		} else {
			int p = 0;
			while (true) {

				if ((a + p + b + f) >= 0 && (a + p + b + c + d) >= 0 && (a + p + e + d) >= 0) {
					break;
				}
				if ((a + p + b + f) >= 0 && (a + p + b + c + d) >= 0 && (a + e + d) >= 0) {
					break;
				}
				if ((a + b + f) >= 0 && (a +p + b + c + d) >= 0 && (a + e + d) >= 0) {
					break;
				}
				if ((a + b + f) >= 0 && (a +p + b + c + d) >= 0 && (a + e +p + d) >= 0) {
					break;
				}
				if ((a + b + f) >= 0 && (a + b + c + d) >= 0 && (a + e +p + d) >= 0) {
					break;
				}
				if ((a + p + b + f) >= 0 && (a + b + c + d) >= 0 && (a + e + d) >= 0) {
					break;
				}
				p++;
			}
			System.out.println(p);
		}

	}

	private static int scan() {
		return sc.nextInt();
	}

}
