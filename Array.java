public class Array {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,0,6,7,8,9};
        int sum =0 ;
        
        int sum2 =0;
        for(int i =0; i<=a.length; i++){
           sum2 += i;
        }
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        //System.out.println(sum);
        System.out.println("the missing number is "+(sum2 - sum));
    }
}
