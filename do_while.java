import java.util.Scanner;
class do_while 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Hello");
			n=sc.nextInt();
		}while(n==1);
	}
}