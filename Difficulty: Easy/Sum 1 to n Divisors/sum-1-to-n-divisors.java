class Solution {
    public static long sumOfDivisors(long n) {
        long sum = 0;

        for (long i = 1; i <= n; i++) {
            for (long j = i; j <= n; j += i) {
                sum += i;
            }
        }

        return sum;
    }
}