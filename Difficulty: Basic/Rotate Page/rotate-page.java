class Solution {
    boolean possibleOrNot(int a1, int a2, int b1, int b2, int c1, int c2) {

        long AB = (long)(a1 - b1) * (a1 - b1)
                + (long)(a2 - b2) * (a2 - b2);

        long BC = (long)(b1 - c1) * (b1 - c1)
                + (long)(b2 - c2) * (b2 - c2);

        return AB == BC;
    }
}