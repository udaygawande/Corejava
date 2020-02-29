package Feb2;

import java.util.Scanner;

public class Devidebyzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stu//
		Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number");
	int x=obj.nextInt();
	int z=0;
	String a="";
	System.out.println("Enter the number");
	int y=obj.nextInt();
	try
	{		System.out.println(a.charAt(1));
	z=x/y;
	}
	
	catch (Exception e)
	{
		
		e.printStackTrace();
		System.out.println("Exception Occured:"+e.getMessage());
		z=5;
	}
	System.out.println("value od Z:"+z);
	for(int i=1;i<=z;i++)
	{
		System.out.println(i);
	}
		}
}

