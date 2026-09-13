public class Array_Swap_Demo {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int other[]= {100, 200, 300, 400, 9};
       // int arr1[] = new int[] {10, 20, 30, 40, 50};
System.out.println(arr[0] + " " + other[0]);
//swap(arr[0], arr[1]);
//swap2(arr, 0,1);
swap3(arr, other);
//System.out.println(arr[0]+ " " + arr[1]);
System.out.println(arr[0] +" "+other[0]);
    }
public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}
 public static void swap2(int arr[], int i,int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}   
public static void swap3(int arr[], int other[]) {
    int temp[] = arr;
    arr = other;
    other = temp;
}
}
