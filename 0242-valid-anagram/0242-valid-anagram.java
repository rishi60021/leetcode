class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] ch = t.toCharArray();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char temp = s.charAt(i);
            boolean getchar = false;

            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == temp) {
                    ch[j] = '*';
                    getchar = true;
                    break; // Exit the inner loop once a match is found
                }
            }

            if (!getchar) {
                return false; // If no match is found, return false
            }
        }

        // Check if all characters in 'ch' are '*'
        for (char c : ch) {
            if (c != '*') {
                return false;
            }
        }

        return true;
    }
}
