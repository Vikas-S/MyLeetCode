package Sword_50;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 7:37 下午
 */

public class Solution {

    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0) return ' ';
        short[] set = new short[128]; // ASCII码只有128个字符
        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (set[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

}
