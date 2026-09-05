class Solution {
    public boolean isTidy(int n) {
        int max=n%10;
        while(n>0){
            int sum = n%10;
            if(sum>max){
                return false;
            }
            else{
                max=sum;
            }
            n=n/10;
        }
        return true;
    }
}