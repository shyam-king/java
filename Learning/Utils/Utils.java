import java.io.*;
import java.util.*;

class Utils {
	public static void main(String args[])
	{
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in)
				);

		System.out.print("Enter a string: ");
		String str = "";
		try {
		str = buf.readLine();
		} catch (Exception e)
		{
			System.out.println(e);
		}
		StringTokenizer parsed = new StringTokenizer(str, " -");
		while (parsed.hasMoreElements())
		{
			System.out.println(parsed.nextElement());
		}

		Calendar date = Calendar.getInstance();
		System.out.println("Date: " + date.get(Calendar.DATE) + "/" + (date.get(Calendar.MONTH) + 1) +
				"/" + date.get(Calendar.YEAR)) ;
	}
}
