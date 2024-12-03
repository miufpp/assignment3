package org.miu;

public class MaxArrayVal {

        public static int findMaxVal(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array can't be null or empty");
            }
            return retrieveMax(arr, 0, Integer.MIN_VALUE);
        }

        private static int retrieveMax(int[] arr, int index, int currentMax) {
            if (index == arr.length) {
                return currentMax;
            }
            currentMax = Math.max(arr[index], currentMax);
            return retrieveMax(arr, index + 1, currentMax);
        }

        public static void main(String[] args) {
            int max = findMaxVal(new int[]{5, -3, 6, 1, 9, 4});
            System.out.println("Maximum value: " + max); // Output: 9
        }
}
