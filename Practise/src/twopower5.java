import java.util.Scanner;

public class twopower5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	
		{
			 Scanner in = new Scanner(System.in);
		     System.out.print("Input a number: ");
		     int n = in.nextInt();
		     int sum = 0, r;
			int temp = n;    
		     while(n>0)//232, 23 2
			   {    
		        r = n % 10;//2  , 3, 2
		        sum = (sum*10)+r;  //0*10  +2,2*10+3, 23*10+2
		        n = n/10;    //23 20, .2
		       }    
		      if(temp==sum)    
		        System.out.println("It is a Palindrome number.");    
		      else    
		        System.out.println("Not a palindrome"); 
	}

}
}
