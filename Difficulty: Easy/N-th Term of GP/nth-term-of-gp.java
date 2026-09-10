class Solution {
    public int nthTerm(int a, int r, int n) {
        long mod = 1000000007;

        long ans = a;

        for (int i = 1; i < n; i++) {
            ans = (ans * r) % mod;
        }

        return (int) ans;
    }
}