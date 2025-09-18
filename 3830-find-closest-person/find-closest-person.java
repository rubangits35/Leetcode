class Solution {
    public int findClosest(int x, int y, int z) {
       int disxz=Math.abs(z-x);
       int disyz=Math.abs(y-z);
       int disxy=Math.abs(y-x);
       if(disxz==disyz)
       {
            return 0;
       }
       else if(disxz<disyz)
       {
            return 1;
       } 
       return 2;
    }
}