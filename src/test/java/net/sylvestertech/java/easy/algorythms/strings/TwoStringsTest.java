package net.sylvestertech.java.easy.algorythms.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TwoStringsTest {

    @Test
    public void shouldHaveCommonSubstrings() {
        assertEquals(2, TwoStrings.haveCommonSubStrings("Hello", "World"));
    }
}
