public class SumOfDigits {
    public static void main(String args[]){
        int n =97436;
        int sum = 0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.print(sum);
    }
}
