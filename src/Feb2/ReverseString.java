package Feb2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
Scanner obj =new Scanner(System.in);
		System.out.println("Enter the String");
String value=obj.nextLine();
reverseString1(value);
	}
	static void reverseString1(String input)
	{
		String reverse="";
		int lenght =input.length();
for(int i=lenght-1;i>=0;i--)
{
	reverse=reverse+input.charAt(i);
}
	System.out.println("Reverse\n"+input+"\nis\n"+reverse);
	}
	
//private static void reverseString(String value) {
		// TODO Auto-generated method stub
		
	
//private static String charAt(intttt i) {
		//String str="";
		// TODO Auto-generated method stub
		//return str;//
	
{


}
}
