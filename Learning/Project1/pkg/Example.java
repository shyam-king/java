package pkg;

class Sample implements Runnable{

	int a;

	Sample(int x)
	{
		a = x;
	}

	public void run()
	{
		try{
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Child: " + a);
				Thread.sleep(500);
			}
		} catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class Example{
	public static void main(String args[])
	{
		Thread t = new Thread(new Sample(1), "Child thread");
		Thread n = new Thread(new Sample(2), "Child thread");
		t.start();
		n.start();
		try {
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Main: " + i);
				Thread.sleep(200);
			}
			t.join();
			n.join();
		} catch (InterruptedException e)
		{
			System.out.println(e);
		}

		System.out.println("Main ends here");

	}
}


/*
 * THREADINIG:
 * wait()
 * notify()
 * notifyAll()
 */
