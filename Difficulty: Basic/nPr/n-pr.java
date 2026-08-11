class Solution {
    public long nPr(int n, int r) {
        int d = n - r;

        long nsum = 1;
        long dsum = 1;

        for (int i = 1; i <= n; i++) {
            nsum *= i;
        }

        for (int j = 1; j <= d; j++) {
            dsum *= j;
        }

        long sol = nsum / dsum;

        return sol;
    }
}