public class function2 {
    static int val = 10;
    public static void main(String[] args) {
        System.out.println(val);
        System.out.println("hello");
        int a= 8;
        int b = 7;
        System.out.println(addition(b,a));
        System.out.println(val);
        System.out.println("Bye");
    }
    public static int addition(int a , int b) {
        int c= a+b;
        int val = 90;
        function2.val= val-5;
        return c + sub(c,a);
    }
    public static int sub(int a, int b){
    int c = a+b;
    return c;
 }
}
