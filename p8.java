import java.util.*;
class p8
{
	public static void main(String args[])
	{
		if(false)
		{
			System.out.println("If block");
		}
		else
		{
			System.out.println("else block");
		}
		
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(n%2==0)
			{
				System.out.println(n+"is even");
			}
			else
			{
				System.out.println(n+" is odd");
			}
		
		if(n%7==0)
		{
			System.out.println(n+"is multiple of 7");
		}
		else
		{
			System.out.println(n+"is not multiple of 7");
		}
	}
}