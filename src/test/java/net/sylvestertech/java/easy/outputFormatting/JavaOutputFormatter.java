package net.sylvestertech.java.easy.outputFormatting;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JavaOutputFormatter {

    public ByteArrayOutputStream printTextAndIntegerWithThreeDigits(final String string, final int integer) {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.out.printf(string + " %03d", integer);
        return outContent;
    }
}
