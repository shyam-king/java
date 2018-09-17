import java.util.*;


public class basicClass {
	
	static void print(String a)
	{
		System.out.println(a);
	}
	
	static void print(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		print("Enter a number: ");
		
		
		a = scan.nextInt();
		
		print("Enter a number: ");
		
		
		b = scan.nextInt();
		
		print (a+b);
		scan.close();
	}
}
