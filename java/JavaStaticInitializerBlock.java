
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-static-initializer-block">Java Static Initializer Block</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaStaticInitializerBlock {

	public static Scanner sc = new Scanner(System.in);
	public static int B = scan();
	public static int H = scan();
	public static boolean flag = initializer() ;

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}//end of main

	private static boolean initializer()  {
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			return false;
		}
		return true;
	}

	private static int scan() {
		return sc.nextInt();
	}

}//end of class
