package net.sylvestertech.java.easy.outputFormatting;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Before;
import org.junit.Test;

public class JavaOutputFormattingTest {

    private JavaOutputFormatter javaOutputFormatter;

    @Before
    public void setup() throws Exception {
        javaOutputFormatter = new JavaOutputFormatter();
    }

    @Test
    public void printOutFifteenCharactersOfStringAndThreeDigitsWhenTwoDigitsArePassedAsSecondArgument() throws Exception {
        final ByteArrayOutputStream outContent = javaOutputFormatter.printTextAndIntegerWithThreeDigits("Hello", 60);
        assertEquals("Hello          060", outContent.toString());
    }

    @Test
    public void printOutFifteenCharactersOfStringAndThreeDigitsWhenOneDigitIsPassedAsSecondArgument() throws Exception {
        final ByteArrayOutputStream outContent = javaOutputFormatter.printTextAndIntegerWithThreeDigits("Ola", 4);
        assertEquals("Ola            004", outContent.toString());
    }
}
