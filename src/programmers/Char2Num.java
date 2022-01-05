package programmers;

public class Char2Num {

    public static void main(String[] args){
        String[] inputs = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
        Integer[] results = {1478, 234567, 234567, 123};

        Solution s = new Solution();
        for(int i=0; i<inputs.length; i++){
            System.out.println("input >> " + inputs[i]);
            System.out.println("result >> " + s.solution(inputs[i]));

            assert results[i] == s.solution(inputs[i]);
            System.out.println();
        }
    }

    static class Solution {
        public Solution(){}

        public int solution(String s) {
            String[] numChars = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for(int i=0; i<numChars.length; i++){
                s = s.replaceAll(numChars[i], String.valueOf(i));
            }

            return Integer.parseInt(s);
        }
    }

}
