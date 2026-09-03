class Solution {
    public int divisibleByDigits(String s) {
        int[] rem = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            for (int d = 1; d <= 9; d++) {
                rem[d] = (rem[d] * 10 + digit) % d;
            }
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (digit != 0 && rem[digit] == 0) {
                count++;
            }
        }

        return count;
    }
}