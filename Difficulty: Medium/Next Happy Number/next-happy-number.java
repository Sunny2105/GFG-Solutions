class Solution {
public int nextHappy(int n) {
n++;
    while (true) {
        int num = n;

        while (num != 1 && num != 4) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit * digit;
                num = num / 10;
            }

            num = sum;
        }

        if (num == 1) {
            return n;
        }

        n++;
    }
}
}
