import java.util.*;

public class SomeClass {
	public static void main(String[] args)
	{
		StringBuilder someSB = new StringBuilder("Shyam");
		someSB.ensureCapacity(80);
		System.out.println(someSB.capacity());
		StringBuilder someSB2 = new StringBuilder(someSB + " is great  ");
		String something = someSB2.toString();
		something.trim();
		System.out.println(something);
		char[] seperated = something.toCharArray();
		String[] sep = something.split(" ");
		
		for (char a : seperated)
		{
			System.out.println(a);
		}
		
		for (String i : sep)
		{
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(sep));
		
	}
}
