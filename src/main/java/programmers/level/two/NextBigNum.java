package programmers.level.two;

public class NextBigNum {

    public static void main(String[] args){
        Solution s = new Solution();

        int p = 78;
        System.out.println(s.solution(p));
    }

    private static class Solution {
        public int solution(int n) {
            int answer = 0;
            int nOneCnt = oneCntFromBin(Integer.toBinaryString(n));


            for(int i = n + 1; ; i++){
                if(nOneCnt == oneCntFromBin(Integer.toBinaryString(i))){
                    answer = i;
                    break;
                }
            }

            return answer;
        }

        private int oneCntFromBin(String bin){
            int cnt = 0;

            for(char c : bin.toCharArray()){
                if(c == 49) cnt++;
            }

            return cnt;
        }

    }

}
