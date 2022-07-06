package programmers.level.one;

public class PushKeypad {

    public static void main(String[] args) {
        int[] inputs = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        String result = "LRLLRRLLLRR";

        Solution s = new Solution();
        String solution = s.solution(inputs, hand);
        System.out.println(solution);
        assert result.equals(solution);
    }

    static class Solution {//extends SolutionChecker {
//        public Solution(Object[] inputs, Object[] results){
//            super(inputs, results);
//        }

        //        @Override
//        public <T, M> T solution(M m) {
//            return null;
//        }
        public String solution(int[] numbers, String hand) {
            hand = hand.toUpperCase().substring(0, 1);

            StringBuilder answer = new StringBuilder();
            int l = 10, r = 12;
            String nh = null;

            for (int i = 0; i < numbers.length; i++) {
                int n = numbers[i];
                if (n % 3 == 1) {
                    l = n;
                    nh = "L";
                } else if (n != 0 && n % 3 == 0) {
                    r = n;
                    nh = "R";
                } else {
                    if (n == 0) {
                        n = 11;
                    }
                    int lnp = Math.abs(n - l) / 3 + Math.abs(n - l) % 3,
                            rnp = Math.abs(n - r) / 3 + Math.abs(n - r) % 3;

                    if (lnp < rnp) {
                        nh = "L";
                        l = n;
                    } else if (lnp > rnp) {
                        nh = "R";
                        r = n;
                    } else {
                        nh = hand;

                        if (nh.equals("R")) {
                            r = n;
                        } else {
                            l = n;
                        }
                    }
                }

                answer.append(nh);
            }
            return answer.toString();
        }
    }

}
