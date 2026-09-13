import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(IsArmstrong(n));
    }
    public static int CountOfDigit(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
    public static boolean IsArmstrong(int n){
         int orginal = n;
      int c = CountOfDigit(n);
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=Math.pow(rem,c);
            n/=10;
        }
        if(sum == orginal){
            return true;
        }else{
            return false;
        }
    }
}
