import java.util.*;

class Solution {
    public String[] table = {
        "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        LinkedList<String> op = new LinkedList<>();
        
        if (digits == null || digits.length() == 0) {
            return op;
        }

        op.add(""); 
        while (op.peek().length() != digits.length()) {
            String cur = op.poll();
            int index = cur.length(); 
            int num = digits.charAt(index) - '0'; 
            for (char c : table[num].toCharArray()) {
                op.add(cur + c);
            }
        }
        return op;
    }
}
