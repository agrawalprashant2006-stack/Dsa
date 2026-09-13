public class Bubble_Sort {
     public static void main(String args[]){
        int[] arr = {4, 5, 3, 2, 1};
        int n = arr.length;
        Sort(arr,n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
     }
    
      public static void Sort(int []arr,int n){
        for(int turn = 1; turn<n; turn++){
            for(int i = 0; i<n-turn; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
      }
}
