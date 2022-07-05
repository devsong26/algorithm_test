package programmers;

public class StringDesc {

    public static void main(String[] args){
        System.out.println(new Solution().solution("Zbcdefg"));
    }

    static class Solution {
        public String solution(String s) {
            char[] charArr = s.toCharArray();

            for (int i=0; i<charArr.length - 1; i++){
                for(int j=i; j<charArr.length; j++){
                    if(charArr[i] < charArr[j]){
                        char temp = charArr[i];
                        charArr[i] = charArr[j];
                        charArr[j] = temp;
                    }
                }
            }

            return new String(charArr);
        }
    }

}
