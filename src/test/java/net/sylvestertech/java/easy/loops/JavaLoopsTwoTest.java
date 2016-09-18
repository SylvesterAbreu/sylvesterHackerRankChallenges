package net.sylvestertech.java.easy.loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaLoopsTwoTest {

    @Test
    public void queryValueIsGreaterThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(4, 4);
        assertEquals(4, javaLoopsTwo.getQueryValue());
    }

    @Test
    public void queryValueIsEqualToZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(0, 4);
        assertEquals(0, javaLoopsTwo.getQueryValue());
    }

    @Test
    public void queryValueIsMinusOneWhenArgumentPassedIsLessThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(-2, 4);
        assertEquals(-1, javaLoopsTwo.getQueryValue());
    }



    @Test
    public void assertValueAisGreaterThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(1,4);
        assertEquals(4, javaLoopsTwo.getValueA());
    }

    @Test
    public void assertValueAisMinusOneWhenArgumentPassedIsLessThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(4, -5);
        assertEquals(-1, javaLoopsTwo.getValueA());
    }

    @Test
    public void assertValueAisLessThanFifty() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(3, 46);
        assertEquals(46, javaLoopsTwo.getValueA());
    }

    @Test
    public void assertValueAisMinusOneWhenArgumentPassedIsGreaterThanFifty() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(5, 51);
        assertEquals(-1, javaLoopsTwo.getValueA());
    }
}
