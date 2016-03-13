import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="https://www.hackerrank.com/challenges/tutorial-intro">Intro to Tutorial Challenges</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class IntroToTutorialChallenges {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String V = in.readLine();
        int n = Integer.parseInt(in.readLine());
        String[] A = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if(A[i].equals(V)) {
                out.println(i);
                break;
            }
        }
        out.close();
    }
}
