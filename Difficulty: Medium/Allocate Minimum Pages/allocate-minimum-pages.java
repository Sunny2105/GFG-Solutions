class Solution {

    boolean ispossible(int[] arr, long mid, int k) {

        int stud = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } 
            else {
                stud++;
                pages = arr[i];
            }

            if (stud > k) {
                return false;
            }
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        if (k > arr.length) {
            return -1;
        }

        long s = 0;
        long e = 0;

        for (int i = 0; i < arr.length; i++) {

            s = Math.max(s, arr[i]);
            e += arr[i];
        }

        while (s < e) {

            long mid = s + (e - s) / 2;

            if (ispossible(arr, mid, k)) {
                e = mid;
            } 
            else {
                s = mid + 1;
            }
        }

        return (int)s;
    }
}