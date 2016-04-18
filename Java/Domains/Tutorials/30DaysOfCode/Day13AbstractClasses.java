import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-abstract-classes">Day 13: Abstract Classes</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day13AbstractClasses
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}

abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}
class MyBook extends Book{ 

    private int price;
    
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price; 
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
