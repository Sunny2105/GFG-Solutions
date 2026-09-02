class Solution {
    static long nthPosition(long n) {
        long ans = 1;

        while (ans * 2 <= n) {
            ans = ans * 2;
        }

        return ans;
    }
}