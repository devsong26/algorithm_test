package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReportResult {

    public static void main(String[] args){
        Solution s = new Solution();

//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        int k = 2;

        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        int[] result = s.solution(id_list, report, k);
        for (int j : result) {
            System.out.println(j);
        }
    }

    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            List<String> users = Arrays.asList(id_list);
            int[] badUserCounts = new int[id_list.length];
            int[][] reportInfo = new int[id_list.length][id_list.length];
            int[] reportList;

            for(String r : report){
                String[] splitUsers = r.split(" ");
                int reporterIndex = users.indexOf(splitUsers[0]);
                int badUserIndex = users.indexOf(splitUsers[1]);

                reportList = reportInfo[badUserIndex];
                if(reportList[reporterIndex] == 0) {
                    reportList[reporterIndex]++;
                    badUserCounts[badUserIndex]++;
                }
            }

            int[] answer = new int[id_list.length];

            for(int i=0; i<badUserCounts.length; i++){
                if(badUserCounts[i] >= k){
                    reportList = reportInfo[i];
                    for(int j=0; j< reportList.length; j++){
                        if(reportList[j] == 1)
                            answer[j]++;
                    }
                }
            }

            return answer;
        }
    }

}
