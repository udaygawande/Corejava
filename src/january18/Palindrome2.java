package january18;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj =new Scanner(System.in);
Scanner objString=new Scanner(System.in);
System.out.println("Enter the no");
int num=obj.nextInt();
checknumberpalindrome(num);
System.out.println("Do you want to continue (Yes/NO)");
String userChoice=objString.nextLine();
while(userChoice.equals("yes"))

	{
	System.out.println("Enter the Number");
	num=obj.nextInt();
	checknumberpalindrome(num);
	System.out.println("DO you want to continue (YEs/No)");
	userChoice=objString.nextLine();
	
	
	}
	}
	static void checknumberpalindrome(int num) {
	
		
			int number=num;
			int temp=number;
			int rev=0;
			int  rem;
			while(temp>0)
			{
				
				rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
			}
		
		if(rev==number){
		
		System.out.println("No is  Palindrome:"+number);	
		
		}
	
	else
		{
		System.out.println("No is not palindrome:");	
		
		}

	}
	

	//private static void checkNumberpaLindrome(int num) {
		// TODO Auto-generated method stub//
		
	

	//private static void checknumberpaLindrome(int num) {
		// TODO Auto-generated method stub
		
	}

	//	
		
		

		
	
	


