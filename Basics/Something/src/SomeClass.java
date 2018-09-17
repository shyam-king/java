import java.util.*;

public class SomeClass {
	public static void main(String[] args)
	{
		String userName;
		System.out.print("Enter your name: ");
		Scanner input =  new Scanner(System.in);
		
		userName = input.nextLine();
		
		System.out.println("Welcome " + userName);
		
		input.close();
	}
}
