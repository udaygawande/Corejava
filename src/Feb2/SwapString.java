package Feb2;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a="Hello";
	String b="World";
	System.out.println("String A="+a+" String B="+b);
	a=a+b;
	b=a.substring(0,a.length()-b.length());

	a=a.substring(b.length());
System.out.println("String after Swapping:A="+a+" and B "+b);
	}

}
