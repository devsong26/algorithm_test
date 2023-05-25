package programmers.level.two;

public class ConvertBinary {

    public static void main(String[] args){
        Solution s = new Solution();

        String p = "1111111";
        int[] res = s.solution(p);
        System.out.println(res[0] + ", " + res[1]);
    }

    private static class Solution {
        private int zero = 0;
        private int convert = 0;

        public int[] solution(String s) {
            recursive(s);

            return new int[]{convert, zero};
        }

        private void recursive(String s){
            if (s.equals("1")) return;

            int beforeLen = s.length();
            s = s.replaceAll("0", "");
            this.zero += beforeLen - s.length();

            s = Integer.toBinaryString(s.length());
            this.convert++;

            recursive(s);
        }
    }

}
