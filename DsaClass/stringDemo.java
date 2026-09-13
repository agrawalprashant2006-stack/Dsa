import java.util.*;
public class stringDemo {
    public static void main(String args[]){
      String s1 = "WASIF";
    //     String s1 = "Welcome to GLA University";
    //     System.out.println(s.substring(1,5));
    //    String[] arr= s1.split(" ");
    //    for(int i =0 ; i<arr.length; i++){
    //     System.out.println(arr[i]);
    //    }
        // String s = "    Welcome to    GLA University   ";
        // System.out.println(s.trim());

        String s = "wasif";
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.contains("Wasif"));
        System.out.println(s.isEmpty());
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
    }
}
