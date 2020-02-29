package PracticeKIIT;

import java.util.Scanner;

public class CalculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int units=sc.nextInt();
		
		int unit;
		double bill=0;
		if(units<100)
		{
			bill=units*1.20;
			
		}
		else if(units<300)
		{
bill=100*1.20+(units-100)*2;

		}
		else if(units>300)
		{
		bill=100*1.20+200*2+(units-300)*3;	
		}
	System.out.println("bill to pay:"+bill);	
	}
}
