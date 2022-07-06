package programmers.level.one;

public class TheSmallestNumberRemover {

    public static void main(String[] args){
        new Solution().solution(new int[]{4,3,2,1});
    }

    static class Solution {
        public int[] solution(int[] arr) {
            if(arr.length == 1) return new int[]{-1};

            int smallestNum = Integer.MAX_VALUE;
            for (int k : arr) {
                if (smallestNum > k) smallestNum = k;
            }

            int[] retArr = new int[arr.length - 1];
            for(int i=0, j=0; i<arr.length; i++){
                if(smallestNum != arr[i]) retArr[j++] = arr[i];
            }

            return retArr;
        }
    }

}
