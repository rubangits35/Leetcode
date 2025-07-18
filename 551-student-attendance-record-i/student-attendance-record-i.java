class Solution {
    public boolean checkRecord(String s) {
       char ch[]=s.toCharArray();
       int ab=0;
       for(int i=0;i<ch.length;i++)
       {
            if(ch[i]=='A')
            {
                ab++;
            }
       }
        int late=0;
        for(int j=0;j<ch.length-2;j++)
        {
            if(ch[j] == 'L' && ch[j + 1] == 'L' && ch[j + 2] == 'L')
            {
                late++;
            }
        }
        if(ab < 2 && late == 0)

        {
            return true;
        }
        return false;
    }
}