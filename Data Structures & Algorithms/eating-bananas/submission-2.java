class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxSpeed = 0;
        for (int pile : piles) maxSpeed = Math.max(maxSpeed, pile);
        while (minspeed < maxSpeed) {
            int mid = minspeed + (maxSpeed - minspeed) / 2;

            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minspeed = mid + 1;
            }
        }
        return minspeed;
    }

    private boolean canEatInTime(int[] piles, int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}
