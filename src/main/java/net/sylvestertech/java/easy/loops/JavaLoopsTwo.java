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
        return valueA < 0 || valueA > 50 ? -1 : valueA;
    }

    public int getValueB() {
        return valueB < 0 ? -1: valueB;
    }
}
