class Solution {
    public int totalJumps(int[] arr, int x, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                count++;
            } 
            else {
                int remaining = arr[i] - x;
                int jumps = (remaining + (x - y) - 1) / (x - y);

                count += jumps + 1;
            }
        }
        return count;
    }
}