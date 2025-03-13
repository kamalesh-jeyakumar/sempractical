import java.util.Scanner;
class paracons
{
  	 int a;
   
	 paracons(int a )
	{
 	this.a =a ;
	}
public static void main (String args[])

	{
   	Scanner scan = new Scanner(System.in);
  	 System.out.println("enter a number");
 	int a = scan.nextInt(); 
 	 paracons odd = new paracons(a);

  
 	if( a % 2 ==0 )
	{
 	 System.out.println(" It is a even number");
	}
	else
	{
 	System.out.println(" It is odd  number  number");
	}
	} 
}
 
  
