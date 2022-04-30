package programmers;

import java.util.Arrays;

public class SearchKim {
    public String solution(String[] seoul) {
        return String.format("김서방은 %d에 있다",
                Arrays.asList(seoul).indexOf("Kim"));
    }
}
