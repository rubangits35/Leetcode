class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int vowel=0;
        int consonant=0;
        for(char ch:hm.keySet())
        {
            int count=hm.get(ch);
            if("aeiou".indexOf(ch)!=-1)
            {
                vowel=Math.max(vowel,count);
            }
            else
            {
                consonant=Math.max(consonant,count);
            }
        }
        return vowel+consonant;
    }
}