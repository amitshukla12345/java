import java.util.*;
class p12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("1:Marathi 2:Hindi 3:English");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Marathi language selected");
			
		}
		else if(n==2)
		{
			System.out.println("Hindi language selected");
		}
		else if (n==3)
		{
			System.out.println("English language selected");
		}
		else
		{
			System.out.println("Invalid input");
		}
			
	}
	
}