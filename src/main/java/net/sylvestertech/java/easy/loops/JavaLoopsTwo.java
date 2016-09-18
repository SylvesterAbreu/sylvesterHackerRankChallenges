package net.sylvestertech.java.easy.loops;

public class JavaLoopsTwo {

    private final int queryValue;
    private final int valueA;

    public JavaLoopsTwo(int queryValue, int valueA) {
        this.queryValue = queryValue;
        this.valueA = valueA;
    }

    public int getQueryValue() {
        return queryValue >= 0 ? queryValue : -1;
    }

    public int getValueA() {
        if (valueA < 0)
            return -1;
        return valueA;
    }
}
