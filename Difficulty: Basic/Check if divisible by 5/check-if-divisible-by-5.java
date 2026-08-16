class Solution {
    public boolean divisibleBy5(String n) {
        char last = n.charAt(n.length() - 1);
        if (last == '0' || last == '5') {
            return true;
        }
        return false;
    }
}