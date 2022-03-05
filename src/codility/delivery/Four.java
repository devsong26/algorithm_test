package codility.delivery;

import java.util.Arrays;

public class Four {

    public static void main(String[] args){
        Solution s = new Solution();
//        int[] a = {1, 3, 2, 1};
//        int[] b = {4, 2, 5, 3, 2};
        int[] a = {1, 1, 1, 3, 3, 3, 3};
        int[] b = {3, 3, 3, 3, 3};
        System.out.println(s.solution(a, b));
    }

    static class Solution {
        int solution(int[] A, int[] B) {
            int n = A.length;
            int m = B.length;
            Arrays.sort(A);
            Arrays.sort(B);

            int i = 0;

            for (int k = 0; k < n; k++) {
                if (i < m - 1 && B[i] < A[k])
                    i += 1;
                if (A[k] == B[i])
                    return A[k];
            }

            return -1;
        }
    }

}
