import java.util.*;

class Solution {
    private String devowel(String word) {
        return word.toLowerCase().replaceAll("[aeiou]", "*");
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();  
        Map<String, String> caseInsensitive = new HashMap<>(); 
        Map<String, String> vowelMap = new HashMap<>(); 

       
        for (String word : wordlist) {
            exactWords.add(word);

            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);  
            String devowelWord = devowel(word);
            vowelMap.putIfAbsent(devowelWord, word); 
        }
         String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            if (exactWords.contains(query)) {
                result[i] = query;  
            } else if (caseInsensitive.containsKey(query.toLowerCase())) {
                result[i] = caseInsensitive.get(query.toLowerCase());  // Rule 2
            } else if (vowelMap.containsKey(devowel(query))) {
                result[i] = vowelMap.get(devowel(query));  
            } else {
                result[i] = "";  
            }
        }
        return result;
    }
}
