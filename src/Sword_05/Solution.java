package Sword_05;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/22 7:34 下午
 */

public class Solution {

    public String replaceSpace(String s) {
        if (s == null) return null;
        char[] crr = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (char c : crr) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

}
