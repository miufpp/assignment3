package org.miu;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(1111));
    }

    public static boolean checkPalindrome(int s) {
        String intString = Integer.toString(s);
        return isPalindrome(intString,0,intString.length()-1);
    }

    public static boolean isPalindrome(String x,int start, int end) {
        if(start >= end) return true;
        if(x.charAt(start) != x.charAt(end)) return false;
        return isPalindrome(x,start+1,end -1);
    }
}
