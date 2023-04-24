import java.util.Scanner;

public class Fact {

    static int fact(int a){
        if(a>0){
            return a * fact(a-1);
        }
        return 1;       
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        System.out.println(fact(num));
    }
}
