class Solution {
    public boolean checkAdamOrNot(int n) {

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        int square1 = n * n;
        int square2 = rev * rev;
        temp = square1;
        int revSquare = 0;

        while (temp > 0) {
            int digit = temp % 10;
            revSquare = revSquare * 10 + digit;
            temp = temp / 10;
        }

        return revSquare == square2;
    }
}