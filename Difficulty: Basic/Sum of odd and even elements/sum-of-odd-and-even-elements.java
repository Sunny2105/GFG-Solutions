class Solution {
    public int[] findSum(int n) {
        int[] sum = new int[2];
        int even = 0, odd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        sum[0] = odd;
        sum[1] = even;

        return sum;
    }
}