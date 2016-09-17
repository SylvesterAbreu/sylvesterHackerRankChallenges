package net.sylvestertech.java.easy.outputFormatting;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class JavaOutputFormattingTest {

    @Test
    public void printOutFifteenCharactersOfStringAndThreeDigits() throws Exception {

        final JavaOutputFormatter javaOutputFormatter = new JavaOutputFormatter();
        final ByteArrayOutputStream outContent = javaOutputFormatter.printTextAndIntegerWithThreeDigits("Hello", 60);

        assertEquals("Hello          060", outContent.toString());
    }

    @Test
    public void printOutFifteenCharactersOfStringAndThreeDigitsWhenOneDigitIsPassedAsSecondArgument() throws Exception {
        final JavaOutputFormatter javaOutputFormatter = new JavaOutputFormatter();
        final ByteArrayOutputStream outContent = javaOutputFormatter.printTextAndIntegerWithThreeDigits("Ola", 4);

        assertEquals("Ola            004", outContent.toString());
    }
}
