package artisan.java.basic.foreach;

/**
 * @author puxianfeng
 * @description 跳出双循环
 * @date 2020/8/4 3:38 下午
 */
public class BreakDoubleLoop {

    public static void functionOne() {
        aliasFor:for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("I:" + i + "---" + "J:" + j);
                if (j == 10) {
                    break aliasFor;
                }
            }
        }
    }

    public static void functionTwo() {
        boolean flag = true;
        for (int i = 0; i < 100 && flag; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("I:" + i + "---" + "J:" + j);
                if (j == 10) {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        //functionOne();
        //functionTwo();
    }
}
