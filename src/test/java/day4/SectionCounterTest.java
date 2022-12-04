package day4;

import org.junit.jupiter.api.Test;

import static day4.SectionCounter.countFullOverlap;
import static day4.SectionCounter.countOverlap;
import static org.junit.jupiter.api.Assertions.*;

class SectionCounterTest {

    /**
     * A test with test the result of the example, in the readme of day4
     */
    @Test
    void testCountFullOverlap(){
        var result = countFullOverlap("day4/example.txt");
        assertEquals(2l, result);
    }

    /**
     * A test with test the result of the example, in the readme of day4
     */
    @Test
    void testCountOverlap(){
        var result = countOverlap("day4/example.txt");
        assertEquals(4l, result);
    }
}