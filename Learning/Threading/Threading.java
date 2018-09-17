class Queue{
	int n;
	boolean avail;

	public Queue()
	{
		avail = false;
	}

	synchronized public int get()
	{
		if (!avail)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		
		notify();
		avail = false;
		return n;
	}

	synchronized public void put(int n)
	{
		if (avail)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		this.n = n;
		notify();
		avail = true;
	}
}

class P implements Runnable{
	Queue q;
	Thread t;
	public P(Queue q)
	{
		this.q = q;
		t = new Thread(this, "Producer");
		t.start();
	}

	public void run()
	{
		for (int i = 0; i < 100; i++)
			q.put(i);
	}
}


class C implements Runnable{

	Queue q;
	Thread t;

	public C(Queue q) {
		this.q = q;
		t = new Thread(this, "Consumer");
		t.start();
	}

	public void run()
	{
		for (int i = 0; i < 100; i++) {
			System.out.println(q.get());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


class Threading{
	public static void main(String args[])
	{
		Queue q = new Queue();
		P p = new P(q);
		C c = new C(q);

		try {
			p.t.join();
			c.t.join();
		} catch (Exception e) {
			System.out.println(e);
		}


		System.out.println("Program ends here");

	}
}
