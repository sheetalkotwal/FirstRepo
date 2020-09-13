import java.util.Scanner;

public class reversepalindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*String s="madam";
		String t="";
		System.out.println(s.length());
		for(int i=s.length()-1; i>=0; i--)
		{
			t=t+s.charAt(i);
	
			
		}
		System.out.println(t);
		
       if(s.equals(t))
       {
	System.out.println("this is polidrome");
       }
	

       else
       {
    	   System.out.println("not");
       }*/
       
     /*  for(int i=0;i<10;i=i+2)
       {
    	   System.out.println(i);
       }*/
       
       //String p="sheetal";
       Scanner str=new Scanner(System.in);
       System.out.println("enter string");
       String p= str.nextLine();
       
       String h="";
       
       for(int i=p.length()-1;i>=0;i--)
       {
    	   h=h+p.charAt(i);
       }
    	   
    	   System.out.println(h);
       
       }

}
