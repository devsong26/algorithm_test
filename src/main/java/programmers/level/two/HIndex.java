package programmers.level.two;

public class HIndex {

    public int solution(int[] citations) {
        int answer = 0;

        for(int i = 0; i < citations.length; i++){
            int moreThanCnt = 0;

            for(int j = 0; j < citations.length; j++){
                if(citations[i] <= citations[j]) {
                    moreThanCnt++;
                }
            }

            int h = Math.min(moreThanCnt, citations[i]);

            if(h > answer){
                answer = h;
            }
        }

        return answer;
    }

}
