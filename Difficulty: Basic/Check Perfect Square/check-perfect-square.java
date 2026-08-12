class Solution {
    public boolean isPerfectSquare(int n) {
        int s=0;
        int e=n/2;
        if(n==1){
            return true;
        }
        while(s<=e){
            int mid=(s+e)/2;
            if(mid*mid==n){
                return true;
            }
            else if(mid*mid<n){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}