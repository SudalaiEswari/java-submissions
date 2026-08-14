class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
         k = k % arr.length;

         for(int i =0;i<k;i++)
         {
           int first = arr[n-1];
           for(int j =n-1;j>0;j--)
           {
            arr[j] = arr[j-1];
           }
           arr[0] = first;
         }
        
    }
}