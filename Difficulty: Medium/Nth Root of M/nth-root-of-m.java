class Solution {
    public int nthRoot(int n, int m) {
        if(m==0){
            return 0;
        }
        for (int i = 1; i <= m; i++) {
            long sum = 1;

            for (int j = 1; j <= n; j++) {
                sum = sum * i;

                if (sum > m) {
                    break;
                }
            }

            if (sum == m) {
                return i;
            }

            if (sum > m) {
                break;
            }
        }

        return -1;
    }
}