import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-class-vs-instance">Day 4: Class vs. Instance</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge >= 0 )  {
            this.age = initialAge;
        }
        else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(this.age > 17) {
            System.out.println("You are old.");
        }
        else if(this.age > 12){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are young.");
        }
	}

	public void yearPasses() {
  		this.age++ ;
	}
	
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int T = sc.nextInt();
      		for (int i = 0; i < T; i++) {
        		int age = sc.nextInt();
          		Person p = new Person(age);
          		p.amIOld();
          		for (int j = 0; j < 3; j++) {
            		p.yearPasses();
          		}
          		p.amIOld();
                System.out.println();
        }
    }
}
