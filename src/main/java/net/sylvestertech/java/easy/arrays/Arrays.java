package net.sylvestertech.java.easy.arrays;

class Arrays {

    int[] getLeftRotation(int[] array, int k) {
        int [] tempArray = array;
        for (int j = 0; j < k; j++ ) {
            tempArray = doLeftRotation(tempArray);
        }
        return array;
    }

    private int[] doLeftRotation(int[] array) {
        final int tempValue = array[0];
        int [] tempArray = moveValuesToTheRight(array);
        tempArray[tempArray.length - 1] = tempValue;
        return tempArray;
    }

    private int[] moveValuesToTheRight(int[] array) {
        int [] tempArray = array;
        for (int i = 1; i < tempArray.length; i++) {
            tempArray[i - 1] = array[i];
        }
        return tempArray;
    }
}
