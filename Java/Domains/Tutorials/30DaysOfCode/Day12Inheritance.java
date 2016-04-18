import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-inheritance">Day 12: Inheritance</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day12Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }
    
    public char calculate(){
        int sum = java.util.stream.IntStream.of(this.testScores).sum();
        double average = (sum / this.testScores.length);
        if(average > 89) {
            return 'O';
        }
        if(average > 79) {
            return 'E';
        }
        if(average > 69) {
            return 'A';
        }
        if(average > 54) {
            return 'P';
        }
        if(average > 39) {
            return 'D';
        }
        return 'T';
    }
    
}
