package com.main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArrayInSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {4,2,5,1,6,3,9,7};
        int[] arr2 = new int[] {11,10,15,12,61,13,19,71};
        int[] resultant = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(resultant));
    }
}
