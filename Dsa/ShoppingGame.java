import java.util.*;
public class ShoppingGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     Winner(m,n);
    }
    public static void Winner(int m, int n){
        int phone = 1;
        int a=0;
        int h = 0;
        while(true){
            a+=phone;
            if(a>m){
                System.out.println("Harshit");
                return;
            }
            phone++;
            h+=phone;
            if(h>n){
                System.out.println("Ayush");
                return;
            }
            phone++;
        }
    }
}
