package net.sylvestertech.java.easy.loops;

public class JavaLoopsTwo {

    private final int queryValue;

    public JavaLoopsTwo(int queryValue) {
        this.queryValue = queryValue;
    }

    public int getQueryValue() {
        return queryValue >= 0 ? queryValue : -1;
    }
}
