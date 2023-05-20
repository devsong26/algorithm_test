package programmers.level.two;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MInMax {

    public static void main(String[] args){
        Solution s = new Solution();

        String p = "-1 -1";
        System.out.println(s.solution(p));
    }

    static class Solution {
        public String solution(String s) {
            List<Integer> l = Stream.of(s.split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());

            return l.get(0) + " " + l.get(l.size() - 1);
        }
    }

}
