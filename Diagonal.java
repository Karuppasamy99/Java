public class Diagonal {
    public static void main(String[] args) {
        int a[][] = {
            {1,2,7},
            {1,7,3},
            {7,2,3}
        };
        int sum=0;int sum2 =0;
        int i=0;int j=0;
        int n= a.length;
        while(n>i){
            sum += a[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(n>i){
            if(i != j){
                sum2 += a[i][j];
               
            }
            i++;
            j--;
            
        }
           
        System.out.println(sum);
        System.out.println(sum2);
    }
}
