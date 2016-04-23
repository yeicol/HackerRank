import java.lang.reflect.Method;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-generics">Day 21: Generics</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
class Day21Generics {

    static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
