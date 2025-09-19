class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> hm= new HashMap<>();
        for(String s:strs)
        {
            char []arr=s.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(s);
        }
        List<List<String>> list1 = new ArrayList<>(hm.values());
        for (List<String> group : list1) 
        {
            Collections.sort(group);
        }
        Collections.sort(list1, (a, b) -> a.get(0).compareTo(b.get(0)));

        return list1;
    }
}