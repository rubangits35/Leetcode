class Solution {
    public String finalString(String s) {
       // char ch[]=s.tocharArray();
       StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='i')
            {
                s1.append(s.charAt(i));
            }
            else
            {
                s1.reverse();
            }
        }
        return s1.toString();
    }
}