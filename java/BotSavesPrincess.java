
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/saveprincess">Bot Saves Princess</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class BotSavesPrincess {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int x = 0;
        int y = 0;
        int N = Integer.parseInt(in.readLine());
        boolean f = false;
        char[][] m = new char[N][N];
        for (int i = 0; i < N; i++) {
            String s = in.readLine();
            if (!f) {
                int p = s.indexOf('m');
                if (p != -1) {
                    x = i;
                    y = p;
                    f = true;
                }
            }
            m[i] = s.toCharArray();
        }
        if (m[0][0] == 'p') {
            for (int i = 0; i < y; i++) {
                out.println("UP");
            }
            for (int i = 0; i < x; i++) {
                out.println("LEFT");
            }
        } else if (m[N - 1][0] == 'p') {
            for (int i = 0; i < y; i++) {
                out.println("DOWN");
            }
            for (int i = 0; i < N - 1 - x; i++) {
                out.println("LEFT");
            }
        } else if (m[0][N - 1] == 'p') {
            for (int i = 0; i < y; i++) {
                out.println("UP");
            }
            for (int i = 0; i < N - 1 - x; i++) {
                out.println("RIGHT");
            }
        } else if (m[N - 1][N - 1] == 'p') {
            for (int i = 0; i < N - 1 - y; i++) {
                out.println("DOWN");
            }
            for (int i = 0; i < N - 1 - x; i++) {
                out.println("RIGHT");
            }
        }
        out.close();
    }
}
