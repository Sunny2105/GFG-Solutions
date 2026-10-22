class Solution {
public int modInverse(int n, int m) {
n = n % m;
    for (int i = 1; i < m; i++) {
        if ((n * i) % m == 1) {
            return i;
        }
    }

    return -1;
}
}
