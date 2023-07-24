import java.util.Scanner;

public class Main {


public static void checkGrade(int grade)

{ // your code here
	System.out.println(grade>50?"pass":"fail");

}

public static void main(String[] args)

{
	Scanner sc = new Scanner(System.in);
	int grade = sc.nextInt();
	checkGrade(grade);
	sc.close();
}

}