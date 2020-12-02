package artisan.java.basic.array;

import java.util.Arrays;

/**
 * @author puxianfeng
 * @description
 * @date 2020/8/12 11:34 上午
 */
public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] copyArr = Arrays.copyOf(arr, 2);
        // [1, 2]
        System.out.println(Arrays.toString(copyArr));

        int[] copyArr1 = Arrays.copyOf(arr, 4);
        // [1, 2, 3, 0]
        System.out.println(Arrays.toString(copyArr1));
        
    }
}
