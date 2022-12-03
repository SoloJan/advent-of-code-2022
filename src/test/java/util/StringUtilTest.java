package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static util.StringUtil.getOverlappingCharacter;
import static util.StringUtil.getPositionInAlphabet;
import static util.StringUtil.hexToBinaryString;

class StringUtilTest {

    @Test
    void hexToBinaryStringTest() {
        assertEquals("110100101111111000101000", hexToBinaryString("D2FE28"));
        assertEquals("00111000000000000110111101000101001010010001001000000000", hexToBinaryString("38006F45291200"));
        assertEquals( "11101110000000001101010000001100100000100011000001100000", hexToBinaryString("EE00D40C823060"));
    }

    @Test
    void positionInAlphabetTest(){
        assertEquals(1, getPositionInAlphabet('A'));
        assertEquals(26, getPositionInAlphabet('z'));
    }

    @Test
    void overLapTest(){
        var overLap = getOverlappingCharacter("Jan", "jack");
        assertEquals(1, overLap.size());
        assertTrue(overLap.contains('a'));
    }

}