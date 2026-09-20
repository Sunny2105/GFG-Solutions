class Solution {
    public boolean isDivBy8(String s) {
        int n = s.length();

        if (n == 1) {
            return (s.charAt(0) - '0') % 8 == 0;
        }

        if (n == 2) {
            int num = Integer.parseInt(s);
            return num % 8 == 0;
        }

        int num = Integer.parseInt(s.substring(n - 3));

        return num % 8 == 0;
    }
}