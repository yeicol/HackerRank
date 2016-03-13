
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;

/**
    * See <a href="https://www.hackerrank.com/challenges/java-string-token">Java String Token</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaStringToken {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s = in.readLine();
        boolean b = Pattern.matches("[!,?._ '@]+.*", s);
        if (b) {
            s = s.replaceFirst("[!,?._ '@]+", "");
        }
        if(s.length() == 0){
            out.println(0);
        }
        else {
            String[] a = s.split("[!,?._ '@]+");
            out.println(a.length);
            for (String w : a) {
                out.println(w);
            }
        }
        out.close();
    }
}
