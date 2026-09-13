public class TrappingRainWater {
     public static void main(String []args){
        int arr[] = {5, 3, 1, 2, 7, 4, 1, 6};
            System.out.print(Trapping(arr));
    }
    public static int Trapping(int[] arr){
        int n = arr.length;

        //prefix
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i = 1; i<n; i++){
            left[i]  =Math.max(left[i-1], arr[i]);
        }

        //suffix
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }

        //calculation
        int sum = 0;
        for(int i =0; i<n; i++){
            sum+=Math.min(left[i],right[i]-arr[i]);
        }
        return sum;
    }
}
