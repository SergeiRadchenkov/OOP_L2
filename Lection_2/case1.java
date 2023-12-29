package Lection_2;

public class case1 {

    void A() {
        System.out.println("A()");
    }

    public static void main(String[] args) {

        case1 prog = new case1();
        prog.A();

        case1_1 f1 = new case1_1();
        f1.value = 123;
        System.out.println(f1.value);
        f1.printCount();

        case1_1 f2 = new case1_1();
        f2.value = 222;
        System.out.println(f2.value);
        f2.printCount();

        case1_1 f3 = new case1_1();
        f3.value = 444;
        System.out.println(f3.value);
        f3.printCount();
    }
}
