package programmers.level.two;

import java.util.*;

public class MultipleInputLCM {

    public int solution(int[] arr) {
        int answer = 1;
        final Map<Integer, Integer> totalMap = new HashMap<>();

        for(int e : arr){
            final Map<Integer, Integer> map = new HashMap<>();

            int divisor = 2;
            while(e > 1){
                if(e % divisor == 0){
                    e /= divisor;

                    if(map.containsKey(divisor)){
                        map.put(divisor, map.get(divisor) + 1);
                    }else{
                        map.put(divisor, 1);
                    }
                }else{
                    divisor++;
                }
            }

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(totalMap.containsKey(entry.getKey())){
                    if(totalMap.get(entry.getKey()) < entry.getValue()){
                        totalMap.put(entry.getKey(), entry.getValue());
                    }
                }else{
                    totalMap.put(entry.getKey(), entry.getValue());
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry : totalMap.entrySet()){
            for(int i=0; i<entry.getValue(); i++){
                answer *= entry.getKey();
            }
        }

        return answer;
    }

}
