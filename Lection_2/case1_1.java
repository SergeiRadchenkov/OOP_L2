package Lection_2;

class Doo extends case1_1 {
    public void M() {
        case1_1.count = 123;
    }
}

public class case1_1 {
    public Integer value;

    protected static Integer count;
    public static Integer getCount() {
        return count;
    }

    static {
        count = 0;
    }

    public case1_1() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
