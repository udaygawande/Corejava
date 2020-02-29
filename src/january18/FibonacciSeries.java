package january18;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=2;
int c;
for(int i=0;i<=10;i++)
{
	c=a+b;
System.out.println(" "+c);
a=b;
b=c;
}
	}

}
