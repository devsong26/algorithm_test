package programmers;

public class MiniRectangle {
    public int solution(int[][] sizes) {
        for(int[] s : sizes){
            if(s[0] < s[1]){
                int temp = s[0];
                s[0] = s[1];
                s[1] = temp;
            }
        }

        int maxW = 0, maxH = 0;

        for(int[] s : sizes){
            if(s[0] > maxW){
                maxW = s[0];
            }

            if(s[1] > maxH){
                maxH = s[1];
            }
        }

        return maxW * maxH;
    }

}
