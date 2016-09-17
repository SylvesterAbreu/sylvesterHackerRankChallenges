package net.sylvestertech.java.easy.outputFormatting;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class JavaOutputFormattingTest {

    @Test
    public void printOutHelloAndSixtyWithThreeDigitsWhenTwoDigitsProvided() throws Exception {

        final JavaOutputFormatter javaOutputFormatter = new JavaOutputFormatter();
        final ByteArrayOutputStream outContent = javaOutputFormatter.printTextAndIntegerWithThreeDigits("Hello", 60);

        assertEquals("Hello 060", outContent.toString());
    }

}
