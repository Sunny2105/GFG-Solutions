class Solution {
    public int firstIndex(int arr[]) {
        int s=0;
        int e=arr.length-1;
        int ret=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==1){
                ret=mid;
                e=mid-1;
            }
            else if (arr[mid]>1){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ret;
    }
}