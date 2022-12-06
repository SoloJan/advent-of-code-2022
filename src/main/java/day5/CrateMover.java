package day5;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static util.FileUtil.readFilePerLine;

public class CrateMover {

    public static String moveCrates(String fileName, HashMap<Integer, Stack<Character>> stacks){
        return getTopOfStacksAfterMoving(fileName, stacks, (stackMap, moves) -> move(stackMap, moves)) ;
    }

    public static String moveMultipleCratesAtOnce(String fileName, HashMap<Integer, Stack<Character>> stacks){
        return getTopOfStacksAfterMoving(fileName, stacks, (stackMap, moves) -> moveMultiple(stackMap, moves)) ;
    }

    private static String getTopOfStacksAfterMoving(String fileName, HashMap<Integer, Stack<Character>> stacks, BiConsumer<HashMap<Integer, Stack<Character>>, Move> function) {
        List<Move> moves = readFilePerLine(fileName).stream().map(Move::new).collect(Collectors.toList());
        moves.forEach( move -> function.accept(stacks, move));
        StringBuilder sb = new StringBuilder();
        for(var entry:  stacks.entrySet()){
            sb.append(entry.getValue().peek());
        }
        return sb.toString();
    }

    public static void move(HashMap<Integer, Stack<Character>> stacks, Move move){
        moveBetweenStacks(stacks.get(move.getFrom()), stacks.get(move.getTo()), move.getAmount());
    }

    public static void moveMultiple(HashMap<Integer, Stack<Character>> stacks, Move move){
        Stack<Character> tempStack = new Stack<>();
        moveBetweenStacks(stacks.get(move.getFrom()), tempStack, move.getAmount());
        moveBetweenStacks(tempStack, stacks.get(move.getTo()), move.getAmount());
    }

    private static void moveBetweenStacks(Stack<Character> from, Stack<Character> to, int amount) {
        for(int i = 0; i< amount; i++){
           to.push(from.pop());
        }
    }

}
