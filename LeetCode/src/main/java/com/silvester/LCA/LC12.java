package com.silvester.LCA;

/**
 * LC12
 */
public class LC12 {

    public String intToRoman(int num) {
        int a, b, c, d;
        d = num % 10;
        c = (num / 10) % 10;
        b = (num / 100) % 10;
        a = (num / 1000) % 10;
        String ans = "";
        ans += repeat(a, "M");
        if (b != 0) {
            if (b == 4) ans += "CD";
            if (b == 9) ans += "CM";
            if (b < 4 && b > 0) ans += repeat(b, "C");
            if (b >= 5 && b < 9) ans = ans + "D" + repeat(b - 5, "C"); 
        }

        if (c != 0) {
            if (c == 4) ans += "XL";
            if (c == 9) ans += "XC";
            if (c < 4 && c > 0) ans += repeat(c, "X");
            if (c >= 5 && c < 9) ans = ans + "L" + repeat(c - 5, "X"); 
        }

        if (d != 0) {
            if (d == 4) ans += "IV";
            if (d == 9) ans += "IX";
            if (d < 4 && d > 0) ans += repeat(d, "I");
            if (d >= 5 && d < 9) ans = ans + "V" + repeat(d - 5, "I"); 
        }
        return ans;
    }

    public String repeat(int cnt, String s) {
        String ans = "";
        while (cnt-- > 0) ans += s;
        return ans;
    }
}