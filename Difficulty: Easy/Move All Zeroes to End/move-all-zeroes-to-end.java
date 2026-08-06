class Solution {void pushZerosToEnd(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int zcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zcount++;
            } else {
                ans.add(arr[i]);
            }
        }
        while (zcount > 0) {
            ans.add(0);
            zcount--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
    }
}