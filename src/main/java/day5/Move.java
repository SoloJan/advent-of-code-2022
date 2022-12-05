package day5;

import lombok.Data;

@Data
public class Move {

    private int amount;
    private int from;
    private int to;

    public Move(String move){
        var splitMove = move.split(" ");
        amount =  Integer.valueOf(splitMove[1]);
        from =  Integer.valueOf(splitMove[3]);
        to = Integer.valueOf(splitMove[5]);
    }

}
