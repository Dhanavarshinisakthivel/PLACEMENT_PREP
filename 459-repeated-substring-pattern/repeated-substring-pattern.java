class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String cut = doubled.substring(1, doubled.length() - 1);

        return cut.contains(s);
    }
}