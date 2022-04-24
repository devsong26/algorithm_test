package programmers;

import java.util.Arrays;

public class MiniRectangle {
    public int solution(int[][] sizes) {
        int max_h = 0, max_w = 0;

        for(int[] s : sizes){
            if(max_w < s[0]) max_w = s[0];
            if(max_h < s[1]) max_h = s[1];
        }

        int minimum = max_h * max_w;

        for(int i=0; i<sizes.length; i++){
            max_w = sizes[i][1];
            max_h = sizes[i][0];

            int[][] cloneSizes = Arrays.copyOf(sizes, sizes.length);

            for(int j=0; j<cloneSizes.length; j++){
                //TODO max_w, max_h 값 중 동일한 값이 있을 경우 스왑한다.
            }

            for(int j=0; j<cloneSizes.length; j++){
                if(i == j) continue;

                if(max_w < cloneSizes[j][0]) max_w = cloneSizes[j][0];
                if(max_h < cloneSizes[j][1]) max_h = cloneSizes[j][1];
            }

            if(minimum > max_w * max_h) minimum = max_w * max_h;
        }

        return minimum;
    }

}
