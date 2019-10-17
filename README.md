# LeetCode-Java
> Solutions for LeetCode in Java Language

# App.java Description

App.java is the top Java file which includes a main function. In this function, you can test the program.

e.g.
```
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
```

# package Description

All programs are in the folder src.main.java.com.silvester.LCX, such as src.main.java.com.silvester.LCA.

LCA include the solutions of leetcode problems from No.1 to No.99.

LCB include the solutions of leetcode problems from No.100 to No.199.

LCC include the solutions of leetcode problems from No.200 to No.299.

...

# Author

ZanWang