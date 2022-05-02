package programmers;

import java.util.ArrayList;
import java.util.List;

public class NotDuplicateSerialNumber {
    public int[] solution(int[] arr) {
        int before = arr[0];
        List<Integer> result = new ArrayList<>();
        result.add(before);

        for(int i=1; i<arr.length; i++){
            int now = arr[i];
            if(before != now){
                before = now;
                result.add(now);
            }
        }

        return result.stream().mapToInt(e -> e).toArray();
    }
}
