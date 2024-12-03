package org.miu;

public class MinimumCharacter {

    public static char minChar(String x) {
        if (x == null || x.isEmpty()) {
            throw new IllegalArgumentException("Value can't be null or empty!");
        }
        return findMinChar(x, 1, x.charAt(0));
    }

    private static char findMinChar(String x, int index, char currentMin) {
        if (index == x.length()) {
            return currentMin;
        }
        if (x.charAt(index) < currentMin) {
            currentMin = x.charAt(index);
        }
        return findMinChar(x, index + 1, currentMin);
    }

    public static void main(String[] args) {
        System.out.println("Minimum character: " + minChar("akel")); // Output: 'a'
    }
}

