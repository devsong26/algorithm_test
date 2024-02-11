package programmers.level.two;

import java.util.Arrays;

public class GreedyBoat {

    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;

        int sIdx = 0, eIdx = people.length - 1;

        while(sIdx <= eIdx){
            if (people[sIdx] + people[eIdx] <= limit) {
                sIdx++;
            }
            eIdx--;
            answer++;
        }

        return answer;
    }

}
