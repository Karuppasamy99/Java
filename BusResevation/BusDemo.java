package BusResevation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1234, false, 2));
        buses.add(new Bus(4321, true, 33));
        buses.add(new Bus(1236, true, 42));
        for (Bus b : buses) {
            b.displayBusInfo();
            System.out.println("-------------------");
        }
        int userOption=1;
        Scanner scanner = new Scanner(System.in);
        while(userOption ==1){
            System.out.println("Enter 1 to booking and 0 to exit");
            userOption = scanner.nextInt();
            if(userOption ==1){
                Booking booking = new Booking();
                if(booking.isAvailable(buses,bookings)){
                    bookings.add(booking);
                    System.out.println("Your ticket is confirmed");
                }
                else
                    System.out.println("Bus is full, Try another bus or other date");
            }
            else
                System.out.println("Thanks for using our service");
        }
    }
}
