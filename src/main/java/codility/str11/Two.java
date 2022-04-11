package codility.str11;

public class Two {

    public static void main(String[] args){
//        int[] A = {1,2,4,5};
        int[] A = {1,1,2,2,3};
        int K = 2;
        System.out.println(new Solution().solution(A, K));
    }

    static class Solution{
        public boolean solution(int[] A, int K) {
            int n = A.length;
            for (int i = 0; i < n - 1; i++) { //오름차순 확인
                if (A[i] + 1 < A[i + 1]) //테스트 케이스에서 숫자를 건너뛴 경우
                    return false;
            }
            if (A[0] != 1 || A[n - 1] != K) // 1 to K 끝값은 K
                return false;
            else
                return true;
        }
    }

}
