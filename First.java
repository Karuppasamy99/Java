import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        while(number>=0){
            if(number<=9){
                System.out.println(number);
                break;
            }
            if(number%10==0){
                System.out.println(number);
                break;
            }
            number--;
        }
        
    }
}
