package day2;

import java.util.function.BiFunction;

import static util.FileUtil.readFilePerLine;

public class RockPaperScissorsGame {
    
    public static int play(String filename) {
        return play(filename, (opponent, me) -> RockPaperScissors.toEnum(me));
    }

    public static int optimisedPlay(String filename) {
        return play(filename, (opponent, strategy) -> whatToPlay(opponent, strategy));
    }
    
    private static int play(String filename, BiFunction<RockPaperScissors, Character, RockPaperScissors> function) {
        int sum = 0;
        for(String round: readFilePerLine(filename)){
            RockPaperScissors toPlay =  function.apply(RockPaperScissors.toEnum(round.charAt(0)), round.charAt(2));
            sum+=  pointsPerRound(RockPaperScissors.toEnum(round.charAt(0)), toPlay);
        }
        return sum;
    }

    private static int pointsPerRound(RockPaperScissors opponent, RockPaperScissors me){
        RockPaperScissorsComparator comparator = new RockPaperScissorsComparator();
        return comparator.compare(opponent, me) + me.getPoints();
    }

    private static RockPaperScissors whatToPlay(RockPaperScissors opponent, char strategy){
        if(opponent == RockPaperScissors.ROCK){
            if(strategy == 'X'){
                return RockPaperScissors.SCISSORS;
            }
            if(strategy == 'Z'){
                return RockPaperScissors.PAPER;
            }
        }
        if(opponent == RockPaperScissors.PAPER){
            if(strategy == 'X'){
                return RockPaperScissors.ROCK;
            }
            if(strategy == 'Z'){
                return RockPaperScissors.SCISSORS;
            }
        }
        if(opponent == RockPaperScissors.SCISSORS){
            if(strategy == 'X'){
                return RockPaperScissors.PAPER;
            }
            if(strategy == 'Z'){
                return RockPaperScissors.ROCK;
            }
        }
        return opponent;
    }
    
}
