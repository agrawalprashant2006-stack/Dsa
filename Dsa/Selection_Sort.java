public class Selection_Sort {
     public static void main(String args[]){
        int[] arr = {4, -1, 5, 3, 2, 1, 7};
        int n = arr.length;
        Sort(arr,n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        //  System.out.print(min_form_ith_index(arr, 2));
    }
    public static void Sort(int []arr,int n){
        for(int i =0; i<n; i++){
          int mini = min_form_ith_index(arr,i);
          int temp = arr[mini];
          arr[mini] = arr[i];
          arr[i] = temp;
        }
    }

    public static int min_form_ith_index(int []arr,int idx){
             int mini = idx;
             for(int i = idx; i<arr.length; i++){
                if(arr[i]<arr[mini]){
                    mini = i; 
                }
             }
             return mini;
    }
    
}
