package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void aufgabeTest(){
        //given
        boolean boolTrue = true;
        //when
        boolean actual = Main.aufgabeBool(boolTrue);
        //then
        assertTrue(actual);
    }

}