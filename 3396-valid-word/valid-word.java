class Solution {
    public boolean isValid(String word) {
        int l = word.length();
        if (l < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < l; i++) {
            char ch = word.charAt(i);

            // Check if character is letter or digit
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Check for vowel
            char lowerCh = Character.toLowerCase(ch);
            if ("aeiou".indexOf(lowerCh) != -1) {
                hasVowel = true;
            }
            // Check for consonant
            else if (Character.isLetter(ch)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
