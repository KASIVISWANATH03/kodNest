
public class Calculator {
void calculator(int n1,int n2,char op)
{
	System.out.print("the result is ");
	switch(op)
	{
	case '+':System.out.println(n1+n2);
		break;
	case '-':System.out.println(n1-n2);
		break;
	case '*':System.out.println(n1*n2);
		break;
	case '/':System.out.println(n1/n2);
		break;
	case '%':System.out.println(n1%n2);
		break;
	default:System.out.println("invalid operator");
	}
}
}
