package testingPackage;

public class CountingClass {
    private static int staticVar = 0;
    private int instanceVar;

    public CountingClass() {
        staticVar++;
        instanceVar = 0;
    }

    public CountingClass(int v) {
        staticVar++;
        instanceVar = v;
    }

    public void grow() {
        staticVar++;
        instanceVar++;
    }

    public void grow(int inc) {
        staticVar += inc;
        instanceVar += inc;
    }

    public String toString() {
        return "static: " + staticVar + ", instance: " + instanceVar;

    }
}