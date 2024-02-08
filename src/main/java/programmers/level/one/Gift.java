package programmers.level.one;

public class Gift {

    /*
    두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면, 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
        만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.
     */

    public int solution(String[] friends, String[] gifts) {
        final int[] results = new int[friends.length];

        for(int i=0; i<friends.length; i++){
            for(int j=0; j< friends.length; j++){
                if(i == j){
                    continue;
                }

                int iGiveCnt = 0, iReceiveCnt = 0;
                String iGive = friends[i] + " " + friends[j];
                String iReceive = friends[j] + " " + friends[i];

                for (String gift : gifts) {
                    if (gift.equals(iGive)) {
                        iGiveCnt++;
                    } else if (gift.equals(iReceive)) {
                        iReceiveCnt++;
                    }
                }

                if(iGiveCnt > iReceiveCnt) {
                    results[i]++;
                }else if(iGiveCnt == iReceiveCnt){

                    // 선물 지수
                    int iGiftIndex = 0, jGiftIndex = 0;

                    for (String gift : gifts) {
                        String[] splitGift = gift.split(" ");

                        if (splitGift[0].equals(friends[i])) {
                            iGiftIndex++;
                        } else if (splitGift[1].equals(friends[i])) {
                            iGiftIndex--;
                        } else if (splitGift[0].equals(friends[j])) {
                            jGiftIndex++;
                        } else if (splitGift[1].equals(friends[j])) {
                            jGiftIndex--;
                        }
                    }

                    if(iGiftIndex > jGiftIndex){
                        results[i]++;
                    }
                }
            }

        }

        int answer = -1;
        for (int r : results) {
            if (answer < r) {
                answer = r;
            }
        }

        return answer;
    }

}
