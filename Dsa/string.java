import java.util.*;
public class string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //string-class-Non_Primitive-heap memory
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
         System.out.println(s1 == s3);//Adress compare karta hai 
         System.out.println(s1 == s2);//Adress compare karta hai
         System.out.println(s1.equals(s3));//Content compare karta hai
         System.out.println(s1.length());
         int arr[] = new int[5];
         System.out.println(arr.length);

    }
}
