class Solution {
    public int maximizeMoney(int n, int k) {
        int sum;
        if(n%2==0){
             sum = (n/2)*k;
        }
        else{
            sum = ((n+1)/2)*k;
        }
        return sum;
    }
}