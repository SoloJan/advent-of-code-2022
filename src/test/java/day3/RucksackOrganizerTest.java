package day3;

import org.junit.jupiter.api.Test;

import static day3.RucksackOrganizer.findSumOfOverlappingItems;
import static day3.RucksackOrganizer.findSumOfGroupBadges;
import static org.junit.jupiter.api.Assertions.*;

class RucksackOrganizerTest {

    /**
     * A test with test the result of the example, in the readme of day3
     */
    @Test
    void testFindSumOfOverlappingItems(){
        var result = findSumOfOverlappingItems("day3/example.txt");
        assertEquals(157, result);
    }

    /**
     * A test with test the result of the example, in the readme of day3
     */
    @Test
    void testFindSumOfBadges(){
        var result = findSumOfGroupBadges("day3/example.txt");
        assertEquals(70, result);
    }


}