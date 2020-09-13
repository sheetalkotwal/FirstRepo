
public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
				{
				System.out.print(k);
				
					System.out.print("\t");
					k++;
		}
			
		System.out.println( "");
		}
		/*for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
				{
				System.out.print("*");
				
					System.out.print("\t");
					
		}
			
		System.out.println( "");*/
	
		int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=3-i;j++)
				{
				System.out.print(k);
				
					System.out.print("\t");
					k++;
				}
			System.out.println("");
	}
	}

}
