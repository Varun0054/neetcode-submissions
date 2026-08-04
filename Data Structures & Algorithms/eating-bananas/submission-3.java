class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int p : piles) maxSpeed = Math.max(maxSpeed,p);

        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            if(canEatInHour(piles,h,mid)) maxSpeed = mid;
            else minSpeed = mid + 1;
                
        }
        return minSpeed;
    }
    private boolean canEatInHour(int piles[],int h ,int speed){
        int hours = 0;
        for(int p : piles){
            hours+=(int)Math.ceil((double)p / speed);
        }
        return hours <= h;
    }
}