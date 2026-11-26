package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 7};
        BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
