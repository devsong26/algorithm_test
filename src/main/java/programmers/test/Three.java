package programmers.test;

public class Three {

    public static void main(String[] args){
        // {{2,5}, {3,3}, {3,4}, {3,5}, {4,3}}
        // {{2, 2}, {2, 3}, {2, 4}, {3, 2}, {3, 5}, {4, 3}, {4, 4}}
        int[][] lands = {{2, 2}, {2, 3}, {2, 4}, {3, 2}, {3, 5}, {4, 3}, {4, 4}};
        int[] result = new Solution().solution(5, 7, lands);
    }

    static class Solution {
        public int[] solution(int rows, int columns, int[][] lands) {
            int[][] area = new int[rows][columns];
            for(int i=0; i<lands.length; i++){ //육지 표시
                area[ lands[i][0] - 1 ][ lands[i][1] - 1 ] = 1;
            }

            for(int i=0; i<lands.length; i++){
                for(int j=1; j<lands.length - 1; j++){
                    if(lands[i][j-1] == 1
                        && lands[i][j+1] == 1
                        && lands[i][j] == 0) { //호수냐

                    }
                }
            }

            int[] answer = {};
            return answer;
        }
    }

}
