package basic;

class Thread7 implements Runnable {
    int[] BookingSeatNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int AlreadyBookedSeat = 1;

    public void run() {
        for (int seat : BookingSeatNumber) {
            System.out.println("Checking seat: " + seat);
            if (seat != AlreadyBookedSeat) {
                System.out.println("Seat " + seat + " is Available");
            } else {
                System.out.println("Seat " + seat + " is Not Available");
            }
        }
    }
}

class Thread8 implements Runnable {

    int confirmedSeat = 1;
    int availableSeat = 2;

    public void run() {
        System.out.println("Checking confirmed and available seats.");
        if (availableSeat <= confirmedSeat) {
            System.out.println("Booking Confirmed");
        } else {
            System.out.println("Booking Not Confirmed");
        }
    }
}

public class Booking1 {
    public static void main(String[] args) {
        Thread7 t1 = new Thread7();
        Thread thread1 = new Thread(t1);
        thread1.start();

        Thread8 t2 = new Thread8();
        Thread thread2 = new Thread(t2);
        thread2.start();
    }
}
