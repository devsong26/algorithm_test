package programmers.level.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BargainSale {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        final Map<String, Integer> wantMap = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }

        for(int i = 0; i <= (discount.length - 10); i++){
            Map<String, Integer> tempMap = new HashMap<>();

            for(int j = i; j <= i + 9; j++){
                if(tempMap.containsKey(discount[j])){
                    tempMap.put(discount[j], tempMap.get(discount[j]) + 1);
                }else{
                    tempMap.put(discount[j], 1);
                }
            }

            boolean isAllMatch = true;
            for(String key : wantMap.keySet()){
                if(!tempMap.containsKey(key) ||
                    !Objects.equals(tempMap.get(key), wantMap.get(key))){
                    isAllMatch = false;
                    break;
                }
            }

            if(isAllMatch){
                answer++;
            }
        }

        return answer;
    }

}
