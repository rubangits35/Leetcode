class Solution {
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String str[]=text.split(" ");
        char ch[]=brokenLetters.toCharArray();
        
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            int flag=0;
            for(int j=0;j<ch.length;j++)
            {
                if(str[i].contains(String.valueOf(ch[j])))
                {
                    flag=1;
                    break;
                }
               
            }
            if(flag==0)
            {
                count++;
            }
        }
        
        return count;
    }
}