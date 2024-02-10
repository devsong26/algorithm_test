package programmers.level.one;

public class QuerySelector {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // table schema: code, date, maximum, remain
        // ext -> code, date, maximum, remain (조건 컬럼)
        // val_ext -> 이 값보다 작은 값들만 조회
        // sort_by -> 이 값으로 오름차순 정렬

        final String[] columns = {"code", "date", "maximum", "remain"};
        int extColIdx = 0;
        int sortColIdx = 0;

        for(int i=0; i<columns.length; i++){
            if(columns[i].equals(ext)){
                extColIdx = i;
            }
            if(columns[i].equals(sort_by)){
                sortColIdx = i;
            }
        }

        final int[][] tempResult = new int[data.length][data[0].length];

        for(int i=0; i<data.length; i++){
            if(data[i][extColIdx] < val_ext){
                System.arraycopy(data[i], 0, tempResult[i], 0, data[i].length);
            }
        }

        // bubble sort
        for(int i=0; i <= tempResult.length - 1; i++){
            for(int j = tempResult.length - 1; j > i; j--){
                if(tempResult[j - 1][sortColIdx] > tempResult[j][sortColIdx]){
                    int[] temp = tempResult[j - 1];
                    tempResult[j - 1] = tempResult[j];
                    tempResult[j] = temp;
                }
            }
        }

        // 데이터 정제
        int zeroCnt = 0;
        int notZeroStartIdx = 0;

        for(int i=0; i<tempResult.length; i++){
            if(tempResult[i][0] == 0){
                zeroCnt++;
            }else{
                notZeroStartIdx = i;
                break;
            }
        }

        int[][] answer = new int[tempResult.length - zeroCnt][tempResult[0].length];
        int sIdx = 0;

        for(int i = notZeroStartIdx; i < tempResult.length; i++){
            answer[sIdx++] = tempResult[i];
        }

        return answer;
    }

}
