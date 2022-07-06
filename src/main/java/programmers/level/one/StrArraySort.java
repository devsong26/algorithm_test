package programmers.level.one;

public class StrArraySort {

    public static void main(String[] args){
        String[] strList = {"sun", "bed", "car"};
        new Solution().solution(strList, 1);
    }

    static class Solution {
        public String[] solution(String[] strings, int n) {

            for(int i=0; i<strings.length - 1; i++){
                for(int j=i+1; j<strings.length; j++){
                    if(strings[i].charAt(n) > strings[j].charAt(n)){
                        swap(strings, i, j);
                    }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                        if(strings[i].compareTo(strings[j]) > 0){
                            swap(strings, i, j);
                        }
                    }
                }
            }

            return strings;
        }

        private void swap(String[] strings, int i, int j) {
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
        }

    }

}
