package net.sylvestertech.java.easy.loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaLoopsTwoTest {

    @Test
    public void queryValueIsGreaterThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(4, 4, 9);
        assertEquals(4, javaLoopsTwo.getQueryValue());
    }

    @Test
    public void queryValueIsEqualToZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(0, 4, 9);
        assertEquals(0, javaLoopsTwo.getQueryValue());
    }

    @Test
    public void queryValueIsMinusOneWhenArgumentPassedIsLessThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(-2, 4, 9);
        assertEquals(-1, javaLoopsTwo.getQueryValue());
    }



    @Test
    public void assertValueAisGreaterThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(1,4, 9);
        assertEquals(4, javaLoopsTwo.getValueA());
    }

    @Test
    public void assertValueAisMinusOneWhenArgumentPassedIsLessThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(4, -5, 9);
        assertEquals(-1, javaLoopsTwo.getValueA());
    }

    @Test
    public void assertValueAisLessThanFifty() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(3, 46, 9);
        assertEquals(46, javaLoopsTwo.getValueA());
    }

    @Test
    public void assertValueAisMinusOneWhenArgumentPassedIsGreaterThanFifty() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(5, 51, 9);
        assertEquals(-1, javaLoopsTwo.getValueA());
    }


    @Test
    public void assertValueBisGreaterThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(2, 6, 9);
        assertEquals(9, javaLoopsTwo.getValueB());
    }

    @Test
    public void assertValueBisMinusOneWhenArgumentPassedIsLessThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(3, 5, -8);
        assertEquals(-1, javaLoopsTwo.getValueB());
    }

    @Test
    public void assertValueBisLessThanFifty() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(1, 2, 48);
        assertEquals(48, javaLoopsTwo.getValueB());
    }

    @Test
    public void assertValueBisMinusOneWhenArgumentPassedIsGreaterThanFifty() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(1, 2, 67);
        assertEquals(-1, javaLoopsTwo.getValueB());
    }
}
