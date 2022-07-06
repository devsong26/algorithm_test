package programmers.level.one;

import java.util.Arrays;

public class KstNumber {

    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution s = new Solution();
        System.out.println(s.solution(array, commands));
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int[] copyArray;
            int i = 0, j = 0, sIdx, eIdx, chIdx;

            while(i < commands.length){
                sIdx = --commands[i][j++];
                eIdx = commands[i][j++];
                chIdx = --commands[i][j];

                copyArray = Arrays.copyOfRange(array, sIdx, eIdx);
                Arrays.sort(copyArray);

                answer[i] = copyArray[chIdx];
                i++;
                j = 0;
            }

            return answer;
        }
    }

}
