package day4;

import org.junit.jupiter.api.Test;

import static day4.Day4.exercise1;
import static day4.Day4.exercise2;
import static org.junit.jupiter.api.Assertions.*;

class Day4Test {

    /**
     * A test with test the result of the example, in the readme of day3
     */
    @Test
    void testExercise1(){
        var result = exercise1("day4/example.txt");
        assertEquals(0l, result);
    }

    /**
     * A test with test the result of the example, in the readme of day3
     */
    @Test
    void testExercise2(){
        var result = exercise2("day4/example.txt");
        assertEquals(0l, result);
    }
}