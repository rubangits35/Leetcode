class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        String presort="";
        for(String word:words)
        {
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sorted= new String(arr);
            if(!sorted.equals(presort))
            {
                list.add(word);
                presort= sorted;
            }
        }
        return list;
    }
}