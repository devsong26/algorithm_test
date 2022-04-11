package programmers;

public class RecommendNewId {

    public static void main(String args[]){
        Solution s = new Solution();

        String[] inputs = new String[]{"...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p"};
        String[] results = new String[]{"bat.y.abcdefghi", "z--", "aaa", "123_.def", "abcdefghijklmn"};

        for(int i=0; i<inputs.length; i++){
            System.out.println("input ==> " + inputs[i]);
            System.out.println("result ==> " + s.solution(inputs[i]));
            assert results[i] == s.solution(inputs[i]);
            System.out.println();
        }

    }

    static class Solution {
        public Solution(){}

        public String solution(String new_id) {
            new_id = new_id.toLowerCase()
                            .replaceAll("[^a-z0-9\\-\\_.]", "")
                            .replaceAll("\\.{2,}", ".")
                            .replaceAll("^(\\.)|(\\.)$", "");

            if(new_id.equals("")){
                new_id = "a";
            }

            if(new_id.length() > 15){
                new_id = new_id.substring(0, 15)
                                .replaceAll("(\\.)$", "");
            }

            while(new_id.length() <= 2){
                new_id += String.valueOf(new_id.charAt(new_id.length() - 1));
            }

            return new_id;
        }
    }

}
