
public class MutableStringsExample {
public static void main(String[] args) {
	StringBuffer stringBuffer = new StringBuffer("ram");
	System.out.println(stringBuffer);
	stringBuffer.append("sita");
	System.out.println(stringBuffer);
	
	StringBuilder stringBuilder = new StringBuilder("ravan");
	System.out.println(stringBuilder);
	stringBuilder.append("asura");
	System.out.println(stringBuilder);
	
}
}
