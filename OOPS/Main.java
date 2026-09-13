public class Main {
    public static void main(String args[]){

        inter_2 i = () -> System.out.println("Wasif");
        i.name();
         Main m = new Main();
        //  Function<Integer, Integer> f = (n) -> m.square(2);

        //  System.out.println(f.apply());
    }

    public int square(int n){
        return n*n;
    }
}
