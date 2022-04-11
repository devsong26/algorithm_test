package snail;

/**
 *  1   14  15  16  13
 *  2   17  24  23  12
 *  3   18  25  22  11
 *  4   19  21  20  10
 *  5   9   8   7   6
 */
public class Two {

    public static void main(String[] args){
        int size = 5;
        int[][] arr = new int[size][size];
        int row = -1, col = 0;
        int lCnt = size;

        for(int cnt = 0; cnt < size*size; ){
            for(int j = 0; j < lCnt; j++){//⇩
                arr[++row][col] = ++cnt;
            }

            for(int j = lCnt - 1; j > 0; j--){//⇨
                arr[row][col + j] = ++cnt;
            }
            col += (lCnt - 1);

            for(int j = 0; j < lCnt - 1; j++) {//⇧
                arr[--row][col] = ++cnt;
            }

            for(int j = lCnt - 2; j > 0; j--){//⇦
                arr[row][col - j] = ++cnt;
            }
            col -= (lCnt - 2);

            lCnt -= 2;
        }
    }

}
