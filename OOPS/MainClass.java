import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass {
  public static void main(String[] args) {
    // Interf  i= () -> System.out.println("Prashant");//Lamda Expression
    // i.name();

    // Interf i = (n) -> System.out.println(n*n);
    // i.square(10);

    // Interf i = (a,b) -> System.out.println(a+b);
    // i.add(2, 9);
    //  Interf i = (n) -> System.out.println(n%2==0);
    // i.evenOdd(5);

    // Predicate<Integer> p = (n) ->  n%2==0;
    // System.out.println(p.test(5));
    
    // Predicate<String> s = (p) -> p.length()>5;
    // System.out.println(s.test("Harsh"));
    Function<String, Integer> f = (s)-> s.length();
  System.out.println(f.apply("Harshita"));
  }  

  
  
}
