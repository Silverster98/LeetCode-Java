package com.silvester;

import com.silvester.LCK.LC1090;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LC1090 lc = new LC1090();
        int[] values = new int[]{9,8,8,7,6};
        int[] labels = new int[]{0,0,0,1,1};
        int num_wanted = 3;
        int use_limit = 2;
        System.out.print(lc.largestValsFromLabels(values, labels, num_wanted, use_limit));
    }
}
