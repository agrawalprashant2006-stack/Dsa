import java.util.Scanner;

public class DataType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = (byte)428;//-2^-7 to 2^7-1
        short s = 5;//-2^-15 to 2^15-1
        int x = 6;//-2^-31 to 2^31-1 or 10^9
        long l = 9565_567_67;//956556767//-2^-63 to s^63-1 or 10^18
System.out.println(b);
System.out.println(s);
System.out.println(x);
System.out.println(l);
b = sc.nextByte();
s = sc.nextShort();
x = sc.nextInt();
l = sc.nextLong();
System.out.println(b);
System.out.println(s);
System.out.println(x);
System.out.println(l);
    }
}