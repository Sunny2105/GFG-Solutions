class Solution {
    public int evenFibSum(int n) {
        int a = 0, b = 1;
        int sum = 0;

        while (a <= n) {
            if (a % 2 == 0) {
                sum += a;
            }

            int c = a + b;
            a = b;
            b = c;
        }

        return sum;
    }
}