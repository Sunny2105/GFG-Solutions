class Solution {
    public void sumArray(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
        }
    }
}