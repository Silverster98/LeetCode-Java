package com.silvester.LCG;

/**
 * LC680
 */
public class LC680 {

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int posi = -1, posj = -1;
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                posi = i;
                posj = j;
                break;
            }
            i++;
            j--;
        }
        if (posi == -1 || posj == -1) return true;
        
        // System.out.println(posi + " " + posj);
        i = 0;
        j = s.length() - 1;
        boolean tag1 = true, tag2 = true;
        while(i < j) {
            if (i == posi) i++;
            if (s.charAt(i) != s.charAt(j)) {
                tag1 = false;
                break;
            }
            i++;
            j--;
        }

        i = 0;
        j = s.length() - 1;
        while(i < j) {
            if (j == posj) j--;
            if (s.charAt(i) != s.charAt(j)) {
                tag2 = false;
                break;
            }
            i++;
            j--;
        }
        if (tag1 || tag2) return true;
        return false;
    }
}