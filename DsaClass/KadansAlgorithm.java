public class KadansAlgorithm {
   public static void main(String args[]){
    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      System.out.print(max(arr));
  } 
  public static int max(int arr[]){
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
