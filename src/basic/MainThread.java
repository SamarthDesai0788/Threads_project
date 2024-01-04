package basic;
class MainThread1 extends Thread 
{
	public void run()
	{
	System.out.println("Thread is running");
	}
}
class MainThread2 implements Runnable
{
	@Override
	public void run() {
	System.out.println("Thread1 is running");
	}
}
public class MainThread{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MainThread1 t1=new MainThread1();
		t1.start();
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		MainThread2 t2=new MainThread2();
		Thread th=new Thread(t2);
		th.start();
		System.out.println(th.getClass());
	
		System.out.println(th.getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(th.getName());
	    System.out.println(t1.getId());
	}
}



