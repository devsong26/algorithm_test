package codility.delivery;

public class One {

    public static void main(String[] args){
        Solution s = new Solution();
        int[] C = {2, 1, 1, 0, 1};
        System.out.println(s.solution(3, 2, C));
    }

    static class Solution {
        public String solution(int U, int L, int[] C) {
            // write your code in Java SE 8
            int sumC = 0,  sumL = 0;
            StringBuilder upper = new StringBuilder(), lower = new StringBuilder();

            for(int i=0; i<C.length; i++){
                if(C[i] == 2){
                    sumC++;
                    sumL++;
                    upper.append("1");
                    lower.append("1");
                }else if(C[i] == 1){
                    if((sumC + 1) <= U){
                        sumC++;
                        upper.append("1");
                        lower.append("0");
                    }else if((sumL + 1) <= L){
                        sumL++;
                        upper.append("0");
                        lower.append("1");
                    }
                }else{
                    upper.append("0");
                    lower.append("0");
                }
            }

            StringBuilder result = new StringBuilder();

            if((sumC == U) && (sumL == L)){
                result.append(upper).append(",").append(lower);
            }else{
                result.append("IMPOSSIBLE");
            }

            return result.toString();
        }
    }

}
