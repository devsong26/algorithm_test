package programmers.level.two;

import java.util.ArrayList;
import java.util.List;

public class TargetNumber {

    public static void main(String[] args){
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(new Solution().solution(numbers, target));
    }

    static class Solution {
        public int solution(int[] numbers, int target) {
            List<Integer> answers = new ArrayList<>();
            return bfs(numbers, target, 0, answers);
        }

        private int bfs(int[] numbers, int target, int sum, List<Integer> answers){
            if(sum == target){
                return 1;
            }

//            for(int j=i; j<numbers.length; j++){
//                bfs(numbers, target, j+1, )
//            }

            return 0;
        }

    }

}
