class Solution {
public:
    bool isPalindrome(int x) {
      
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        long s = 0; 

        while (x > 0) {
            int r = x % 10;
            s = (s * 10) + r;
            x /= 10;
        }

        return original == s;
    }
};