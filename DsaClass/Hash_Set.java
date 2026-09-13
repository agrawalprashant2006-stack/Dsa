import java.util.*;
public class Hash_Set {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(4);
        al.add(6);
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i<al.size(); i++){
           hs.add(al.get(i));
        }
        //System.out.println(hs);

        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(10);
        hs1.add(13);
        hs1.add(15);
        hs1.add(20);
        hs1.add(32);
        hs1.add(34);
        hs1.add(49);
        System.out.println(hs1);
    }
    
}
