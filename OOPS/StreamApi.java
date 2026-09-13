import java.util.*;
public class StreamApi {
    public static void main(String args[]){
         List<Integer> l = Arrays.asList(1,5,9,0,1,4,7,1,4,9);
        // l.stream().forEach((n) -> System.out.println(n));
        //  l.stream().forEach( System.out::println);

        //  l.stream().filter(n -> n%2 == 0).forEach(System.out::println);

        //   l.stream().filter(n -> n>5).forEach(System.out::println);

        List<String> l1 = Arrays.asList("Wasif", "Asif", "Laksh", "Harshita", "Sunil");

        // l1.stream().filter(s -> s.length() == 5).forEach(System.out::println);

        List<String> l2 = l1.stream().filter(s-> s.length() == 5).toList();

        // l1.stream().filter(s-> s.length()==5).map(p->p.toUpperCase()).forEach(System.out::println);

        // l.stream().map(n->n+5).filter(p->p%2!=0).forEach(System.out::println);

        // l.stream().map(n->n+5).filter(p->p%2==0).distinct().forEach(System.out::println);

        //  l.stream().filter(n->n>5).distinct().sorted().forEach(System.out::println);


            // l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    // long count = l.stream().filter(n->n%2==0).count();
    // System.out.println(count);
    
    // l.stream().filter(n-> n%2==0).limit(4).forEach(System.out::println);

    // l.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

    // l.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

     l.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
    }
}
