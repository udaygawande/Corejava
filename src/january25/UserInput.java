package january25;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);



	System.out.println("Enter the name");
	String name= obj.nextLine();
	
	
	System.out.println("Enter the city");
	String city= obj.nextLine();
	
	System.out.println("Enter the pincode");
	int pincode= obj.nextInt();
	
	{
	System.out.println(" "+name+" "+city+" "+pincode);
	
	}
	
	
	}

}
