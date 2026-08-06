class Solution {
    int majorityElement(int arr[]) {
        Arrays.sort(arr);
        int count = 1;
        int max = 1;
        int max_ele = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                max_ele = arr[i];
            }
        }

        if (max > arr.length / 2) {
            return max_ele;
        }
        return -1;
    }
}