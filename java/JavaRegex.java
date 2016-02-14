import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * See <a href="https://www.hackerrank.com/challenges/java-regex">Java Regex</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}

class myRegex {

    public static String pattern = "((0|\\d|[0-1]?\\d\\d|2[0-5][0-5]|2[0-4]\\d)\\.){3}((\\d|[0-1]?\\d\\d|2[0-5][0-5]|2[0-4]\\d))";

}
