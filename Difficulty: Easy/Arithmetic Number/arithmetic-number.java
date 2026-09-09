class Solution {
    static int inSequence(int a, int b, int c) {
        if (c == 0) {
            if (a == b) {
                return 1;
            }
            return 0;
        }

        if ((b - a) % c == 0) {
            return 1;
        }

        return 0;
    }
}