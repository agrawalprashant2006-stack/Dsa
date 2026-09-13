public class ProductOfArrayExceptItself {
    
    public static void main(String []args){
        int arr[] = {2,3,4,5};
        int a[] = ProductOfArray(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] ProductOfArray(int[] arr){
        int n =arr.length;
     //prefix Array Excluding index
       int []left = new int[n];
       left[0] = 1;
       for(int i = 0; i<arr.length; i++){
        left[i] = left[i-1]*arr[i-1];
       }

       //suffix Array Excluding Index
       int right[] = new int[n];
       right[n-1] = 1;
       for(int i = n-2; i>=0; i--){
        right[i] = right[i+1]*arr[i+1];
       }

       //calculation
       for(int i =0 ; i<n; i++){
        left[i] = left[i]*right[i];
       }
       return left;
    }
}
