public class Freq_Array {
    public static void main(String[] args) {
        String s = "ttsnascjwejfjwfscnbuiehfwf";
     Maximum_Freq(s);
    }
    public static void Maximum_Freq(String s){
        int freq[] = new int[256];
        for(int i = 0; i<s.length(); i++){
            int ch = s.charAt(i);
            freq[ch]++;//freq[idx]=freq[idx]+1;
        }
        int maxi =0;
        for(int i = 1; i<freq.length; i++){
            if(freq[i]>freq[maxi]){
                maxi=i;
            }
        }
        System.out.println(freq[maxi]);
        System.out.println((char)(maxi));
    }
}
