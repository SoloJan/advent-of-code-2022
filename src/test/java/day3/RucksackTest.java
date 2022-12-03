package day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RucksackTest {

    @Test
    void testConstructor(){
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        assertEquals("vJrwpWtwJgWrhcsFMMfFFhFp", rucksack.getContent());
        assertEquals("vJrwpWtwJgWr", rucksack.getFirstCompartment());
        assertEquals("hcsFMMfFFhFp", rucksack.getSecondCompartment());
    }

}