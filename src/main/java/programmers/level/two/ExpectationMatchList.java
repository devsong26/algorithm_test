package programmers.level.two;

public class ExpectationMatchList {

    public int solution(int n, int a, int b)
    {
        int answer = 0;

        int[] nowList = new int[n];
        for(int i = 0; i<n; i++){
            nowList[i] = i + 1;
        }

        int[] nextList = new int[n/2];

        int nextIdx = 0;

        while(n > 1){
            answer++;

            for(int i = 0; i < nowList.length; i += 2){
                int nowVal = nowList[i];
                int nextVal = nowList[i + 1];

                if((nowVal == a && nextVal == b)
                        || (nowVal == b && nextVal == a)){
                    n = 0;
                    break;
                }else if(nowVal == a || nowVal == b){
                    nextList[nextIdx++] = nowVal;
                }else if(nextVal == a || nextVal == b){
                    nextList[nextIdx++] = nextVal;
                }else {
                    nextList[nextIdx++] = nowVal;
                }
            }

            n /= 2;
            nowList = nextList;
            nextList = new int[n/2];
            nextIdx = 0;
        }

        return answer;
    }

}
