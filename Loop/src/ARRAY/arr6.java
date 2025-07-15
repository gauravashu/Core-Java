package ARRAY;

import java.util.Arrays;

public class arr6 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 85, 9, 6};
        int[] dup = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dup[i] = arr[i];
        }
        System.out.println(Arrays.toString(dup));
        System.out.println(arr==dup);
    }
}
