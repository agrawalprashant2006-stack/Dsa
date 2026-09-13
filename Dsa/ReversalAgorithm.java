public class ReversalAgorithm {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6,7};
        int k =3;
         rotate(arr,k);
         for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
    }
     public static void rotate(int[] arr, int k) {
     int n =arr.length;
    k = k%n;
     //Starting ke n-k Element Reverse krna hai
      Reverse(arr,0,n-k-1);
       //Last ke k Element Reverse krna hai
      Reverse(arr,n-k,n-1);
       //All Element Reverse krna hai
      Reverse(arr,0,n-1);
    }
     public static void Reverse(int []arr, int i, int j){
       while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }  
    }
}
