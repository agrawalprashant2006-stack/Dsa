public class Merge_Two_Sorted_Array {
    public static void main(String args[]){
        int arr1[] = {2, 3, 5, 7, 8, 9};
        int arr2[] = {1, 3, 4, 5, 7};
  int ans[] = Merge_2_Sorted_Array(arr1,arr2);
  for(int i =0; i<ans.length; i++){
    System.out.println(ans[i]);
  }
    }
    public static int[] Merge_2_Sorted_Array(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n+m];
        int i = 0, j = 0, k = 0;
       while(i<n && j<m){
        if(arr1[i]<arr2[j]){
            ans[k++] = arr1[i++];
        }else{
            ans[k++] = arr2[j++];
        }
       } 
       while(i<n){
         ans[k++] = arr1[i++];        
       }
        while(j<m){
         ans[k++] = arr1[j++];        
       }     
       return ans;
    }
    
}
