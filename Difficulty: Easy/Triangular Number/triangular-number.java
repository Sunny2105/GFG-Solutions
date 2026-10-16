class Solution {
int isTriangular(int n) {
int sum = 0;
    for (int i = 1; sum < n; i++) {
        sum += i;
    }

    if (sum == n) {
        return 1;
    }

    return 0;
}
}
