package if_else;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();	
		    
		    if(a>=b && a>=c)
		    {
		    	System.out.println(a);
		    }
		    else
		    {
				if(b>=c && b>=a)
				{
					System.out.println(b);
				}
				System.out.println(c);
			}
		    }

}
