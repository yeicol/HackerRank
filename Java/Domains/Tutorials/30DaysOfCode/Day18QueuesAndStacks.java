
import java.io.*;
import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-queues-stacks">Day 18: Queues and Stacks</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day18QueuesAndStacks {

    Stack<Character> stack;
    Queue<Character> queue;

    Day18QueuesAndStacks(){
        this.stack = new Stack<Character>();
        this.queue = new LinkedList<Character>();
    }

    void pushCharacter(char c){
        this.stack.push(c);
    }

    void enqueueCharacter(char c){
        this.queue.add(c);
    }

    char popCharacter(){
        return this.stack.pop();
    }

    char dequeueCharacter(){
        return this.queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesAndStacks p = new Day18QueuesAndStacks();

            // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

}
