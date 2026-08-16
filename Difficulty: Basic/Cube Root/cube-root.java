class Solution {
    static int cubeRoot(int n) {
        int i = 1;

        while (i * i * i <= n) {
            i++;
        }
        return i - 1;
    }
}