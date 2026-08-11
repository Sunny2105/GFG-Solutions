class Solution {
    public int sumOfGP(int n, int a, int r) {

        if (r == 1) {
            return n * a;
        }

        int temp = 1;

        for (int i = 1; i <= n; i++) {
            temp *= r;
        }

        int sn = a * ((temp - 1) / (r - 1));

        return sn;
    }
}