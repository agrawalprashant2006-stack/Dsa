public class Maximum_Subarray_Sum {
    public static void main(String args[]){
        int[] arr = {1, 2, 4, 8, 9, 11, 7};
        System.err.println(Maximum_Subarray_Sum(arr));

    }

    public static int Maximum_Subarray_Sum(int []arr){
    int ans = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
        int sum = 0;
        for(int j = i; j<arr.length; j++){
            sum+=arr[j];
            ans = Math.max(ans,sum);
        }
    }   
    return ans;
    }
    
}
