
public class StringPractice {
public static void main(String[] args) {
	String s1 = "HELLO";
	String s3 = new String("hello");
	if(s1==s3)
	{
		System.out.println("ref equal");
	}
	else
	{
		System.out.println("ref not equal");
	}
	if(s1.equals(s3))
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
}
}
