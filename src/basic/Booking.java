package basic;
import java.util.Scanner;
class Thread1 implements Runnable {
	 static boolean isSeatAvailable = true;
	static boolean isSeatNotAvailable=true;
	
    public void run() {
        if (isSeatAvailable==isSeatNotAvailable) {
        	
        
            System.out.println("Seat is availble.");
        }
        else {
            System.out.println("Seat is not available.");
        }
    }
}
   class Thread2 implements Runnable{
	   static boolean isBookingConfirmed = true;
	   static boolean isBookingNotConfirmed= true;
			   
	   public void run() 
	   {
	   if (isBookingConfirmed==isBookingNotConfirmed) {
           System.out.println("Booking Successfully Seat is reserved");
	   }
	   else {
		   System.out.println("Booking Failed Seat is Not Availble");	
	}	
    }
   }
public class Booking {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
  
    	System.out.println("Is Seat Availble = (true/false):");
         Thread1.isSeatAvailable=scanner.nextBoolean();
         
         System.out.println("Is Booking Confirmed=(true/false):");
         Thread2.isBookingConfirmed=scanner.nextBoolean();
    	 Thread1 t1 = new Thread1();
         Thread2 t2 = new Thread2();

         Thread thread1 = new Thread(t1);
         Thread thread2 = new Thread(t2);

         thread1.start();
        
         thread2.start();
    	
    }
}

