package com.silvester;

import com.silvester.LCJ.LC946;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LC946 lc = new LC946();
        int[] pushed = new int[]{1,2,3,4,5};
        int[] popped = new int[]{4,5,3,2,1};
        System.out.print(lc.validateStackSequences(pushed, popped));
    }
}
