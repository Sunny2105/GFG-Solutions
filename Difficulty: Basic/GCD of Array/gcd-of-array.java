class Solution {
    public int gcd(int n, int arr[]) {

        int m = arr[0];

        while (m > 0) {

            int i = 0;

            while (i < n) {
                if (arr[i] % m != 0) {
                    break;
                }
                i++;
            }

            if (i == n) {
                return m;
            }

            m--;
        }

        return 1;
    }
}