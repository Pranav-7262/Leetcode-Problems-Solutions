class Solution {
    public double angleClock(int hour, int minutes) {
        double ans = 0;
        if(hour == 12) {
           hour = 0;
        }
        double hourAngle = hour * 30 + minutes/2.0;
        double minuteAngle = minutes * 6;
        double diff =  Math.abs(hourAngle - minuteAngle); 
        return Math.min(diff , 360 - diff);
    }
}
