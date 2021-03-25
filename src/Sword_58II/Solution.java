package Sword_58II;

/**
 * @author vikas
 * @version 1.0
 * @description: TODO
 * @date 2021/3/20 10:03 下午
 */

public class Solution {

    // 先分别旋转每个单词，然后再旋转整个字符串
    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int i = 0, j = 0;
        while (j <= length) {
            if (j == n || j == length) {
                reverse(chars, i, j - 1);
                i = j;
            }
            j++;
        }
        reverse(chars, 0, length - 1);
        return new String(chars);
    }

    public void reverse(char[] crr, int i, int j) {
        while (i < j) {
            swap(crr, i++, j--);
        }
    }

    public void swap(char[] crr, int i, int j) {
        char tmp = crr[i];
        crr[i] = crr[j];
        crr[j] = tmp;
    }
}
