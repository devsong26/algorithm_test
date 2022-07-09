package programmers.level.two;

public class ZipString {

    public static void main(String[] args){
        System.out.println(new Solution().solution("abcabcdede"));
    }

    static class Solution {
        public int solution(String s) {
            String minStr = new String(s.toCharArray()); // 클론
            int sLength = s.length();

            for(int size = 1, i=0; size <= sLength; size++, i=0){
                SptStr finder = new SptStr(s.substring(i, i += size));
                StringBuilder sb = new StringBuilder();

                while(i < sLength){
                    String sub = s.substring(i, i = Math.min(i + size, sLength));
                    if( !finder.addCount(sub) ){
                        sb.append(finder);
                        finder = new SptStr(sub);
                    }
                }
                sb.append(finder);

                if(minStr.length() > sb.length()) minStr = sb.toString();
            }

            return minStr.length();
        }

        private static class SptStr{
            String content;
            int count;

            public SptStr(String content) {
                this.content = content;
                this.count = 1;
            }

            public boolean addCount(String input){
                boolean flag = false;
                if(content.equals(input)) {
                    count++;
                    flag = true;
                }
                return flag;
            }

            @Override
            public String toString(){
                return (count == 1 ? "" : count) + content;
            }
        }

    }

}
