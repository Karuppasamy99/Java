import java.util.Arrays;

public class Large {
    public static void main(String[] args) {
        char[] c = new char[]{'z','a','g','b','s','k'};
        for (char x : c){
            System.out.println(x);
        }
        Arrays.sort(c);
        System.out.println("sorted");
        for(char y : c){
            
            System.out.println(y);
        }

    }
}
