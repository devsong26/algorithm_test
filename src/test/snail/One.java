package test.snail;

/**
 *  1   16  15  14  13
 *  2   17  24  23  12
 *  3   18  25  22  11
 *  4   19  20  21  10
 *  5   6   7   8   9
 */
public class One {

    public static void main(String[] args){
        int size = 5;
        int[][] arr = new int[size][size];
        int row = -1, col = 0;
        int lCnt = size;

        for(int cnt = 0; cnt < size*size; ){
            for(int j = 0; j < lCnt; j++){//⇩
                arr[++row][col] = ++cnt;
            }

            for(int j = 0; j < lCnt - 1; j++){//⇨
                arr[row][++col] = ++cnt;
            }

            for(int j = 0; j < lCnt - 1; j++) {//⇧
                arr[--row][col] = ++cnt;
            }

            for(int j = 0; j < lCnt - 2; j++){//⇦
                arr[row][--col] = ++cnt;
            }

            lCnt -= 2;
        }

    }

}
