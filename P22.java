import java.util.Scanner;
class P22
{
	public static void main(String args[])
	{
		int n=10;
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
		{
			System.out.print(i+" ");
			count++;
		}
		}
		System.out.println("count:"+count);
		if (count==2)
		{
			System.out.println(n+"is prime");
		}
		else
		{
			System.out.println(n+"is not prime");
		}
	}
}