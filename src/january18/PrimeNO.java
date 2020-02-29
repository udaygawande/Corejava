package january18;

public class PrimeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=8;
boolean false1= false;
for(int j=2;j<=i/2;++j)
{
if(i%2==0)	
{
false1=true;
break;
}
}	
if(!false1)
{
	System.out.println(i+"no is prime");
	
}
else
{
System.out.println(i+"no is not prime");	
}
}
	
	
	}


