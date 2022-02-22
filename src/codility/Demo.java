package codility;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args){
        //int[] A = {1, 3, 6, 4, 1, 2};
//        int[] A = {-1, -3};
        int[] A = {1,2,3};

        Solution s = new Solution();
        System.out.println(s.solution(A));
    }
    static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            Arrays.sort(A);

            int positiveInteger = A[0];

            for(int i=1; i<A.length; i++){
                int n = A[i];

                if(n < 0 || positiveInteger == n){
                    continue;
                }

                if(positiveInteger + 1 < n){
                    positiveInteger += 1;
                    break;
                }

                positiveInteger += 1;
            }

            return positiveInteger <= 0 ? 1 :
                    positiveInteger == A[A.length - 1] ? (positiveInteger + 1) : positiveInteger;
        }
    }

}
