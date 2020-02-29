package january18;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5,j=0;
		for(int no=1;no<=i; ++no,j=0)
		{
			
			for(int s=1;s<=i-no; ++s)    {
			
					
		
					System.out.print(" ");	
				
			}
		
			while(j != 2*no-1)
			{   
			
			System.out.print("*");
			j++;
			
			}
				System.out.println();		
		
		}
		
	}

}
