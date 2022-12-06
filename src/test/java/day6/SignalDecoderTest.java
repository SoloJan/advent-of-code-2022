package day6;

import org.junit.jupiter.api.Test;

import static day6.SignalDecoder.findFirstPacketPosition;
import static day6.SignalDecoder.findFirstMessagePosition;
import static org.junit.jupiter.api.Assertions.*;

class SignalDecoderTest {

    @Test
    void findPacketTest() {
        assertEquals(5, findFirstPacketPosition("bvwbjplbgvbhsrlpgdmjqwftvncz"));
        assertEquals(6, findFirstPacketPosition("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(10, findFirstPacketPosition("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(11, findFirstPacketPosition("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }

    @Test
    void findMessageTest() {
        assertEquals(23, findFirstMessagePosition("bvwbjplbgvbhsrlpgdmjqwftvncz"));
        assertEquals(23, findFirstMessagePosition("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(29, findFirstMessagePosition("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(26, findFirstMessagePosition("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }

}