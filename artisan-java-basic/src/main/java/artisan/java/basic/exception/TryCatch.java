package artisan.java.basic.exception;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/12 10:16 上午
 */
public class TryCatch {

    public static void main(String[] args) {
        int number = getNumber();
        System.out.println(number);
    }

    public static int getNumber() {
        try {
            int number = 0 / 1;
            return 2;
        } finally {
            return 3;
        }
    }
}
