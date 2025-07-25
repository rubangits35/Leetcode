class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;

        boolean firstUpper = Character.isUpperCase(word.charAt(0));
        boolean secondUpper = Character.isUpperCase(word.charAt(1));

        for (int i = 2; i < word.length(); i++) {
            boolean currentUpper = Character.isUpperCase(word.charAt(i));
            if (currentUpper != secondUpper) return false;
        }
        if (!firstUpper && secondUpper) return false;
        return true;
    }
}
