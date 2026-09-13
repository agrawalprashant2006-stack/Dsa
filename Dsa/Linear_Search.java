public class Linear_Search {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int item = 4;
      System.out.println( linear_Search(arr, item));
    }
    public static int linear_Search(int arr[], int item){
          for(int i =0; i<arr.length; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return-1;
    }
    
}
