package net.sylvestertech.java.easy.loops;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by sylabreu on 17/09/2016.
 */
public class LoopsOne {

    public ByteArrayOutputStream printFirstTenMultiplesOf(final int number) {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for (int count = 1;count <= 10; count++) {
            final int multiplication = number * count;
            System.out.printf("%d%s%d%s%d\n", number, " x ", count, " = ", multiplication);
        }
        return outContent;
    }
}
