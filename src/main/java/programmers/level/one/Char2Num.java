package programmers.level.one;

import programmers.module.SolutionChecker;

public class Char2Num {

    public static void main(String[] args){
        String[] inputs = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
        Integer[] results = {1478, 234567, 234567, 123};

        Solution s = new Solution(inputs, results);
        Integer[] solutions = new Integer[inputs.length];

        for(int i=0; i<inputs.length; i++){
            solutions[i] = s.solution(inputs[i]);
        }
        s.setSolutions(solutions);
        s.check();
    }

    static class Solution extends SolutionChecker {
        public Solution(Object[] inputs, Object[] results){
            super(inputs, results);
        }

        @Override
        public <T, M> T solution(M m) {
            return null;
        }

        public int solution(String s) {
            String[] numChars = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for(int i=0; i<numChars.length; i++){
                s = s.replaceAll(numChars[i], String.valueOf(i));
            }

            return Integer.parseInt(s);
        }

    }

}
