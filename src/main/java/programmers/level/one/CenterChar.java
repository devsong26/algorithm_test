package programmers.level.one;

public class CenterChar {
    public String solution(String s) {
        int length = s.length();
        return length % 2 == 0 ?
                s.substring(length / 2 - 1, length / 2 + 1) :
                String.valueOf(s.charAt(length / 2));
    }
}
