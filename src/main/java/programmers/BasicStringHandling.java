package programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicStringHandling {
    public boolean solution(String s) {
        Pattern p = Pattern.compile("[~\\D]");
        Matcher m = p.matcher(s);
        return !m.find() && (s.length() ==4 || s.length() == 6);
    }
}
