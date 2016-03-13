
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-biginteger">Java BigInteger</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaBigInteger {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		BigInteger B = new BigInteger(in.readLine());
		BigInteger A = new BigInteger(in.readLine());
		out.println(A.add(B));
		out.println(A.multiply(B));
		out.close();
	}
}
