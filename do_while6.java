import java.util.Scanner;
class do_while6
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int sum=0;
	for(int i=1;i<=5;i++)
	{
		int n=sc.nextInt();
		if(n<0)
			continue;
		sum=sum+n;
	}
	System.out.println("sum is "+sum);
	}
}