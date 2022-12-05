package day5;

import org.junit.jupiter.api.Test;

import static day5.CrateMover.moveCrates;
import static day5.CrateMover.moveMultipleCratesAtOnce;
import static org.junit.jupiter.api.Assertions.*;

class CrateMoverTest {

    @Test
    void moveCratesTest() {
        var result = moveCrates("day5/example.txt", StackFactory.createPuzzleExampleStack());
        assertEquals("CMZ", result);
    }

    @Test
    void moveMultipleCratesAtOnceTest() {
        var result = moveMultipleCratesAtOnce("day5/example.txt", StackFactory.createPuzzleExampleStack());
        assertEquals("MCD", result);
    }
}