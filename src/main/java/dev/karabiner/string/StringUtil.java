package dev.karabiner.string;

public class StringUtil {

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}