class Solution {
    public int countIncreasing(int[] arr) {
        int count = 0;
        int length = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                length++;
                count += length - 1;
            } else {
                length = 1;
            }
        }

        return count;
    }
}