package programmers.level.two;

public class ValidBracket {

    public static void main(String[] args){
        Solution s = new Solution();

        /*
        ()

        ()()
        (())

        2n - 1 -> l / 2 - 1, l / 2 -> )( -> false
        ()()()
        ())(()
        (()())
        ((()))

        2n -> [l / 2 - 2, l / 2 -1], [l / 2, l / 2 + 1] -> )()( -> false
        ()()()()
        (((())))
        ()))((()
        ()
        ((()))()

        "()()()()"
        "()()()"
        "((())())()"
        "())(()"    false
        "()()"	    true
        "(())()"	true
        ")()("	    false
        "(()("	    false
         */

        String p = "())(()";
        System.out.println(s.solution(p));
    }

    private static class Solution {
        boolean solution(String s) {
            if(s.charAt(0) != '(' || s.charAt(s.length() - 1) != ')') return false;

            int rBCnt = 0;
            boolean valid = true;
            for(char c : s.toCharArray()){
                if(c == '(') rBCnt++;
                else rBCnt--;

                if(rBCnt < 0) valid = false;
            }

            return valid && rBCnt == 0;
        }
//        boolean solution(String s) {
//            return forkJoin(s).length()
//        }
    }

}
