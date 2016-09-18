package net.sylvestertech.java.easy.loops;

public class JavaLoopsTwo {

    private final int queryValue;
    private final int valueA;
    private final int valueB;

    public JavaLoopsTwo(int queryValue, int valueA, int valueB) {
        this.queryValue = queryValue;
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public int getQueryValue() {
        return queryValue >= 0 ? queryValue : -1;
    }

    public int getValueA() {
        return returnMinusOneIfValueIsLessThanZeroAndGreaterThanFiftyOtherwiseReturnValue(valueA);
    }

    public int getValueB() {
        return returnMinusOneIfValueIsLessThanZeroAndGreaterThanFiftyOtherwiseReturnValue(valueB);
    }

    private int returnMinusOneIfValueIsLessThanZeroAndGreaterThanFiftyOtherwiseReturnValue(final int value) {
        return value < 0 || value > 50 ? -1 : value;
    }
}
