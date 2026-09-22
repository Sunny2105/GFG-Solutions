class Solution {

    void solve(int n, ArrayList<String> answer, StringBuilder str, int zero, int one) {

        if (str.length() == n) {
            answer.add(str.toString());
            return;
        }

        // Add 1
        str.append('1');
        solve(n, answer, str, zero, one + 1);
        str.deleteCharAt(str.length() - 1);

        // Add 0 only if number of 0s is less than number of 1s
        if (zero < one) {
            str.append('0');
            solve(n, answer, str, zero + 1, one);
            str.deleteCharAt(str.length() - 1);
        }
    }

    ArrayList<String> nBitBinary(int n) {

        ArrayList<String> answer = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        solve(n, answer, str, 0, 0);

        return answer;
    }
}