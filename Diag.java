public class Diag {
    public static void main(String[] args) {
        int a[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int i=0, j=0;
        int sum =0;
        
        int n=3;
        while(i<3){
            if(i==j){
                sum += a[i][j];
                i++;
                j++;
            }
        }
        
        i=0;
        j=n-1;
        while(n>i){
            if(i != j){
                sum += a[i][j];
               
            }
            i++;
            j--;
            
        }
        System.out.println(sum);
        
        

    }
}
