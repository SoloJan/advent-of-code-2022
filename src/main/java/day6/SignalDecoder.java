package day6;

import java.util.HashSet;


import static util.FileUtil.readFilePerLine;

public class SignalDecoder {

    public static int findStartOfPacket(String filename){
        return findFirstPacketPosition(readFilePerLine(filename).get(0));
    }

    public static int findStartOfMessage(String filename){
        return findFirstMessagePosition(readFilePerLine(filename).get(0));
    }

    public static int findFirstMessagePosition(String signal){
        var uniqueNrOfCharacters = 14;
        return getMarker(signal, uniqueNrOfCharacters);
    }

    protected static int findFirstPacketPosition(String signal){
        var uniqueNrOfCharacters = 4;
        return getMarker(signal, uniqueNrOfCharacters);
    }

    private static int getMarker(String signal, int uniqueNrOfCharacters) {
        var chars = signal.toCharArray();
        for(int i = uniqueNrOfCharacters; i<chars.length; i++){
            var set = new HashSet<>();
             for(int j = 0; j< uniqueNrOfCharacters; j++){
                 set.add(chars[i-j]);
                 if(set.size() == uniqueNrOfCharacters){
                     return i +1;
                 }
             }
        }
        return 0;
    }



}
