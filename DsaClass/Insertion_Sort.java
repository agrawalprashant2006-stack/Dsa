public class Insertion_Sort {
    public static void main(String args[]){
        int arr[] = {1, 2, 7, 8, 9, 11, 4};
         Insertion_Sort(arr);
         for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
    }
    public static void Insertion_Sort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            InsertionLastElement(arr, i);
        }
    }
    public static void InsertionLastElement(int arr[], int i){
        int j = i-1;
        int item = arr[i];
        while(j >=0 && arr[j]>item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
        //correct position is j+1
    }
}
