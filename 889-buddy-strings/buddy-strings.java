class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int first = -1, last = -1;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                if(first == -1) first = i;
                else if(last == -1) last = i;
                else return false;
            }
        }

        if(first == -1) {
            int[] freq = new int[26];
            for(char c : s.toCharArray()) {
                freq[c - 'a']++;
                if(freq[c - 'a'] > 1) return true;
            }
            return false;
        }

        return last != -1 &&
               s.charAt(first) == goal.charAt(last) &&
               s.charAt(last) == goal.charAt(first);
    }
}