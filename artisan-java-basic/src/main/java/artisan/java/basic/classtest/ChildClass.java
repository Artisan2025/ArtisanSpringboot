package artisan.java.basic.classtest;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/18 2:05 下午
 */
public class ChildClass extends SupperClass {

    private static String name = getName();

    private String address = getAddress();

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类代码块");
    }

    public ChildClass() {
        System.out.println("子类构造函数");
    }

    private static String getName() {
        System.out.println("子类静态变量");
        return null;
    }

    private String getAddress() {
        System.out.println("子类成员变量");
        return null;
    }
}
