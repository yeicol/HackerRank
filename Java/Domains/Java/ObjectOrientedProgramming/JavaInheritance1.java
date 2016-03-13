/**
 * See <a href="https://www.hackerrank.com/challenges/java-inheritance-1">Java Inheritance 1</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
 public class Solution
 {
    public static void main(String args[])
    {

      Bird bird = new Bird();
      bird.walk();
      bird.fly();
      bird.sing();

    }
 }


 class Animal{
    void walk()
    {
       System.out.println("I am walking");
    }
 }

 class Bird extends Animal
 {
    void fly()
    {
       System.out.println("I am flying");
    }

    void sing()
    {
       System.out.println("I am singing");
    }
 }
