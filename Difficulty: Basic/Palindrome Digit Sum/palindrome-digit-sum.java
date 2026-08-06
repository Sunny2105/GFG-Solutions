class Solution {
    boolean isDigitSumPalindrome(int n) {
        int sum=0,r,sum2=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        int temp=sum;
        while(sum>0){
            r=sum%10;
            sum2=sum2*10+r;
            sum=sum/10;
        }
        if(temp==sum2){
            return true;
        }
        else{
            return false;
        }
    }
}