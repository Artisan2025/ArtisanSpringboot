package artisan.java.basic.classtest;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/18 1:59 下午
 */
public class SupperClass {

    public SupperClass() {
        System.out.println("父类构造函数");
    }

    {
        System.out.println("父类代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }

    private static String name = getName();

    private String address = getAddress();

    private static String getName() {
        System.out.println("父类静态变量");
        return null;
    }

    private String getAddress() {
        System.out.println("父类成员变量");
        return null;
    }


}
