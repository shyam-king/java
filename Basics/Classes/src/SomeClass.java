class Vector {

	public double x, y;
	
	
	Vector()
	{
		x = 0;
		y = 0;
	}
	
	Vector(double a, double b)
	{
		x = a;
		y = b;
	}
	
	double magnitude()
	{
		return (Math.sqrt(x*x + y*y));
	}
	
}


public class SomeClass {
	public static  void main(String args[])
	{
		Vector a = new Vector(3,4);
		System.out.print(a.magnitude());
		
	}
	
	public static int function(int a)
	{
		return a;
	}
}
