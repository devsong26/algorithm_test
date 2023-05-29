package programmers.level.two;

import java.util.Stack;

public class CoupleRemover {

    public static void main(String[] args){
        Solution s = new Solution();

        String p = "baabaa";
        System.out.println(s.solution(p));
    }

    private static class Solution {
        public int solution(String s) {
            Stack<Character> stack = new Stack<>();

            for (Character c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            return stack.isEmpty() ? 1 : 0;
        }
    }

}
