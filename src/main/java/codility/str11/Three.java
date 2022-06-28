package codility.str11;

public class Three {

    public static void main(String[] args){
        // BAONXXOLL -> 1
        // BAOOLLNNOLOLGBAX -> 2
        // QAWABAWONL -> 0
        // ONLABLABLOON -> 1
        System.out.println("result >> " + new Solution().solution("ONLABLABLOON"));
    }

    static class Solution {
        public int solution(String S) {
            // B A L L O O N
            int result = 0;

            while (S.length() >= 7) {
                int originLength = S.length();

                S = S.replaceFirst("B", "")
                        .replaceFirst("A", "")
                        .replaceFirst("L", "")
                        .replaceFirst("L", "")
                        .replaceFirst("O", "")
                        .replaceFirst("O", "")
                        .replaceFirst("N", "");

                if(originLength - 7 == S.length()){
                    result++;
                }else{
                    break;
                }
            }
            return result;
        }
    }

}
