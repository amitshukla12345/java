import java.util.Scanner;
class do_while2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char decision;
		do
		{
			System.out.println("Enter number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition is "+(a+b));
			
			System.out.println("Do you want to continue?(y/n)");
			decision=sc.next().charAt(0);
		}while(decision=='y');
	}
}