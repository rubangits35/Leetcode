class Solution {
    public String convert(String s, int numRows) 
    {
            if(numRows==1 || numRows>=s.length())
            {
                return s;
            }
            List<StringBuilder> rows= new ArrayList<>();
            for(int i=0;i<s.length();i++)
            {
                rows.add(new StringBuilder());
            }
            int current =0;
            boolean d=false;
            for(char c:s.toCharArray())
            {
                rows.get(current).append(c);
                if(current==0 || current ==numRows-1)
                {
                    d=!d;
                }
                current+=d?1:-1;
            }
            StringBuilder res= new StringBuilder();
            for(StringBuilder row:rows)
            {
                res.append(row);
            }
            return res.toString();
    }
}