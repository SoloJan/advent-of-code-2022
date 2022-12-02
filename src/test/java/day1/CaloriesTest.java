package day1;

import org.junit.jupiter.api.Test;

import static day1.Calories.caloriesOfTopThree;
import static day1.Calories.mostCalories;
import static org.junit.jupiter.api.Assertions.*;

class CaloriesTest {

    /**
     * A test with test the result of the example, in the readme of day1
     */
    @Test
    void testMostCalories(){
        var result= mostCalories("day1/example.txt");
        assertEquals(  24000, result);
    }

    /**
     * A test with test the result of the example, in the readme of day1
     */
    @Test
    void testTopThreeCalories(){
        var result= caloriesOfTopThree("day1/example.txt");
        assertEquals(45000, result);
    }

}