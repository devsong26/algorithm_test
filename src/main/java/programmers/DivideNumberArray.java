package programmers;

import java.util.Arrays;

public class DivideNumberArray {

    public static void main(String[] args){
        //
        int[] arr = {5, 9, 7, 10};
        new Solution().solution(arr, 5);
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int cnt = 0;

            for(int i=0; i<arr.length; i++){
                if(arr[i] % divisor == 0){
                    cnt++;
                }else{
                    arr[i] = 0;
                }
            }

            if(cnt == 0) return new int[]{-1};

            int[] answer = new int[cnt];
            for(int i=0, j=0; i<arr.length; i++){
                if(arr[i] > 0) answer[j++] = arr[i];
            }

            Arrays.sort(answer);

            return answer;
        }
    }

}
