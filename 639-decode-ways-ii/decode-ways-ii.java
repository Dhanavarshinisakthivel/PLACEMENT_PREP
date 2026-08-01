class Solution {
    public int numDecodings(String s) {
        long mod = 1000000007;

        long dp0 = 1; 
        long dp1 = waysOne(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);

            long currWays = (waysOne(curr) * dp1) % mod;

            currWays = (currWays + (waysTwo(prev, curr) * dp0) % mod) % mod;

            dp0 = dp1;
            dp1 = currWays;
        }

        return (int) dp1;
    }

    // Ways for single character
    private long waysOne(char c) {
        if (c == '*')
            return 9;

        if (c == '0')
            return 0;

        return 1;
    }

    // Ways for two characters
    private long waysTwo(char a, char b) {

        if (a == '*' && b == '*') {
            // 11-19 and 21-26
            return 15;
        }

        if (a == '*') {
            if (b >= '0' && b <= '6')
                return 2; // 10-16 or 20-26
            else
                return 1; // 17-19
        }

        if (b == '*') {
            if (a == '1')
                return 9; // 11-19
            if (a == '2')
                return 6; // 21-26
            return 0;
        }

        int num = (a - '0') * 10 + (b - '0');

        if (num >= 10 && num <= 26)
            return 1;

        return 0;
    }
}