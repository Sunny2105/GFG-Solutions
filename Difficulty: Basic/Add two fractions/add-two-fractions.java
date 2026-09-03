class Solution {
    public ArrayList<Integer> addFraction(int num1, int den1, int num2, int den2) {

        ArrayList<Integer> ans = new ArrayList<>();

        int numerator = num1 * den2 + num2 * den1;
        int denominator = den1 * den2;

        int a = numerator;
        int b = denominator;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int gcd = a;

        numerator = numerator / gcd;
        denominator = denominator / gcd;

        ans.add(numerator);
        ans.add(denominator);

        return ans;
    }
}