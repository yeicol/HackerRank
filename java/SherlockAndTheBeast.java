
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/sherlock-and-the-beast">Sherlock and The Beast</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class SherlockAndTheBeast {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        int N, fb, tb, fl, tl;
        int f = 0;
        int t = 0;
        String fs, ts;
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(in.readLine());
            fl = fb = N;
            tl = tb = 0;
            boolean b = false;
            while (fb >= 0) {
                if (fb % 3 == 0 && tb % 5 == 0) {
                    f = fb;
                    t = tb;
                    b = true;
                    break;
                } else if (fl % 3 == 0 && tl % 5 == 0) {
                    f = fl;
                    t = tl;
                    b = true;
                    break;
                }
                fb -= 3;
                tb += 3;
                if (fl > fb && fl >= 5) {
                    fl -= 5;
                    tl += 5;
                }
            }
            if (b) {
                fs = new String(new char[f]).replace("\0", "5");
                ts = new String(new char[t]).replace("\0", "3");
                out.println(fs + ts);
            } else {
                out.println(-1);
            }
        }
        out.close();
    }
}
