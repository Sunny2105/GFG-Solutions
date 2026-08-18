class Solution {
    public int digitsInFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        double digits = 0;

        for (int i = 1; i <= n; i++) {
            digits += Math.log10(i);
        }

        return (int)digits + 1;
    }
}