
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        int d=a2-a1;
        int an= a1+((n-1)*d);
        return an;
        
        
    }
}
