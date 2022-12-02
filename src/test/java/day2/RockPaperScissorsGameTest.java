package day2;

import org.junit.jupiter.api.Test;

import static day2.RockPaperScissorsGame.optimisedPlay;
import static day2.RockPaperScissorsGame.play;
import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsGameTest {

    /**
     * A test with test the result of the example, in the readme of day2
     */
    @Test
    void testInitialGame(){
        var result = play("day2/example.txt");
        assertEquals(15, result);
    }

    /**
     * A test with test the result of the example, in the readme of day2
     */
    @Test
    void testOptimizedStrategy(){
        var result = optimisedPlay("day2/example.txt");
        assertEquals(12, result);
    }


}