package artisan.java.basic.classtest;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/19 10:00 上午
 */
public class B extends A {

    public int x = 1;

    public static int y = 1;

    public void m() {
        System.out.println("B");
    }

    public void m(String name) {
        System.out.println("B 重载方法");
    }
}
