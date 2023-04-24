public class Varargs {

    static int minVal(int... args){
        int min = Integer.MIN_VALUE;
        for(int x: args){
            if(x>min){
                min = x;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int min = minVal(9,43,1);
        System.out.println(min);
}
}