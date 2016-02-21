import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/saveprincess2">Bot Saves Princess 2</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class BotSavesPrincess2 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String[] P = in.readLine().split(" ");
        int xb = Integer.parseInt(P[0]);
        int yb = Integer.parseInt(P[1]);
        int xp =0;
        int yp =0;
        for (int i = 0; i < N; i++) {
            String s = in.readLine();
            int p = s.indexOf('p');
            if (p != -1) {
                xp = i;
                yp = p;
                break;
            }
        }
        if(xb > xp) {
           out.println("UP");
        }
        else if(xb < xp) {
           out.println("DOWN");
        }
        else if(yb > yp) {
           out.println("LEFT");
        }
        else {
           out.println("RIGHT");
        }
        out.close();
    }
}
