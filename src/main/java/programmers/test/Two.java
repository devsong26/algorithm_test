package programmers.test;

public class Two {

    public static void main(String[] args){
        int[][] result = new Solution().solution(5, false);
    }

    static class Solution {
        public int[][] solution(int n, boolean horizontal) {
            int[][] answer = new int[n][n];
            int value = 1, col = 0, row = 0, move = 1;

            answer[col][row] = value++;

            while( (row + 1 < n) && (col + 1 < n) ){
                // 처음 이동은 무조건 한칸
                for(int i = 0; i < 1; i++){
                    if(horizontal) { // 횡이동
                        answer[row][++col] = value++;
                    }else{  //종이동
                        answer[++row][col] = value++;
                    }
                }

                for(int i=0; i < move; i++){ // 수직이동
                    if(horizontal) { // 횡이동 -> 종이동
                        answer[++row][col] = value++;
                    }else{  //종이동 -> 횡이동
                        answer[row][++col] = value++;
                    }
                }

                for(int i=0; i < move; i++){
                    if(horizontal) { // 횡이동 -> 종이동 -> 횡이동
                        answer[row][--col] = value++;
                    }else{  //종이동 -> 횡이동 -> 종이동
                        answer[--row][col] = value++;
                    }
                }

                move++;
                horizontal = !horizontal;
            }

            return answer;
        }

    }

}
