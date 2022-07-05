package programmers;

public class NumberDesc {

    public static void main(String[] args){
        System.out.println(new Solution().solution(118372));
    }

    static class Solution {
        public long solution(long n) {
            char[] chArr = String.valueOf(n).toCharArray();
            for(int i=0; i<chArr.length - 1; i++){
                for(int j=i+1; j<chArr.length; j++){
                    if(chArr[i] < chArr[j]){
                        char tmp = chArr[i];
                        chArr[i] = chArr[j];
                        chArr[j] = tmp;
                    }
                }
            }

            return Long.parseLong(new String(chArr));
        }
    }

}
