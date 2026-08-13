class Solution {
    static int rev(int n) {
        long reverse = 0;
        while (n > 0) {
            long digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return (int)reverse;
    }
    static boolean palindrome(int n) {
        long reverse = rev(n);
        if (n == reverse) {
            return true;
        }
        return false;
    }
    static int isSumPalindrome(int n) {
        int count = 0;
        if(palindrome(n)){
           return (int)n; 
        }

        while (count < 5) {
            n = n + rev(n);

            if (palindrome(n)) {
                return (int)n;
            }

            count++;
        }

        return -1;
    }
}