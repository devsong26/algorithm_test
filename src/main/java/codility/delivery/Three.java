package codility.delivery;

public class Three {

    public static void main(String[] args){
        Solution s = new Solution();
        //int[] arr = {3, 2, -2, 5, -3};
//        int[] arr = {1, 1, 2, -1, 2, -1};
        int[] arr = {1,2,3,-4};
        System.out.println(s.solution(arr));
    }

    static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            int oppositeNum = 0;
            int num = 0;

            for(int i=0; i<A.length; i++){
                num = A[i];
                for(int j=i+1; j<A.length; j++){
                    if(A[j] == (-1*num)){
                        if(num > oppositeNum){
                            oppositeNum = num;
                        }
                    }
                }
            }

            return oppositeNum;
        }
    }

}
