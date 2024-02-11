package programmers.level.two;

import java.util.HashSet;
import java.util.Set;

public class EngLastWordJoin {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        final Set<String> usageWords = new HashSet<>();

        for(int i = 0; i < words.length - 1; i++){
            char endCh = words[i].charAt(words[i].length() - 1);
            char startCh = words[i + 1].charAt(0);

            if(usageWords.contains(words[i + 1]) || endCh != startCh){
                answer[0] = ((i + 1) % n) + 1;
                answer[1] = ((i + 1) / n) + 1;
                break;
            }

            usageWords.add(words[i]);
        }

        return answer;
    }

}

/*
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

            words % n != 0;
            for-each words ?
            2 <= n <= 10
            m <= words.length <= 100
            2 <= words[x].length() <= 50
            words[x] is all lowercase

            Stack ?

    int x = 1, i = 1, j = 1;
    // int limitCnt = words.length / n + (words.length % n != 0 ? 1 : 0);
    // String before = words[0];

   //        for(; i<limitCnt ; i++){


        for(; j < n; j++){
        if(before.charAt(before.length() - 1) != words[x].charAt(0)){
        return new int[]{i, j};
        }
        before = words[x++];
        }

        j = 0;
        }

        return new int[]{0, 0};
        }

 */