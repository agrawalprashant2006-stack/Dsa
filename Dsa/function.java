import java.util.Scanner;

public class function {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("hello");
  addition();
  System.out.println("Bye");
 }   
 public static void addition(){
    int a=7;
    int b = 9;
    int c = a+b;
    sub();
    System.out.println(c);
 }
 public static void sub(){
    int a=7;
    int b = 9;
    int c = a-b;
    System.out.println(c);
 }
}
