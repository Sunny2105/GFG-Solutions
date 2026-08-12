class Solution {
    int countFreq(int[] arr, int target) {
        int first = firstPosition(arr, target);
        int last = lastPosition(arr, target);

        if (first == -1) {
            return 0;
        }

        return (last - first) + 1;
    }

    public int firstPosition(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int first = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                first = mid;
                e = mid - 1;
            } 
            else if (arr[mid] < target) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }

        return first;
    }

    public int lastPosition(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int last = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                last = mid;
                s = mid + 1;
            } 
            else if (arr[mid] < target) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }

        return last;
    }
}