package util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringUtil {

    public static List<Character> ALPHABET = Arrays.asList('A', 'B', 'C', 'D',  'E', 'F', 'G', 'H', 'I' , 'J' , 'K' ,'L' , 'M' , 'N', 'O' , 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

    public static List<Integer> toIntegerList(String string){
        return toCharacterList(string).stream().map(c -> Character.getNumericValue(c)).collect(Collectors.toList());
    }

    public static List<Long> toLongList(String string){
        return toCharacterList(string).stream().map(c -> Long.valueOf(Character.getNumericValue(c))).collect(Collectors.toList());
    }

    public static List<Character> toCharacterList(String string){
        return string.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
    }

    public static Set<Character> toCharacterSet(String string){
        return string.chars().mapToObj(e -> (char)e).collect(Collectors.toSet());
    }


    public static String toString(List<Character> characters){
        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static String hexToBinaryString(String hex) {
        hex = hex.replaceAll("0", "0000");
        hex = hex.replaceAll("1", "0001");
        hex = hex.replaceAll("2", "0010");
        hex = hex.replaceAll("3", "0011");
        hex = hex.replaceAll("4", "0100");
        hex = hex.replaceAll("5", "0101");
        hex = hex.replaceAll("6", "0110");
        hex = hex.replaceAll("7", "0111");
        hex = hex.replaceAll("8", "1000");
        hex = hex.replaceAll("9", "1001");
        hex = hex.replaceAll("A", "1010");
        hex = hex.replaceAll("B", "1011");
        hex = hex.replaceAll("C", "1100");
        hex = hex.replaceAll("D", "1101");
        hex = hex.replaceAll("E", "1110");
        hex = hex.replaceAll("F", "1111");
        return hex;
    }

    public static Set<Character> getOverlappingCharacter(String firstWord, String secondWord){
        var interSection = toCharacterSet(firstWord);
        interSection.retainAll(toCharacterSet(secondWord));
        return interSection;
    }

    public static int getPositionInAlphabet(Character c){
        return ALPHABET.indexOf(Character.toUpperCase(c)) + 1;
    }

}
