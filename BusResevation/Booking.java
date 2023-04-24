package BusResevation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    private String passName;
    private int busNo;
    private Date date;

    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Passenger name");
        passName =scanner.next();
        System.out.println("Enter Bus no");
        busNo = scanner.nextInt();
        System.out.println("Enter Date in dd-mm-yyyy");
        String dateString = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
           int capacity =0;
           for (Bus b : buses) {
            if(b.getBusNo() == this.busNo){
                capacity = b.getCapacity();
            }
           }

           int booked = 0;
           for (Booking booking : bookings) {
            if(booking.busNo == this.busNo && booking.date.equals(this.date)){
                booked++;
            }
           }
           return booked<capacity;
            
    }
}

