
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/maximum-and-minimum">Maximum and Minimum</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class MaximumAndMinimum {

	public static void print(int A[], int i) {
		try {
			System.out.println(A[i]);
		} finally {
			int max = -1000;
			int min = 1000;
			for (int aux = 0; aux < A.length; aux++) {
				if (A[aux] > max) {
					max = A[aux];
				}
				if (A[aux] < min) {
					min = A[aux];
				}
			}
			System.out.println(max + " " + min);
		}
	}

	public static void main(String[] args) {
		int N;
		Scanner st = new Scanner(System.in);
		N = st.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = st.nextInt();
		}
		int i = st.nextInt();
		try {
			print(A, i);

		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

	}// end of main
}// end of Solution

