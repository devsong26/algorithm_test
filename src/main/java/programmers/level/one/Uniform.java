package programmers.level.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uniform {
    /**
     * ##### 테스트 케이스에서 알아서 넣어줌 #####
     * 전체 학생의 수는 2명 이상 30명 이하입니다.
     * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * ########################################
     *
     *
     * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
     *
     * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
     * 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
     * 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
     */

    public int solution(int n, int[] lost, int[] reserve) {
        return n - lost.length
                + getLostReserveCnt(lost, reserve)
                + getBorrowerCnt(lost, reserve);
    }

    private int getLostReserveCnt(int[] lost, int[] reserve){
        int lostReserveCnt = 0;

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = 0;
                    reserve[j] = 0;
                    lostReserveCnt++;
                    break;
                }
            }
        }

        return lostReserveCnt;
    }

    private int getBorrowerCnt(int[] lost, int[] reserve) {
        int borrowCnt = 0;
        List<Integer> reserveList =
                Arrays.stream(reserve)
                        .filter(e -> e > 0)
                        .boxed()
                        .sorted()
                        .collect(Collectors.toList());

        Arrays.sort(lost);
        for(Integer l : lost){
            if(l == 0) continue;

            Integer pre = l - 1;
            if(pre > 0){
                if(removeIfContains(pre, reserveList)){
                    borrowCnt++;
                    continue;
                }
            }

            Integer post = l + 1;
            if(removeIfContains(post, reserveList)){
                borrowCnt++;
                continue;
            }
        }

        return borrowCnt;
    }

    private boolean removeIfContains(Integer i, List<Integer> list){
        if(list.contains(i)){
            list.remove(i);
            return true;
        }
        return false;
    }

}
