package january18;

public class reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234, rev = 0, digit;
		while(num != 0)
		{
			digit =num % 10;
			rev=rev*10 + digit;
			num /=10;
			
			
		}
		
		 
		System.out.println(rev +"reverse no");
	}

}
