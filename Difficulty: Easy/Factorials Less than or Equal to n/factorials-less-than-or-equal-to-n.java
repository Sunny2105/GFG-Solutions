class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();

        long fact = 1;

        for (long i = 1; fact <= n; i++) {
            fact = fact * i;

            if (fact <= n) {
                ans.add(fact);
            }
        }

        return ans;
    }
}