class Solution {
    public double getAngle(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));

        h = h % 12;

        double hourAngle = h * 30 + m * 0.5;
        double minuteAngle = m * 6;

        double angle = Math.abs(hourAngle - minuteAngle);

        return Math.min(angle, 360 - angle);
    }
}