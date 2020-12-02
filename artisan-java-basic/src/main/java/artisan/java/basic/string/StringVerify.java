package artisan.java.basic.string;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/4 5:11 下午
 */
public class StringVerify {

    // StringBuffer

    // StringBuilder

    public static void main(String[] args) {
        String str1 = "hi, " + "lao wang";
        String str2 = "hi, lao wang";
        System.out.println(str1 == str2);

        String str = "laowang";
        str.substring(0,1);
        System.out.println(str);

        String s1 = "hi," + "lao" + "wang";
        String s2 = "hi,";
        s2 += "lao";
        s2 += "wang";
        String s3 = "hi,laowang";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.identityHashCode(str);
        change(str);
        System.out.println("===============");

        //stringBufferTest();
        System.out.println("==============");
        stringBuilderTest();

    }

    public static void change(String a) {

        a = "xiaowang";
    }

    public static void stringBufferTest() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    stringBuffer.append("a");
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.length());
    }

    public static void stringBuilderTest() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    stringBuilder.append("a");
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder.length());
    }

}
