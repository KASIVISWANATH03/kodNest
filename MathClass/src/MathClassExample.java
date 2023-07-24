
import java.lang.Math;

public class MathClassExample {

    public static void main(String[] args) {
 
        double sqrt = Math.sqrt(16);
        System.out.println("The square root of 16 is " + sqrt);
        int min = Math.min(5,2);
        System.out.println("The min of 5,2 is " + min);
        int max = Math.max(5,2);
        System.out.println("The max of 5,2 is " + max);
        double pi = Math.PI;
        System.out.print("The pi constant is ");
        System.out.printf("%.2f",pi);
        System.out.println();
        int randomNumber = (int) (Math.random()*100);
        System.out.println("A random number is " +randomNumber);
    }
}