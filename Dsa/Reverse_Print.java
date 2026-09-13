public class Reverse_Print {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
    // for(int i = arr.length-1; i>=0; i--){
    //     System.out.print(arr[i] + " ");
    // }
    Reverse_Array(arr);
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void Reverse_Array(int arr[]){
     int i = 0;
     int j = arr.length-1;
     while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
     }
    }
}
