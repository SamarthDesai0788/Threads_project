package basic;

class MyThread implements Runnable{
	public void run() {
        System.out.println("Thread " +Thread.currentThread().getName()+ " is running");
    }    
    }

public class MultiThreading1 {
    public static void main(String[] args) {
        MyThread M1 = new MyThread(); 
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(M1); 
            t.start();
        }
    }
}


