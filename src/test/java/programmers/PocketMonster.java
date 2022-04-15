package programmers;

import java.util.Arrays;

public class PocketMonster {
    public int solution(int[] nums) {
        Arrays.sort(nums);

        int unDuplicatedCnt = 1;
        int cnt = nums[0];

        for(int i = 1; i < nums.length; i++){
           if(cnt < nums[i]){
               cnt = nums[i];
               unDuplicatedCnt++;
           }
        }

        return nums.length / 2 >= unDuplicatedCnt ? unDuplicatedCnt : nums.length / 2;
    }
}
