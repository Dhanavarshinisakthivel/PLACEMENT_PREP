class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;

        for (int i = 0; i < s.length(); i++) {

            // Count A
            if (s.charAt(i) == 'A') {
                absent++;
            }

            // More than one A
            if (absent >= 2) {
                return false;
            }

            // Three consecutive L
            if (i >= 2 &&
                s.charAt(i) == 'L' &&
                s.charAt(i - 1) == 'L' &&
                s.charAt(i - 2) == 'L') {
                return false;
            }
        }

        return true;
    }
}