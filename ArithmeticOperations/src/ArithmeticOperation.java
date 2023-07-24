
public class ArithmeticOperation {
	public static void main(String[] args) {
	int subResult= subtractNumbers(20, 5);
	
	int mulResult = multiplyNumbers(4, 5);

	double divResult = divideNumbers(20, 4);

	int remResult = findRemainder(10, 3);
	System.out.println(subResult);
	System.out.println(mulResult);
	System.out.printf("%.2f\n",divResult);
	System.out.println(remResult);
	}

	public static int findRemainder(int i, int j) {
		
		return i%j;
	}

	public static double divideNumbers(int i, int j) {
		
		return i/j;
	}

	public static int multiplyNumbers(int i, int j) {
		
		return i*j;
	}

	public static int subtractNumbers(int i, int j) {
		return i-j;
	}
	
}
