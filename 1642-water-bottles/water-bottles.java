class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int fullb=0;
        int empb=0;
        while(numBottles>0)
        {
            fullb+=numBottles;
            empb+=numBottles;
            numBottles=empb/numExchange;
            empb=empb%numExchange;
        }
        return fullb;
    }
}