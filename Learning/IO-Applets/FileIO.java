import java.io.*;

class FileIO {
	public static void main(String args[])
	{
		FileInputStream fin;
		int c;

		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists");
			return;
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Usage: ");
			System.out.println("FileIO <filename>");
			return;
		}

		try {
			do
			{
				c = fin.read();
				if (c != -1)
					System.out.print((char) c);
			} while (c != -1);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
