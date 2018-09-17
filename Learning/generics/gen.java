interface something {
 	public void doNothing();
}

class abc implements something {
	public void doNothing()
	{

	}
}

class gen {
	public static void main(String args[])
	{
		abc A = new abc();
		System.out.println(A instanceof something);
	}
}
