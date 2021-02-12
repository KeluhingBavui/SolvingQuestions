package LeetCode;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        s = s.trim();
        t = t.trim();
        if (s.length()==t.length()) {
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chart);
            String S = Arrays.toString(chars);
            String T = Arrays.toString(chart);
            if (S.equalsIgnoreCase(T)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
