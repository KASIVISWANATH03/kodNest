import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();

		while(true)
		{
			System.out.println("Hello welcome to kodnest calculator select \n +  --> addition \n -  --> subtraction\n *  --> multiplication\n /  --> division\n %  --> remainder\n ^  --> square\n !  --> stop");
			System.out.println("Enter your choice : ");
			char ch = sc.next().charAt(0);
			if (ch=='+')
			{
				System.out.println("Enter two numbers ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(c.addition(num1, num2));
			}
			else if (ch=='-')
			{
				System.out.println("Enter two numbers ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(c.subtraction(num1, num2));
			}
			else if (ch=='*')
			{
				System.out.println("Enter two numbers ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(c.multiplication(num1, num2));
			}
			else if (ch=='/')
			{
				System.out.println("Enter two numbers ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(c.division(num1, num2));
			}
			else if (ch=='%')
			{
				System.out.println("Enter two numbers ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(c.remainder(num1, num2));
			}
			else if (ch=='^')
			{
				System.out.println("Enter two numbers ");
				int num1 = sc.nextInt();
				System.out.println(c.square(num1));
			}
			else if (ch=='!')
			{
				
				System.out.println("hello bye bye....");
				break;
			}
		}
	}
}
