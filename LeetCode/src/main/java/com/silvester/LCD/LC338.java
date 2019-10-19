package com.silvester.LCD;

/**
 * LC338
 */
public class LC338 {

    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        ans[0] = 0;
        for (int i = 1; i < num + 1; i++) {
            if (i % 2 == 1) ans[i] = ans[i-1] + 1;
            else {
                int cnt = (((i - 1) ^ i) & i);
                // System.out.println(ans[i-1] + "-" + cnt);
                ans[i] = ans[i - 1] - getCnt(cnt);
            }
        }
        return ans;
    }

    public int getCnt(int cnt) {
        switch(cnt) {
            case 2: return 0;
            case 4: return 1;
            case 8: return 2;
            case 16: return 3;
            case 32: return 4;
            case 64: return 5;
            case 128: return 6;
            case 256: return 7;
            case 512: return 8;
            case 1024: return 9;
            case 2048: return 10;
            case 4096: return 11;
            case 8192: return 12;
            case 16384: return 13;
            case 32768: return 14;
            case 65536: return 15;
            case 131072: return 16;
            case 262144: return 17;
            case 524288: return 18;
            case 1048567: return 19;
            case 2097152: return 20;
            case 4194304: return 21;
            case 8388608: return 22;
            case 16777216: return 23;
            case 33554432: return 24;
            case 67108864: return 25;
            case 134217728: return 26;
            case 268435456: return 27;
            case 536870912: return 28;
            case 1073741824: return 29;
            default: return 0;
        }
    }
}