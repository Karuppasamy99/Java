import java.util.Scanner;

public class TwoDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter nuber");
        int number = scanner.nextInt();
        int check = Integer.toString(number).trim().length();
        System.out.println(check);
    }
}
