class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 1) {
            ans.add(0);
            return ans;
        }

        if (n == 2) {
            ans.add(0);
            ans.add(1);
            return ans;
        }

        ans = fibonacciNumbers(n - 1);

        int size = ans.size();
        ans.add(ans.get(size - 1) + ans.get(size - 2));
        return ans;
    }
}