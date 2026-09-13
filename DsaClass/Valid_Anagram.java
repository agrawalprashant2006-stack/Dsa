import java.util.*;
public class Valid_Anagram {
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
System.out.println(Anagram(s,t));
    }
//     public static boolean Anagram(String s, String t){
//         if(s.length()!=t.length()){
//             return false;
//         }
//         char a[] = s.toCharArray();
//         char b[] = t.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         for(int i = 0; i<a.length; i++){
//             if(a[i]!=b[i]){
//                 return false;

//             }
//         }
// return true;
//     }

   public static boolean Anagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            a[idx]++;
        }
        for(int i = 0; i<t.length(); i++){
            int idx = s.charAt(i)-'a';
            b[idx]++;
        }
        for(int i = 0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;

            }
        }
return true;
    }
}
