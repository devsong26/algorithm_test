package programmers.level.two;

import java.util.stream.Stream;

public class IntegerTriangle {

    public static void main(String[] args){
        Solution s = new Solution();

        int[][] p ={{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        System.out.println(s.solution(p));
    }

    private static class Solution {

        public int solution(int[][] triangle) {
            int[][] dp = new int[triangle.length][triangle.length];
            dp[0][0] = triangle[0][0];

            int answer = 0;

            for(int i=0; i<triangle.length; i++){
                for(int j=0; j<triangle[i].length - 1; j++){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + triangle[i][j]);
                    dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i - 1][j] + triangle[i][j + 1]);

                    answer = Math.max(Math.max(dp[i][j], answer), dp[i][j + 1]);
                }
            }

            return answer;
        }

//        private void recursive(int row, int col){
//            dp[row][col]
//        }

// dfs
//        private void recursive(int[][] triangle, int row, int col, int sum){
//            sum += triangle[row][col];
//
//            if((row++) == triangle.length - 1){
//                if(max < sum) max = sum;
//
//                return;
//            }
//
//            int rInd = col + 1 > triangle[row].length - 1 ? triangle[row].length - 1 : col + 1;
//
//            recursive(triangle, row, col, sum); // left
//            recursive(triangle, row, rInd, sum); // right
//        }
    }

}
