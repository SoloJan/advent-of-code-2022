package day2;

import java.util.Comparator;

public class RockPaperScissorsComparator implements Comparator<RockPaperScissors> {

    @Override
    public int compare(RockPaperScissors o1, RockPaperScissors o2) {
        if(o1==o2){
            return 3;
        }
        if(o1==RockPaperScissors.ROCK && o2 == RockPaperScissors.PAPER){
            return 6;
        }
        if(o1==RockPaperScissors.PAPER && o2 == RockPaperScissors.SCISSORS){
            return 6;
        }
        if(o1==RockPaperScissors.SCISSORS && o2 == RockPaperScissors.ROCK){
            return 6;
        }
        return 0;
    }
}
