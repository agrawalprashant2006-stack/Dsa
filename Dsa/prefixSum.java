public class prefixSum {

public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
   

    }

    
    public static void prefixSum(int arr[]) {
       int n = arr.length;

       //prefix Array Excluding index
       int []left = new int[n];
       left[0] = 0;
       for(int i = 0; i<arr.length; i++){
        left[i] = left[i-1]+arr[i-1];
       }

       //suffix Array Excluding Index
       int right[] = new int[n];
       right[n-1] = 0;
       for(int i = n-2; i>=0; i--){
        right[i] = right[i+1]+arr[i+1];
       }
    }
}
