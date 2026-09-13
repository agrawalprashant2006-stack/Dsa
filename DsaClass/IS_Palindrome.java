public class IS_Palindrome {
    public static void main(String args[]){
        String s = "naman";
        Print_PalidromeicSubstrings(s);
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void Print_PalidromeicSubstrings(String s) {
        for(int i = 0; i<s.length(); i++){
            for(int j =i+1; j<=s.length(); j++){
              String s1 = s.substring(i,j);
                if(isPalindrome(s1)){
                System.out.println(s1);
                }
            }
        }
    }
}
