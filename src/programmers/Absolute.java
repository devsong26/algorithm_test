package programmers;

public class Absolute {

    public static void main(String[] args){
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        Solution s = new Solution();
        System.out.println(s.solution(absolutes, signs));
    }

    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i=0; i<absolutes.length; i++){
                answer += (signs[i] ? 1 : -1) * absolutes[i];
            }
            return answer;
        }
    }

}
