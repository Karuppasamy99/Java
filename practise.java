import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        
        int squareRoot  = (int)Math.sqrt(number);
        
            int aboveN = (squareRoot+1)* (squareRoot+1);
            int belowN = squareRoot * squareRoot;

            if(squareRoot* squareRoot == number ){
                System.out.println("The square is"+ squareRoot);
                return;
            }
            int diff = aboveN - number;
            int diff2 = number - belowN;
            
            if(diff > diff2){
                System.out.println("nearest square"+ belowN);
            }else{
                System.out.println("nearest square "+ aboveN);
            }

            
        
        

        
        
    }
}