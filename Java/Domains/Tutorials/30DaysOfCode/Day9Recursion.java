
import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-recursion">Day 9: Recursion</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day9Recursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte N = in.nextByte();
		in.close();
		System.out.println(factorial(N));
	}

	private static int factorial(byte N) {
		return (N > 1) ? N * factorial((byte) (N - 1)) : N;
	}
}
