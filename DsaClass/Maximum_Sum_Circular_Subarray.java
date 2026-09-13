public class Maximum_Sum_Circular_Subarray {
    public static void main(String args[]){
        int arr[] = {1, -2, 3, -2};
int ans= Circular_Subarray(arr);
System.out.println(ans);
    }
    public static int Circular_Subarray(int nums[]){
        int linear_sum = Kadanes_Algorithm(nums);
        int total_sum = 0;
        for(int i = 0; i<nums.length; i++){
            total_sum+=nums[i];
            nums[i]= nums[i]*(-1);
        }
        int middle_sum = Kadanes_Algorithm(nums);
        int Circular_Sum = total_sum+middle_sum;
        if(linear_sum<0){
            return linear_sum;
        }
    return Math.max(linear_sum, Circular_Sum);
    }
    public static int Kadanes_Algorithm(int arr[]){
         int sum = 0;
    int ans=Integer.MIN_VALUE;
    for(int j = 0; j<arr.length; j++){
        sum+=arr[j];
        ans = Math.max(ans,sum);
        if(sum<0){
            sum=0;
        }
    }
    return ans;
    }
}
