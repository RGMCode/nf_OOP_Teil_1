package RGMCode;

import RGMCode.model.Student;
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

    @Test
    void checkObjectsEqual(){
        Student rene = new Student(1234, "mengedoth", "René");
        Student rene2 = new Student(1234, "mengedoth", "René");
        assertTrue(rene.equals(rene2));
    }

    @Test
    void checkObjectsNotEqual(){
        Student rene = new Student(1234, "mengedoth", "René");
        Student rene2 = new Student(1235, "mengedoth", "René");
        assertFalse(rene.equals(rene2));
    }

}