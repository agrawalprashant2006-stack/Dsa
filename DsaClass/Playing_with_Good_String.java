public class Playing_with_Good_String {
    public static void main(String args[]){
        String s = "cbaeicde";
System.out.println(LongestLength(s));
    }
    public static int LongestLength(String s){
        int ans = 0;
        int c = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Isvowels(ch)){
                c++;
                ans = Math.max(ans,c);
            }else{
                c = 0;
            }
        }
         return ans;
    }

    public static boolean Isvowels(char ch){
        if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
