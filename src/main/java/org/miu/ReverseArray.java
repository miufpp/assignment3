package org.miu;

import java.util.Arrays;

public class ReverseArray {
    public static  void main(String[] args) {
        int[] arr = {1, 3, 5, -7, 9, 13};
        System.out.println(Arrays.toString(reverseHelper(arr, 0, arr.length - 1)));
    }

    private static int[] reverseHelper(int[] arr,int start,int end) {
        if(start >= end) return arr;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseHelper(arr,start+1,end -1);
    }
}
