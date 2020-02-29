


package january25;

import java.util.Scanner;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scan.nextInt();
		if(year%4==0 || (year%400==0 && year%100!=0))
		{
			System.out.println(" IT is Leap YEar: "+year);
			
		}else
		{
			System.out.println(" IT is not Leap YEar: "+year);
		}
	}

}
