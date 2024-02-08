package programmers.level.two;

public class Carpet {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] res = solution.solution(4004, 999999);

        System.out.println(res[0] == 4);
        System.out.println(res[1] == 3);
    }

    /*
        노란색 1 -> {3, 3}
        노란색 2 -> {4, 3}
        노란색 3 -> {5, 3}
        노란색 4 -> {4, 4}
        노란색 5 -> {7, 3}
        노란색 6 -> {5, 4}
        노란색 7 -> {9, 3}
     */

    static class Solution {
        public int[] solution(int brown, int yellow) {
//            if(yellow % 2 == 1){
//                return new int[]{yellow + 2, 3};
//            }

            int row = 0;
            int col;
            for(col=yellow; col >= Math.sqrt(yellow); col--){
                if(yellow % col != 0) continue;

                row = yellow / col;

                if (brown == (row << 1) + (col << 1) + 4){
                    break;
                }
            }

            return new int[]{col + 2, row + 2};
        }
    }

}
