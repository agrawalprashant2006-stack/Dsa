public class DecToBin {
    public static void main(String args[]){
        int n = 4;
        int sum = 0;
        int mul =1;
        while(n>0){
            int rem = n%2;
            sum=sum+rem*mul;
            mul*=10;
            n/=2;
        }
        System.out.print(sum);
    }
    
}
