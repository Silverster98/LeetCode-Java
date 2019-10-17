package com.silvester.LCE;

import java.util.Random;

/**
 * LC470
 */
public class LC470 {

    public int rand7() {
        return new Random().nextInt() % 7 + 1;
    }

    public int rand10() {
        int a = rand7();
        int b = rand7();

        int t = (a - 1) * 7 + b;

        while(t > 40) {
            a = rand7();
            b = rand7();
            t = (a - 1) * 7 + b;
        }
        return t % 10 + 1;
    }
}