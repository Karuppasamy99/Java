import java.util.Scanner;

public class Fibbo {

    static int fibbo(int a){
        if(a==0){
            return 0;
        }
        if(a==1 || a==2){
            return 1;
        }
        return fibbo(a-2) + fibbo(a-1);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        for(int i =0 ; i<=num; i++){
            System.out.println(fibbo(i));
        }
    }
}
