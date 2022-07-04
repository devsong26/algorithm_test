package programmers.test;

public class One {

    public static void main(String[] args){
        // {2,1,3} -> 1
        // {1, 2, 3} -> 0
        // {3, 2, 3, 6, 4, 5} -> 3
        // {3, 1, 10, 3}
        // {10, 1, 10, 10, 100}
        // {10, 9, 11, 12, 11}
        int[] grade = {10, 9, 11, 12, 11};
        System.out.println(new Solution().solution(grade));
    }

    static class Solution {
        public int solution(int[] grade) {
            int answer = 0;

            for(int i=0; i<grade.length - 1; i++){
                int diff = grade[i] - grade[i + 1];
                if(diff > 0){
                    answer += diff;
                }
            }

            return answer;
        }
    }

}
