public class Prefix_Suffix_Excluding_Index {
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 4, 6, 7};
        Prefix_SuFFix(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Prefix_SuFFix(int []arr){
    int n = arr.length;
    //prefix
    // int left[]= new int[n];
    // left[0] = 1;
    // for(int i =1; i<left.length; i++){
    //     left[i] = left[i-1] * arr[i-1];
    // }

    //Suffix
   int right[] = new int[n];
   right[n-1] = 1;
    for(int i = n-2; i>=0; i--){
        right[i] = right[i+1] * arr[i+1];
    }
 }
}
