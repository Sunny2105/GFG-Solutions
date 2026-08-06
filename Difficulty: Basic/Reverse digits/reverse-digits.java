class Solution {
    public int reverseDigits(int n) {
        int r, place=1, sum=0;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
}