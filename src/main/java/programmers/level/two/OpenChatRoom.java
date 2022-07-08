package programmers.level.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class OpenChatRoom {

    public static void main(String[] args){
        String[] record = new String[]{
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };

        new Solution().solution(record);
    }

    static class Solution {
        private final Map<String, Map<Integer, Record>> recordMap = new HashMap<>();
        private final Map<String, Record> inOutMap = new HashMap<>();

        public String[] solution(String[] recordArr) {

            for(int i=0; i<recordArr.length; i++){
                Record record = new Record(recordArr[i]);

                if(record.stat == Record.Status.Enter){ // 닉변 후 입장 시 아이디에 해당하는 닉 모두 변경
                    putRecord(record, i, false);
                    updateNickname(record);
                    inOutMap.put(record.id, record);
                }else if(record.stat == Record.Status.Leave){
                    inOutMap.put(record.id, record);
                    putRecord(record, i, true);
                }else if(record.stat == Record.Status.Change){
                    updateNickname(record);
                }
            }
            
            return recordMapToArray(recordArr.length);
        }

        private void updateNickname(Record record) {
            if(inOutMap.containsKey(record.id)){
                Record saved = inOutMap.get(record.id);
                if( (saved.stat == Record.Status.Enter || record.stat == Record.Status.Enter)
                    && !saved.nickname.equals(record.nickname) ){
                    updateNickname0(record);
                }
            }
        }

        private String[] recordMapToArray(int capacity) {
            String[] result = new String[capacity];

            for (String value : recordMap.keySet()) {
                Map<Integer, Record> map = recordMap.get(value);

                for (Map.Entry<Integer, Record> entry : map.entrySet()) {
                    result[entry.getKey()] = entry.getValue().toString();
                }
            }

            return Stream.of(result).filter(Objects::nonNull).toArray(String[]::new);
        }

        private void updateNickname0(Record record) {
            Map<Integer, Record> map = recordMap.get(record.id);

            for(Map.Entry<Integer, Record> entry: map.entrySet()){
                Record saved = entry.getValue();
                saved.nickname = record.nickname;
            }
        }

        private void putRecord(Record record, int index, boolean isLeave){
            Map<Integer, Record> valueMap;

            if(recordMap.containsKey(record.id)){
                valueMap = recordMap.get(record.id);

                if(isLeave){
                    Record saved = valueMap.get((Integer) valueMap.keySet().toArray()[0]);
                    record.nickname = saved.nickname;
                }

                valueMap.put(index, record);
            }else{
                valueMap = new HashMap<>();
                valueMap.put(index, record);
                recordMap.put(record.id, valueMap);
            }
        }

        static class Record{
            String id;
            Status stat;
            String nickname;

            Record(String record){
                String[] spt = record.split(" "); // Enter uid1234 Muzi
                this.stat = Status.valueOf(spt[0]);
                this.id = spt[1];

                if(spt.length == 3) this.nickname = spt[2];
            }

            enum Status{
                Enter, Leave, Change
            }

            @Override
            public String toString(){
                String result = "";

                if(stat != Status.Change)
                    result = nickname + "님이 " + (stat == Status.Leave ? "나갔습니다." : "들어왔습니다.");

                return result;
            }
        }

    }

}
