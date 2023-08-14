
import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
      
        int[] numbers = { 10, 20, 40, 50, 30 };
        int[] number1 = {10,90,30,40,1};
        System.out.println("Arrays before sorting");
        for (int i=0;i<5;i++)
        {
        	System.out.print(numbers[i]+",");
        }
        Arrays.sort(numbers);
        System.out.println("Arrays after sorting");

        for (int i=0;i<5;i++)
        {
        	System.out.print(numbers[i]+",");
        }
        System.out.println();
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("The index of 30 is " + index);
        
        int res = Arrays.compare(numbers, number1);
        System.out.println(res==0?"two arrys are equal":res>0?"array 1 is greater than array 2":"array 1 is lesser than array 2");
        
    }
}