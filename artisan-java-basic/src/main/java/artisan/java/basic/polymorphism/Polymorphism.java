package artisan.java.basic.polymorphism;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/19 11:39 上午
 */
public class Polymorphism {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        a1.show(b); // A and A
        a1.show(c); // A and A
        a1.show(d); // A and D

        a2.show(b); // B and A
        a2.show(c); // B and A
        a2.show(d); // A and D

        b.show(b); // B and B
        b.show(c); // B and B
        b.show(d); // A and D
    }


    /**
     * @author puxianfeng
     * @description
     * @date 2020/8/19 11:35 上午
     */
    public static class A {

        public void show(D obj) {
            System.out.println("A and D");
        }

        public void show(A obj) {
            System.out.println("A and A");
        }
    }

    /**
     * @author puxianfeng
     * @description
     * @date 2020/8/19 11:35 上午
     */
    public static class B extends A {

        public void show(B obj) {
            System.out.println("B and B");
        }

        @Override
        public void show(A obj) {
            System.out.println("B and A");
        }
    }

    /**
     * @author puxianfeng
     * @description
     * @date 2020/8/19 11:35 上午
     */
    public static class C extends B {
    }

    /**
     * @author puxianfeng
     * @description
     * @date 2020/8/19 11:35 上午
     */
    public static class D extends B {
    }
}
