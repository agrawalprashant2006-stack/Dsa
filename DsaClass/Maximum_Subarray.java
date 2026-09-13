public class Maximum_Subarray {
  public static void main(String args[]){
    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      System.out.print(max(arr));
  } 
  public static int max(int arr[]){
    int ans=Integer.MIN_VALUE;
    for(int j = 0; j<arr.length; j++){
    for(int i =j; i< arr.length; i++){
        sum+=arr[i];
        ans = Math.max(ans,sum)
    }
    return ans;
}
  }   
}
