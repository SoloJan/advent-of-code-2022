package day5;

import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Stack;

@UtilityClass
public class StackFactory {

    /**
     *                 [M]     [W] [M]
     *             [L] [Q] [S] [C] [R]
     *             [Q] [F] [F] [T] [N] [S]
     *     [N]     [V] [V] [H] [L] [J] [D]
     *     [D] [D] [W] [P] [G] [R] [D] [F]
     * [T] [T] [M] [G] [G] [Q] [N] [W] [L]
     * [Z] [H] [F] [J] [D] [Z] [S] [H] [Q]
     * [B] [V] [B] [T] [W] [V] [Z] [Z] [M]
     *
     * @return
     */

    public static HashMap createPuzzleInputStack(){
        var map = new HashMap<>();
        map.put(1, createStack("BZT"));
        map.put(2, createStack("VHTDN"));
        map.put(3, createStack("BFMD"));
        map.put(4, createStack("TJGWVQL"));
        map.put(5, createStack("WDGPVFQM"));
        map.put(6, createStack("VZQGHFS"));
        map.put(7, createStack("ZSNRLTCW"));
        map.put(8, createStack("ZHWDJNRM"));
        map.put(9, createStack("MQLFDS"));
        return map;
    }

    /**
     *
     *     [D]
     * [N] [C]
     * [Z] [M] [P]
     *
     * @return
     */
    public static HashMap createPuzzleExampleStack(){
        var map = new HashMap<>();
        map.put(1, createStack("ZN"));
        map.put(2, createStack("MCD"));
        map.put(3, createStack("P"));
        return map;
    }

    private static Stack<Character> createStack(String string) {
        Stack stack = new Stack();
        var chars = string.toCharArray();
        for(char character: chars){
            stack.push(character);
        }
        return stack;
    }



}
