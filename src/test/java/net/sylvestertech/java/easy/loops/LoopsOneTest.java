package net.sylvestertech.java.easy.loops;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class LoopsOneTest {

    @Test
    public void printOutFirstTenMultiplesOfAnyInteger() throws Exception {
        final LoopsOne loopsOne = new LoopsOne();
        final ByteArrayOutputStream outContent = loopsOne.printFirstTenMultiplesOf(2);

        final String expected =  "2 x 1 = 2\n"
                        + "2 x 2 = 4\n"
                        + "2 x 3 = 6\n"
                        + "2 x 4 = 8\n"
                        + "2 x 5 = 10\n"
                        + "2 x 6 = 12\n"
                        + "2 x 7 = 14\n"
                        + "2 x 8 = 16\n"
                        + "2 x 9 = 18\n"
                        + "2 x 10 = 20\n";

        assertEquals(expected, outContent.toString());
    }
}
