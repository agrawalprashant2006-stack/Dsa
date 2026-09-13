public class InsertionSort {
     public static void main(String args[]){
        int[] arr = {1, 2, 4, 8, 9, 11, 7};
        int n = arr.length;
        // Sort(arr,n);
        Insert_Last_Element(arr, n-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }


    // public static void Sort(int []arr,int n){
        
    //     }

    public static int Insert_Last_Element(int []arr,int i){
            int item = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > item){
                arr[j+1] = arr[j];
                arr[j] = item;
                j--;
            }
            return j+1;
    }
    
}  

