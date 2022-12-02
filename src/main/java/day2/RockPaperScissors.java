package day2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RockPaperScissors {

    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private final int points;

    public static RockPaperScissors toEnum(char character){
        switch (character){
            case 'X':
            case 'A':
                return ROCK;
            case 'Y':
            case 'B':
                return PAPER;
            case 'Z':
            case 'C':
                return SCISSORS;
            default:
                throw new RuntimeException("Invalid character");
        }
    }
}
