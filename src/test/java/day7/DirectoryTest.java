package day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {

    @Test
    void testDirectory(){
        Directory root = new Directory();
        root.addChild("dir subfolder");
        root.addChild("dir subfolder2");
        root.addChild("5 fileOf5kb");
        root.getChild("subfolder").addChild("8 fileOf8kb");
        var subFolder2 = root.getChild("subfolder2");
        subFolder2.addChild("dir subsubfolder");
        subFolder2.getChild("subsubfolder").addChild("2 fileOf2kb");
        assertEquals(15l, root.getSize());

    }


}