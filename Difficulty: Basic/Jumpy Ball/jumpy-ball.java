class Solution {
    public int jumpyBall(int h) {
    int sum=0;
    while(h>0){
        sum += h+h;
        h=h/2;
    }
        return sum;
    }
}