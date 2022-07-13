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
            List<Integer> leaves = new ArrayList<>();
            int answer = 0;
            leaves.add(0);

            for(int n : numbers){
                List<Integer> temp = new ArrayList<>();
                for(Integer l : leaves){
                    temp.add(l + n);
                    temp.add(l - n);
                }
                leaves = temp;
            }
            for(Integer l : leaves){
                if(l == target) answer++;
            }

            return answer;
        }

//        private int bfs(int[] numbers, int target, int sum, List<Integer> answers){
//            if(sum == target){
//                return 1;
//            }
//
////            for(int j=i; j<numbers.length; j++){
////                bfs(numbers, target, j+1, )
////            }
//
//            return 0;
//        }

    }

}
