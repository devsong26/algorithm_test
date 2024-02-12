package programmers.level.two;

import java.util.Stack;

public class BracketRotation {

    public int solution(String s) {
        int answer = 0;
        String tempS = s;

        do {
            Stack<Character> stack = new Stack<>();
            char[] chars = tempS.toCharArray();

            for (char ch : chars) {

                if(stack.empty()){
                    stack.push(ch);
                }else{
                    char popCh = stack.pop();
                    boolean isMatch = false;

                    switch (popCh) {
                        case '{':
                            if (ch == '}') {
                                isMatch = true;
                            }
                            break;
                        case '[':
                            if (ch == ']') {
                                isMatch = true;
                            }
                            break;
                        case '(':
                            if (ch == ')') {
                                isMatch = true;
                            }
                    }

                    if (!isMatch) {
                        stack.push(popCh);
                        stack.push(ch);
                    }
                }

            }

            if (stack.size() == 0) {
                answer++;
            }

            char firstCh = chars[0];
            for (int i = 1; i < chars.length; i++) {
                chars[i - 1] = chars[i];
            }
            chars[chars.length - 1] = firstCh;

            tempS = new String(chars);

        } while (!s.equals(tempS));

        return answer;
    }

}
