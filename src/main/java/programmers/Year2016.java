package programmers;

import java.time.LocalDate;

public class Year2016 {

    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b)
                        .getDayOfWeek()
                        .name()
                        .substring(0, 3);
    }

}
