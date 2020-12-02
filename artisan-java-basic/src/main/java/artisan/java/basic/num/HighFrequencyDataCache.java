package artisan.java.basic.num;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/4 4:15 下午
 */
public class HighFrequencyDataCache {

    /*
    Boolean：使用静态 final 定义，就会返回静态值
    Byte：缓存区 -128~127
    Short：缓存区 -128~127
    Character：缓存区 0~127
    Long：缓存区 -128~127
    Integer：缓存区 -128~127
    */

    /*
    Float 和 Double 不会有缓存，其他包装类都有缓存。

    Integer 是唯一一个可以修改缓存范围的包装类，在 VM options 加入参数：
            -XX:AutoBoxCacheMax=666 即修改缓存最大值为 666
    */

    public static void main(String[] args) {
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println("值127 num1==num2 => " + (num1 == num2));

        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println("值127 num3==num4 => " + (num3 == num4));
    }
}
