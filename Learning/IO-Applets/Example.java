import java.io.*;

class Example {
	public static void main(String args[])
	{
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in)
				);

		System.out.print("Enter your name: ");
		String name = new String();
		try {
			name = buf.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("So, your name is " + name);
	}
}
