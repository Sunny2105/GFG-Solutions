class Solution {
public int countNonDivisible(int n) {
int[] prefix = new int[211];
    for (int i = 1; i <= 210; i++) {
        prefix[i] = prefix[i - 1];

        if (i % 2 != 0 && i % 3 != 0 &&
            i % 5 != 0 && i % 7 != 0) {
            prefix[i]++;
        }
    }

    return (n / 210) * 48 + prefix[n % 210];
}
}
