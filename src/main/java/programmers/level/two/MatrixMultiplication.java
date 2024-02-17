package programmers.level.two;

public class MatrixMultiplication {

    public int[][] solution(int[][] a, int[][] b) {
        final int aRows = a.length;
        final int aCols = a[0].length;
        final int bRows = b.length;
        final int bCols = b[0].length;

        final boolean isSameForm = aRows == bRows && aCols == bCols;
        if(!isSameForm && aRows == bCols){
            int[][] temp = a;
            a = b;
            b = temp;
        }

        int[][] answer = new int[aRows][bCols];

        for(int aRow = 0; aRow < aRows; aRow++){
            for(int bCol = 0; bCol < bCols; bCol++){
                for(int bRow = 0; bRow < bRows; bRow++){
                    answer[aRow][bCol] += a[aRow][bRow] * b[bRow][bCol];
                }
            }
        }

        return answer;
    }

}
