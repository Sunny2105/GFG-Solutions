class Solution {
static int calculateFutureValue(int p, int t, int n, int r) {
    double amount = p * Math.pow(1 + (double) r / (100 * n), n * t);

    return (int) Math.floor(amount);
}
}
