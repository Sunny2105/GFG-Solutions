class Solution {
    public static long getSmallestDivNum(int n) {
        long x = 1;

        for (int i = 1; i <= n; i++) {
            long a = x;
            long b = i;

            while (b != 0) {
                long r = a % b;
                a = b;
                b = r;
            }

            x = (x * i) / a;
        }

        return x;
    }
}