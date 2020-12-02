package artisan.java.basic.clone;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/19 11:23 上午
 */
public class CloneTest implements Cloneable {

    int num;

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct1 = new CloneTest();
        ct1.num = 666;
        System.out.println(ct1.num);

        CloneTest ct2 = (CloneTest)ct1.clone();
        System.out.println(ct2.num);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
