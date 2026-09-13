public class MaxArray {
    public static void main(String[] args) {
        int arr[]= {30,9,6,2,8};
        int max = Integer.MIN_VALUE;
      System.out.println( max(arr, max));
    }
    public static int max(int arr[],int max){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
