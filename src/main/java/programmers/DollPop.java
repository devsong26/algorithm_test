package programmers;

import java.util.LinkedList;

public class DollPop {

    public static void main(String[] args) {
        int[][] board = {
            {0,0,0,0,0},
            {0,0,1,0,3},
            {0,2,5,0,1},
            {4,2,4,4,2},
            {3,5,1,3,1}
        };

        int[] moves = {1,5,3,5,1,2,1,4};
        int expected = 4;

        Solution s = new Solution();
        int result = s.solution(board, moves);
        System.out.println(result);

        assert expected == result;
    }

    static class Solution {

        public int solution(int[][] board, int[] moves) {
            int doll = 0, result = 0;
            LinkedList<Integer> list = new LinkedList<>();

            for(int i=0; i<moves.length; i++){
                int target = moves[i] - 1;

                for(int j=0; j< board.length; j++){
                    doll = board[j][target];
                    if(doll > 0){
                        board[j][target] = 0;
                        break;
                    }
                }

                if(doll > 0){
                    list.add(doll);
                    doll = 0;

                    int j =0;
                    while(list.size() > 1 && j < (list.size() - 1)){
                        if(list.get(j).equals(list.get(j + 1))){
                            for(int k=0; k<2; k++){
                                list.remove(j);
                                result++;
                            }
                        }else{
                            j++;
                        }
                    }
                }
            }

            return result;
        }

    }
}
