package codility.delivery;

public class two {

    public static void main(String[] args){
        Solution s = new Solution();
        String input = "my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b";
        System.out.println(s.solution(input));
    }

    static class Solution {
        public String solution(String S) {
            // write your code in Java SE 8
            String musicExt = "mp3,aac,flac",
                    imageExt = "jpg,bmp,gif",
                    movieExt = "mp4,avi,mkv";
            int musicBytes = 0, imageBytes = 0, movieBytes = 0, otherBytes = 0;

            String[] splitS = S.split("\n");
            String[] _splitFileName;
            String[] _splitDot;
            String _nowExt;
            int _nowBytes = 0;

            for(String s : splitS){
                _splitFileName = s.split(" ");
                _splitDot = _splitFileName[0].split("\\.");

                _nowExt = _splitDot[_splitDot.length - 1];
                _nowBytes = Integer.parseInt(_splitFileName[1].substring(0, _splitFileName[1].length() - 1));
                if(musicExt.contains(_nowExt)){
                    musicBytes += _nowBytes;
                }else if(imageExt.contains(_nowExt)){
                    imageBytes += _nowBytes;
                }else if(movieExt.contains(_nowExt)){
                    movieBytes += _nowBytes;
                }else{
                    otherBytes += _nowBytes;
                }
            }

            return new StringBuilder("music ").append(musicBytes).append("b\n")
                    .append("images ").append(imageBytes).append("b\n")
                    .append("movies ").append(movieBytes).append("b\n")
                    .append("other ").append(otherBytes).append("b").toString();
        }
    }

}
