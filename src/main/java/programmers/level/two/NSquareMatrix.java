package programmers.level.two;

public class NSquareMatrix {

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];

        int idx = 0;

        for(long i=left; i<=right; i++){
            final int row = (int)(i / (long)n);
            final int col = (int)(i % (long)n);
            int number = row + 1;

            if(col > row){
                number += (col - row);
            }

            answer[idx++] = number;
        }

        return answer;
    }

}
