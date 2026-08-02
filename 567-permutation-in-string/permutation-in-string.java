import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        int n = s1.length();

        for (int i = 0; i <= s2.length() - n; i++) {

            String temp = s2.substring(i, i + n);

            char[] b = temp.toCharArray();
            Arrays.sort(b);

            if (Arrays.equals(a, b))
                return true;
        }

        return false;
    }
}