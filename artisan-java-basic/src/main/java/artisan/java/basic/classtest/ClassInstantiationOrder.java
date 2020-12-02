package artisan.java.basic.classtest;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/18 2:08 下午
 */
public class ClassInstantiationOrder {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

        A a = new B();
        System.out.println(a.x);
        System.out.println(a.y);
        a.m();
        // 00B

    }
}
