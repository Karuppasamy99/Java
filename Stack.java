public class Stack {
    int[] a = new int[5];
    int tos = -1;

    void push(int num){
        if(tos == 9){
            System.out.println("Stack Overflow");
        }else{
            a[++tos] = num;
        }
    }

    int pop(){
        if(tos < 0)
            System.out.println("stack is empty");
        return a[tos--];
        
        
            
        
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(3);
        s1.push(6);
        s1.push(7);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        for(int i =0; i<s1.a.length; i++){
            System.out.println(s1.a[i]);
        }
        
    }
}
