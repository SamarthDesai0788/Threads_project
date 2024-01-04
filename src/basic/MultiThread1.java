package basic;


class Class1 implements Runnable
{
    void count()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Count "+i);       
        }
    
    }
    @Override
    public void run() {    
        count();
    }
    
}
class Class2 implements Runnable
{
    void add()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Add : "+i+1);
        }
    }
    @Override
    public void run() {   
        add();
    }
    
}
public class MultiThread1 {

    public static void main(String[] args) throws InterruptedException {
        Class1 c1= new Class1();
        Class2 c2= new Class2();
        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t1.join();
        t2.start();
        t1.join();
    }
}