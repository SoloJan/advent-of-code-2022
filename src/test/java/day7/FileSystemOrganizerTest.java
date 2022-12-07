package day7;

import org.junit.jupiter.api.Test;

import static day7.FileSystemOrganizer.findSumOfSmallDirectories;
import static day7.FileSystemOrganizer.findMinimalSpaceToFreeUp;
import static org.junit.jupiter.api.Assertions.*;

class FileSystemOrganizerTest {

    @Test
    void findSumOfSmallDirectoriesTest() {
        var result = findSumOfSmallDirectories("day7/example.txt");
        assertEquals(95437l, result);
    }

    @Test
    void findMinimalSpaceToFreeUpTest() {
        var result = findMinimalSpaceToFreeUp("day7/example.txt");
        assertEquals(24933642l, result);
    }
}