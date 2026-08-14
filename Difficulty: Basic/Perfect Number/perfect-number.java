class Solution {
    int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }

    int isPerfect(int N) {
        int sum=0;
        int org=N;
        while(N>0){
            int rev=N%10;
            int factorial=fact(rev);
            sum=sum+factorial;
            N=N/10;
        }
        if(org==sum){
            return 1;
        }
        return 0;
    }
}