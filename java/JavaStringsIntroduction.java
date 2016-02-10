import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-strings-introduction">Java Strings Introduction</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaStringsIntroduction {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String A,B ;
		String L = in.readLine();
		String[] P = L.split(" ");
		if(P.length == 2) {
			A = P[0];
			B = P[1];
		}
		else {
			A = L;
			B = in.readLine();
		}
		out.println(A.length() + B.length());
		out.println(A.compareTo(B) >0 ? "Yes" : "No");
		out.println(upperCaseFirstLetter(A) +  " " + upperCaseFirstLetter(B));
		out.close();
	}
	public static String  upperCaseFirstLetter(String s) {
		 if(s.length() == 1) {
			 return s.toUpperCase();
		 }
		 else {
			 return s.substring(0, 1).toUpperCase() + s.substring(1);
		 }
	}
}
