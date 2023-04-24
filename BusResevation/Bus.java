package BusResevation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNo, boolean ac, int capacity){
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getBusNo() {
        return busNo;
    }
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
    public boolean getAc(){
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void displayBusInfo(){
        System.out.println("Bus No:"+ busNo);
        System.out.println("Ac:"+ ac);
        System.out.println("Total Capacity:"+ capacity);
    }
}
