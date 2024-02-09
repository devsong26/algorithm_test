package programmers.level.one;

public class Bandage {

    public int solution(int[] bandage, int health, int[][] attacks) {
        //bandage는 [시전 시간, 초당 회복량, 추가 회복량]
        // 최대 체력을 의미하는 정수 health
        // attacks[i]는 [공격 시간, 피해량]

        int holdTime = 0;
        int attIdx = 0;
        final int maxHealth = health;

        for(int sec=0; sec <= attacks[attacks.length - 1][0]; sec++){
            if(attacks[attIdx][0] == sec){
                health -= attacks[attIdx][1];
                holdTime = 0;
                attIdx++;

                if(health <= 0){
                    break;
                }
            }else{
                holdTime++;
                health += bandage[1];

                if(bandage[0] == holdTime){
                    health += bandage[2];
                    holdTime = 0;
                }

                if(health > maxHealth) {
                    health = maxHealth;
                }
            }
        }

        return health <= 0 ? -1 : health;
    }

}
