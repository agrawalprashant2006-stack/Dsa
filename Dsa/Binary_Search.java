public class Binary_Search {
    public static void main(String args[]){
    int arr[]={2, 3, 5, 6, 7, 9, 10, 11, 13, 15, 16, 18, 19};
    int item = 13;
    System.out.println(Binary_Search(arr,item));
    }
    public static int Binary_Search(int arr[],int item){
     int low =0;
     int high =arr.length-1;
     while(low<=high){
       int mid = (low+high)/2;
        if(arr[mid]==item){
            return mid;
        }else if(arr[mid]>item){
            high=mid-1;
        }else{
            low=mid+1;
        }
     }
     return -1;
}
}