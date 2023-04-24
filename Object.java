public class Object {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        String s5 = s4;

        System.out.println(s4 == s5);
    }
}
