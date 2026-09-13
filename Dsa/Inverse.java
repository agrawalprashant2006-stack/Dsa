import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println(inverse(n));
    }
    public static int inverse(int n) {
        int sum = 0;
        int place = 1;
        while(n>0){
            int rem = n%10;
            sum +=place*(int)Math.pow(10,rem-1);
            place++;
            n/=10;
        }
        return sum;
    }
}
