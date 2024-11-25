class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Create a dp array with the same dimensions as the matrix
        int[][] dp = new int[n][m];

        // Initialize the last row of dp with the values from the matrix
        for (int j = 0; j < m; j++) {
            dp[n - 1][j] = matrix[n - 1][j];
        }

        // Fill the dp array from the second-last row to the top row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                // Down
                int down = dp[i + 1][j];

                // Right diagonal (check bounds)
                int rightDiagonal = (j + 1 < m) ? dp[i + 1][j + 1] : (int) Math.pow(10, 9);

                // Left diagonal (check bounds)
                int leftDiagonal = (j - 1 >= 0) ? dp[i + 1][j - 1] : (int) Math.pow(10, 9);

                // Store the minimum path sum at dp[i][j]
                dp[i][j] = matrix[i][j] + Math.min(down, Math.min(rightDiagonal, leftDiagonal));
            }
        }

        // The answer is the minimum value in the first row of dp
        int minPathSum = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minPathSum = Math.min(minPathSum, dp[0][j]);
        }

        return minPathSum;
    }
}
