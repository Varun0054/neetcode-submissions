class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        
        while (true) {
            long totalHours = 0;
            
            // Calculate total hours needed at current speed
            for (int pile : piles) {
                totalHours += (pile + speed - 1) / speed; // Ceiling division
            }
            
            // The first speed that satisfies the condition is our minimum speed
            if (totalHours <= h) {
                return speed;
            }
            
            speed++;
        }
    }
}