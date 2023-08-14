import java.util.Scanner;

public class Main

{

public static void checkMultipleOfTen(int n,int s)

{

// your code here
	System.out.println(n%s==0?"The number"+n+" is a multiple of "+s:"The number"+n+" is not a multiple of "+s);

}

public static void main(String[] args)

{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int s = sc.nextInt();
	checkMultipleOfTen(n,s);
}

}
