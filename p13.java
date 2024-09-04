import java.util.*;
class p13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two number");
	     int n=sc.nextInt();
		int a=10;
		int b=16;
		if(n==1)
		{
			System.out.println("Addition is"+(a+b));
		}
		else if(n==2)
		{
			System.out.println("Subtraction is"+(a-b));
		}
		else if(n==3)
		{
			System.out.println("Division is"+(a/b));
		}
		else if(n==4)
		{
			System.out.println("multiplication is"+(a*b));
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}