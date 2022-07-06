package programmers.level.one;

public class AddNoneNumber {

    public static void main(String[] args){
        Solution s = new Solution();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(s.solution(numbers));
    }

    static class Solution {
        public int solution(int[] numbers) {
            int answer = 45;

            for(int n : numbers)
                answer -= n;

            return answer;
        }
    }

}
