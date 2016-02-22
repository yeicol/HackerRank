
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * See <a href="https://www.hackerrank.com/challenges/time-conversion">Time Conversion</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class TimeConversion {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException, ParseException {
        String s = in.readLine();
        Date date = new SimpleDateFormat("hh:mm:ssaa").parse(s);
        String t = new SimpleDateFormat("HH:mm:ss").format(date);
        out.println(t);
        out.close();
    }
}
