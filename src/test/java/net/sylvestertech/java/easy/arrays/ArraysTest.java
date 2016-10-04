package net.sylvestertech.java.easy.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void assertLeftRotation() throws Exception {
        final int[] array = { 1, 2, 3, 4, 5 };
        final Arrays arrays = new Arrays();
        int[] modifiedArray = arrays.getLeftRotation(array, 4);

        assertEquals(5, modifiedArray[0]);
        assertEquals(1, modifiedArray[1]);
        assertEquals(2, modifiedArray[2]);
        assertEquals(3, modifiedArray[3]);
        assertEquals(4, modifiedArray[4]);
    }
}
