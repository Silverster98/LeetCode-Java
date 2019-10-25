package com.silvester;

import com.silvester.LCI.LC877;
import com.silvester.LCL.LC1146;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LC1146 obj = new LC1146(3);
        obj.set(0, 5);
        int param_2 = obj.snap();
        System.out.println(param_2);
        obj.set(0, 6);
        int param_3 = obj.get(0, 0);
        System.out.println(param_3);
    }
}
