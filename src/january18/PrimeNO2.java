package january18;

public class PrimeNO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int	count=0;
		for(int i=1;i<=10;i++)
		{
			for(int num=1;num<=i;num++)
			{
				if(i%num==0)
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("No is prime ="+ count);
		}
	
	else {
	System.out.println("No is not prime ="+count);
	}
}
}
