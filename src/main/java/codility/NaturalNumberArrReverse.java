package codility;

public class NaturalNumberArrReverse {

    public static void main(String[] args){
        new Solution().solution(12345);
    }

    static class Solution {
        public int[] solution(long n) {
            char[] chArr = String.valueOf(n).toCharArray();
            int[] answer = new int[chArr.length];

            for(int i=chArr.length - 1, j=0; i>=0; i--, j++)
                answer[j] = chArr[i] - 48;

            return answer;
        }
    }

}
