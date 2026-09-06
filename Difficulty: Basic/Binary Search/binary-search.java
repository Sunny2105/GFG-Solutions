class Solution {
    public boolean binarySearch(int[] arr, int k) {
     int s=0;
     int e=arr.length-1;
     while(s<=e){
         int mid=(s+e)/2;
         if(arr[mid]==k){
             return true;
         }
         else if(arr[mid]>k){
             e=mid-1;
         }
         else{
             s=mid+1;
         }
     }
        return false;
    }
}