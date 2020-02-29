package january18;

public class NODivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("\nDivisible By 3 :");
for(int i=1; i<=100;i++)
{
if(i%3==0)
{
	System.out.print(i+",");
	}
}	
System.out.print("\nDivisible By 5 :");
for(int i=1;i<=100;i++)
{
	if(i%5==0)
	{
		
		System.out.print(i+",");
		
	}
	}
System.out.print("\nDivisible By 3 & 5 and Both:");
for(int i=0;i<=100;i++)
{
if(i%3==0 && i%5==0)
{

	
		
		System.out.print( i+"," );

	
	}
}
}
}


