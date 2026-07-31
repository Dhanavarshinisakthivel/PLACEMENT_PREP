import java.util.List;
import java.util.Arrays;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // dp array to store min path sums
        int[] dp = new int[n];

        // initialize dp with last row of triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // start from second-last row moving upwards
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        // top element contains the minimum path sum
        return dp[0];
    }

    // local test
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );
        System.out.println(sol.minimumTotal(triangle)); // 11
    }
}