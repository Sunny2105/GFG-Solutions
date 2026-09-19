class Solution {
    boolean divisibleBy4(String s) {

        if (s.length() == 1) {
            int num = Integer.parseInt(s);

            if (num % 4 == 0) {
                return true;
            }
            return false;
        }

        String last = s.substring(s.length() - 2);
        int num = Integer.parseInt(last);

        if (num % 4 == 0) {
            return true;
        }

        return false;
    }
}