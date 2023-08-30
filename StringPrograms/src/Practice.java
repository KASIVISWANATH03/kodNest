
public class Practice {
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		
		String s3 = "Rama"+"Sita";
		String s4 = "Rama"+"Sita";
		String s5 = s1+s2;
		String s6 = s1+s2;
		if(s5==s6)
		{
			System.out.println("ref equal");
		}
		else
		{
			System.out.println("ref not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
