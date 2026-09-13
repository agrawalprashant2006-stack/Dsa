public class Subarray_Product_Less_Than_k {
    public static void main(String args[]){
        int arr[] = {10,5,2,6};
        int k = 100;
        int ans = Product_Less_Than_k(arr,k);
        System.out.print(ans);
    }

    public static int Product_Less_Than_k(int arr[], int k){
        int ans = 0;
        int si = 0, ei = 0, p =1;
        while(ei<arr.length){
            //window grow
            p*=arr[ei];
            //window shrink
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }
            //ans calculate
            ans +=(ei-si+1);
            ei++;
        }
        return ans;
    }
}
