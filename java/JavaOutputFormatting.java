
import java.util.Scanner;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-output-formatting">JavaOutputFormatting</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            String sp = "               ";
            String ts = "000";
            int x = sc.nextInt();
            s1 += sp.substring(0, 15 - s1.length());
            String n = Integer.toString(x);
            n = ts.substring(0, 3 - n.length()) + n;
            System.out.println(s1 + n);
        }
        System.out.println("================================");

    }
}
