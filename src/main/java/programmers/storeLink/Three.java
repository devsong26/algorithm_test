package programmers.storeLink;

public class Three {

    public static void main(String[] args){
        // abcdcba -> 7
        System.out.println(new Solution().solution("abcdcba"));
    }

    static class Solution{

        //면접가면 이거 효율성 테스트은 문자열 처리를 어떻게 다루길 원했는지 물어보자
        public int solution(String s){
            int maxLength = 1;
            int sLength = s.length();
            String sub;
            for(int size = 2, i=0; size <= sLength; i++){

                sub = s.substring(i, i + size);

                boolean isSame = new StringBuilder(sub).reverse().toString().equals(sub);
                int subLength = sub.length();
                if(isSame && maxLength < subLength) {
                    maxLength = subLength;
                    i = -1;
                    size++;
                    continue;
                }

                if(i>=sLength - size) {
                    size++;
                    i = -1;
                }
            }

            return maxLength;
        }

    }

}
