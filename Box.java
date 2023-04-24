public class Box {

    int length;
    int breadth;
    int height;
    Box(){
        this.length = 1;
        this.breadth= 1;
        this.height = 1;
    }

    boolean isEqual(Box a){
        if(length==a.length && breadth==a.breadth && height==a.height){
            return true;
        }
        return false;
    }

    Box doubled(){
        Box a = new Box();
        a.length = this.length *2;
        a.breadth = this.breadth*2;
        a.height = this.height*2;
        return a;
    }

    int volume(){
        return length* breadth* height;
    }
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = b1.doubled();
        System.out.println("double"+ b3.length);
        System.out.println(b1.volume());
        System.out.println(b1.height);
        System.out.println(b1.isEqual(b2));
    }
}
